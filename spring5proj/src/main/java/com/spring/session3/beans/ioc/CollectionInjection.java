package com.spring.session3.beans.ioc;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionInjection {

	private Map<String, Object> map;
	private Properties props;
	private Set<String> set;
	private List<String> list;

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public void displayInfo() {
		System.out.println("Map contents:\n");
		map.entrySet().stream().forEach(e -> System.out.println("Key: " + e.getKey() + " - Value: " + e.getValue()));

		System.out.println("\nProperties contents:\n");
		props.entrySet().stream().forEach(e -> System.out.println("Key: " + e.getKey() + " - Value: " + e.getValue()));

		System.out.println("\nSet contents:\n");
		set.forEach(obj -> System.out.println("Value: " + obj));

		System.out.println("\nList contents:\n");
		list.forEach(obj -> System.out.println("Value: " + obj));
	}

}
