package com.briup.apps.poll.bean;

public class Grade {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getSchool_id() {
		return school_id;
	}
	public void setSchool_id(Long school_id) {
		this.school_id = school_id;
	}
	private String description;
	private Long school_id;

}
