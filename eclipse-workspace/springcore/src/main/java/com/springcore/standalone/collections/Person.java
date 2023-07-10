package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;

public class Person {
	private List<String> courses;
	private Map<String,String> channels;

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public Map<String,String> getChannels() {
		return channels;
	}

	public void setChannels(Map<String,String> channels) {
		this.channels = channels;
	}
	
}
