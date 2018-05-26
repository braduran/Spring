package co.com.InjectingCollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollection {
	
	private List list;
	private Set set;
	private Map map;
	private Properties properties;
	
	public List getList() {
		System.out.println("List elements: " + this.list);
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public Set getSet() {
		System.out.println("Set elements: " + this.set);
		return set;
	}
	public void setSet(Set set) {
		this.set = set;
	}
	public Map getMap() {
		System.out.println("Map elements: " + this.map);
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	public Properties getProperties() {
		System.out.println("Properties elements: " + this.properties);
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
}
