package org.movie.commons.utils.ini;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author liusr
 * @date 2016年9月30日
 */
public final class INIParser{
    private Path iniFilePath;

    private Charset encoding;

    private Map<String, Section> sectionMap;

    public INIParser(String parentPath, String... childrenPaths) {
        this(Paths.get(parentPath, childrenPaths));
    }

    public INIParser(Path iniFilePath) {
        this.iniFilePath = iniFilePath;
        this.encoding = Charset.forName("UTF-8");
    }

    public Map<String, Section> getAll() throws IOException {
        if(sectionMap == null){
            sectionMap = parse();
        }

        return sectionMap;
    }

    public Map<String, Section> parse() throws IOException {
        Map<String, Section> tmpIniMap = new LinkedHashMap<>();

        List<String> contents = Files.readAllLines(iniFilePath, encoding);

        int size = contents.size();

        String lastSectionName = "global";

        for(int i = 0; i < size; i++){
            String tmpStr = removeComments(contents.get(i));
            if(tmpStr.length() == 0){
                continue;
            }

            int sectionStart = tmpStr.indexOf("[");
            if(sectionStart >= 0){
                int sectionEnd = tmpStr.indexOf("]");

                if(sectionEnd >= 0){
                    lastSectionName = tmpStr.substring(sectionStart + 1, sectionEnd);
                }

                continue;
            }

            int equalIdx = tmpStr.indexOf("=");
            String key = null, value = null;
            if(equalIdx >= 0){
                key = tmpStr.substring(0, equalIdx);
                value = tmpStr.substring(equalIdx + 1);
            }else{
                key = tmpStr;
            }

            Section section = tmpIniMap.get(lastSectionName);
            if(section == null){
                section = new Section(lastSectionName);

                tmpIniMap.put(lastSectionName, section);
            }

            if(section.getProperties() == null){
                section.setProperties(new LinkedHashMap<>());
            }

            section.getProperties().put(key, new SectionProperty(key, value));
        }

        return Collections.unmodifiableMap(tmpIniMap);
    }

    private String removeComments(String origStr) {
        if(origStr.contains("#")){
            return origStr.substring(0, origStr.indexOf("#")).trim();
        }else{
            return origStr;
        }
    }

    public static void main(String[] args) throws IOException {
        INIParser parser = new INIParser("/opt/amos/java/intellijapps/movie/movie-commons/src/main/resources/config.ini");

        Map<String, Section> map = parser.getAll();

        for(Entry<String, Section> e : map.entrySet()){
            System.out.println(e.getValue());
        }

    }
}
