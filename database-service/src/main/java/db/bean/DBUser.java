package db.bean;

/**
 * @author amos
 * @date 2017-09-24
 */
public class DBUser{
    private String host;
    private int port;
    private String schema;
    private String userName;
    private String password;

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "DBUser{" + "host='" + host + '\'' + ", port=" + port + ", schema='" + schema + '\'' + ", userName='" + userName + '\'' + ", password='" + password + '\'' + '}';
    }
}
