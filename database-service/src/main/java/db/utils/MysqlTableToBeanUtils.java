package db.utils;

import db.viewbean.Column;
import db.viewbean.Table;
import db.dao.DBConnFactory;
import db.exception.SystemException;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author amos
 * @date 2017-09-29
 */
public class MysqlTableToBeanUtils{
    private static String projectPath = "/opt/amos/java/intellijapps/movie/database-service";

    public static void main(String[] args) {
        try (Connection conn = DBConnFactory.getMysqlConnection(DBUtils.getDBUser())) {
            Map<String, List<Column>> tableColumsMap = getColumns(conn).stream().collect(Collectors.groupingBy(column -> getKey(column.getTableSchema(), column.getTableName())));

            getSchemas(conn).forEach(schema -> {
                getTables(conn, schema).stream().forEach(table -> {

                    String key = getKey(table.getTableSchema(), table.getTableName());

                    List<Column> columns = tableColumsMap.get(key);

                    if (columns == null || columns.size() == 0) {
                        System.out.println(table);
                    } else {
                        StringBuilder fieldSb = new StringBuilder();
                        StringBuilder getMethodSb = new StringBuilder();
                        StringBuilder selectSqlSb = new StringBuilder("SELECT ");

                        fieldSb.append("/**").append(table.getTableComment()).append("\n*/\n");
                        fieldSb.append("public class ").append(getCapitalLetterName(table.getTableName())).append("{\n");

                        //                        Map<String, String> origCamelMap = new HashMap<>();
                        Map<String, String> dbTypeToJaveTypeMap = getDBTypeToJaveType();
                        boolean hasDate = false;
                        boolean hasSet = false;

                        List<Column> sortedColumns= columns.stream().sorted(Comparator.comparing(column -> column.getOrdinalPosition()))
                                .collect(Collectors.toList());

                        for (Column column : sortedColumns) {
                            String javaType = dbTypeToJaveTypeMap.get(column.getDataType());
                            if (javaType == null) {
                                System.out.println("no javaType1:" + column);
                            } else {
                                if (!hasDate && javaType.equals("Date")) {
                                    hasDate = true;
                                }
                                if (!hasSet && javaType.startsWith("Set")) {
                                    hasSet = true;
                                }

                                String camelName = getCamelName(column.getColumnName());

                                fieldSb.append("/**").append(column).append("*/\n");
                                fieldSb.append("private ").append(javaType).append(" ").append(camelName).append(";\n");
                                fieldSb.append("\n");

                                getMethodSb.append("public ").append(javaType).append(" get").append(getCapitalLetterName(column.getColumnName())).append("(){\n");
                                getMethodSb.append("return ").append(camelName).append(";\n");
                                getMethodSb.append("}\n");
                                getMethodSb.append("\n");

                                selectSqlSb.append(column.getColumnName()).append(" AS ").append(camelName).append(", ");
                            }
                        }

                        selectSqlSb.delete(selectSqlSb.length() - 2, selectSqlSb.length());

                        selectSqlSb.append(" FROM ").append(table.getTableSchema()).append(".").append(table.getTableName());

//                        sortedColumns.forEach(column -> {
//                            String javaType = dbTypeToJaveTypeMap.get(column.getDataType());
//                            if (javaType == null) {
//                                System.out.println("no javaType2:" + column);
//                            } else {
//
//                            }
//                        });

                        fieldSb.append(getMethodSb.toString());

                        fieldSb.append("}");

                        StringBuilder sb2 = new StringBuilder();

                        sb2.append("package db.bean.").append(table.getTableSchema().toLowerCase()).append(";\n");
                        sb2.append("\n");
                        if (hasDate) {
                            sb2.append("import java.util.Date;\n");
                        }
                        if (hasSet) {
                            sb2.append("import java.util.Set;\n");
                        }

                        sb2.append("\n");

                        sb2.append("/* ").append(selectSqlSb.toString()).append(" */\n");

                        sb2.append(fieldSb.toString());

                        writeToFile(projectPath + "/src/main/java/db/bean/" + table.getTableSchema().toLowerCase(), getCapitalLetterName(table.getTableName()) + ".java", sb2.toString());

                    }
                });
            });
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void writeToFile(String dirPath, String fileName, String content) {
        try {
            Path dirrPath = Paths.get(dirPath);
            if (!Files.exists(dirrPath)) {
                Files.createDirectories(dirrPath);
            }

            Path filePath = Paths.get(dirPath + "/" + fileName);

            FileWriter fileWriter = new FileWriter(filePath.toFile());
            fileWriter.write(content);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String getCapitalLetterName(String uppercaseJoinedByUnderscore) {
        String camelName = getCamelName(uppercaseJoinedByUnderscore);

        return Character.toUpperCase(camelName.charAt(0)) + camelName.substring(1);
    }

    static String getCamelName(String uppercaseJoinedByUnderscore) {
        String[] camelNameParts = uppercaseJoinedByUnderscore.toLowerCase().split("_");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < camelNameParts.length; i++) {
            if (i > 0) {
                sb.append(Character.toUpperCase(camelNameParts[i].charAt(0)) + camelNameParts[i].substring(1));
            } else {
                sb.append(camelNameParts[i]);
            }
        }

        return sb.toString();
    }

    static Map<String, String> getDBTypeToJaveType() {
        Map<String, String> dbTypeToJaveTypeMap = new HashMap<>();

        dbTypeToJaveTypeMap.put("char", "String");
        dbTypeToJaveTypeMap.put("varchar", "String");
        dbTypeToJaveTypeMap.put("tinytext", "String");
        dbTypeToJaveTypeMap.put("text", "String");
        dbTypeToJaveTypeMap.put("mediumtext", "String");
        dbTypeToJaveTypeMap.put("longtext", "String");
        dbTypeToJaveTypeMap.put("tinyint", "Integer");
        dbTypeToJaveTypeMap.put("smallint", "Integer");
        dbTypeToJaveTypeMap.put("mediumint", "Integer");
        dbTypeToJaveTypeMap.put("int", "Integer");
        dbTypeToJaveTypeMap.put("bigint", "Long");
        dbTypeToJaveTypeMap.put("float", "Float");
        dbTypeToJaveTypeMap.put("double", "Double");
        dbTypeToJaveTypeMap.put("decimal", "Double");
        dbTypeToJaveTypeMap.put("date", "Date");
        dbTypeToJaveTypeMap.put("datetime", "Date");
        dbTypeToJaveTypeMap.put("timestamp", "Date");
        dbTypeToJaveTypeMap.put("time", "Date");
        dbTypeToJaveTypeMap.put("enum", "Date");
        dbTypeToJaveTypeMap.put("blob", "String");
        dbTypeToJaveTypeMap.put("mediumblob", "String");
        dbTypeToJaveTypeMap.put("longblob", "String");
        dbTypeToJaveTypeMap.put("set", "Set<String>");

        return dbTypeToJaveTypeMap;
    }

    static String getKey(String schema, String tableName) {
        return String.format("%s_%S", schema, tableName);
    }

    static List<String> getSchemas(Connection conn) throws SQLException {
        Statement st = conn.createStatement();

        List<String> schemas = new LinkedList<>();
        ResultSet rs = st.executeQuery("show databases");
        while (rs.next()) {
            schemas.add(rs.getString(1));
        }

        st.close();

        return schemas;
    }

    static List<Table> getTables(Connection conn, String schema) {
        try {
            Statement stat = conn.createStatement();

            ResultSet rs = stat.executeQuery("SELECT * FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA='" + schema + "'");

            List<Table> tables = new LinkedList<>();
            while (rs.next()) {
                Table table = new Table();

                table.setTableCatalog(rs.getString("TABLE_CATALOG")); //TABLE_CATALOG   | varchar(512)
                table.setTableSchema(rs.getString("TABLE_SCHEMA"));// TABLE_SCHEMA  | varchar(64)
                table.setTableName(rs.getString("TABLE_NAME"));// TABLE_NAME      | varchar(64)
                table.setTableType(rs.getString("TABLE_TYPE"));//  TABLE_TYPE      | varchar(64)
                table.setEngine(rs.getString("ENGINE")); //ENGINE          | varchar(64)
                table.setVersion(rs.getLong("VERSION"));//VERSION         | bigint(21) unsigned
                table.setRowFormat(rs.getString("ROW_FORMAT"));// ROW_FORMAT      | varchar(10)         | YES  |     | NULL    |       |
                table.setTableRows(rs.getLong("TABLE_ROWS"));//TABLE_ROWS      | bigint(21) unsigned | YES  |     | NULL    |       |
                table.setAvgRowLength(rs.getLong("AVG_ROW_LENGTH"));//AVG_ROW_LENGTH  | bigint(21) unsigned | YES  |     | NULL    |       |
                table.setDataLength(rs.getLong("DATA_LENGTH"));// DATA_LENGTH     | bigint(21) unsigned | YES  |     | NULL    |       |
                table.setMaxDataLength(rs.getLong("MAX_DATA_LENGTH"));//MAX_DATA_LENGTH | bigint(21) unsigned | YES  |     | NULL    |       |
                table.setIndexLength(rs.getLong("INDEX_LENGTH"));//INDEX_LENGTH    | bigint(21) unsigned | YES  |     | NULL    |       |
                table.setDataFree(rs.getLong("DATA_FREE"));// DATA_FREE       | bigint(21) unsigned | YES  |     | NULL    |       |
                table.setAutoIncrement(rs.getLong("AUTO_INCREMENT"));//AUTO_INCREMENT  | bigint(21) unsigned | YES  |     | NULL    |       |
                table.setCreateTime(rs.getDate("CREATE_TIME"));//CREATE_TIME     | datetime            | YES  |     | NULL    |       |
                table.setUpdateTime(rs.getDate("UPDATE_TIME"));//UPDATE_TIME     | datetime            | YES  |     | NULL    |       |
                table.setCheckTime(rs.getDate("CHECK_TIME"));//CHECK_TIME      | datetime            | YES  |     | NULL    |       |
                table.setTableCollation(rs.getString("TABLE_COLLATION"));// TABLE_COLLATION | varchar(32)         | YES  |     | NULL    |       |
                table.setChecksum(rs.getLong("CHECKSUM"));//CHECKSUM        | bigint(21) unsigned | YES  |     | NULL    |       |
                table.setCreateOptions(rs.getString("CREATE_OPTIONS"));// CREATE_OPTIONS  | varchar(255)        | YES  |     | NULL    |       |
                table.setTableComment(rs.getString("TABLE_COMMENT"));// TABLE_COMMENT

                tables.add(table);
            }
            return tables;
        } catch (SQLException e) {
            throw new SystemException(e);
        }
    }

    static List<Column> getColumns(Connection conn) throws SQLException {
        Statement st = conn.createStatement();

        List<Column> schemas = new LinkedList<>();
        ResultSet rs = st.executeQuery("SELECT * FROM INFORMATION_SCHEMA.COLUMNS");
        while (rs.next()) {
            Column column = new Column();

            column.setTableCatalog(rs.getString("TABLE_CATALOG")); //TABLE_CATALOG            | varchar(512)        | NO   |     |         |       |
            column.setTableSchema(rs.getString("TABLE_SCHEMA"));// TABLE_SCHEMA             | varchar(64)         | NO   |     |         |       |
            column.setTableName(rs.getString("TABLE_NAME"));// TABLE_NAME               | varchar(64)         | NO   |     |         |       |
            column.setColumnName(rs.getString("COLUMN_NAME"));// COLUMN_NAME              | varchar(64)         | NO   |     |         |       |
            column.setOrdinalPosition(rs.getLong("ORDINAL_POSITION"));//ORDINAL_POSITION         | bigint(21) unsigned | NO   |     | 0       |       |
            column.setColumnDefault(rs.getString("COLUMN_DEFAULT"));//COLUMN_DEFAULT           | longtext            | YES  |     | NULL    |       |
            column.setIsNullable(rs.getString("IS_NULLABLE"));//IS_NULLABLE              | varchar(3)          | NO   |     |         |       |
            column.setDataType(rs.getString("DATA_TYPE"));//DATA_TYPE                | varchar(64)         | NO   |     |         |       |
            column.setCharacterMaximumLength(rs.getLong("CHARACTER_MAXIMUM_LENGTH"));//CHARACTER_MAXIMUM_LENGTH | bigint(21) unsigned | YES  |     | NULL    |       |
            column.setCharacterOctetLength(rs.getLong("CHARACTER_OCTET_LENGTH"));//CHARACTER_OCTET_LENGTH   | bigint(21) unsigned | YES  |     | NULL    |       |
            column.setNumericPrecision(rs.getLong("NUMERIC_PRECISION"));//NUMERIC_PRECISION        | bigint(21) unsigned | YES  |     | NULL    |       |
            column.setNumericScale(rs.getLong("NUMERIC_SCALE"));//NUMERIC_SCALE            | bigint(21) unsigned | YES  |     | NULL    |       |
            column.setDatetimePrecision(rs.getLong("DATETIME_PRECISION"));//DATETIME_PRECISION       | bigint(21) unsigned | YES  |     | NULL    |       |
            column.setCharacterSetName(rs.getString("CHARACTER_SET_NAME"));//CHARACTER_SET_NAME       | varchar(32)         | YES  |     | NULL    |       |
            column.setCollationName(rs.getString("COLLATION_NAME"));//COLLATION_NAME           | varchar(32)         | YES  |     | NULL    |       |
            column.setColumnType(rs.getString("COLUMN_TYPE"));//COLUMN_TYPE              | longtext            | NO   |     | NULL    |       |
            column.setColumnKey(rs.getString("COLUMN_KEY"));//COLUMN_KEY               | varchar(3)          | NO   |     |         |       |
            column.setExtra(rs.getString("EXTRA"));//EXTRA                    | varchar(30)         | NO   |     |         |       |
            column.setPrivileges(rs.getString("PRIVILEGES"));//PRIVILEGES               | varchar(80)         | NO   |     |         |       |
            column.setColumnComment(rs.getString("COLUMN_COMMENT"));//COLUMN_COMMENT           | varchar(1024)       | NO   |     |         |       |
            column.setGenerationExpression(rs.getString("GENERATION_EXPRESSION"));//GENERATION_EXPRESSION

            schemas.add(column);
        }

        st.close();

        return schemas;
    }
}
