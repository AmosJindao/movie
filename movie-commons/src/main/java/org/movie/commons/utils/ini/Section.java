package org.movie.commons.utils.ini;

import java.util.Map;

/**
 * @author liusr
 *
 * @date 2016年9月30日
 */
public class Section {
	private String name;
	private Map<String, SectionProperty> properties;
	
	public Section(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, SectionProperty> getProperties() {
		return properties;
	}
	public void setProperties(Map<String, SectionProperty> properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Section [name=" + name + ", properties=" + properties + "]";
	}
}
