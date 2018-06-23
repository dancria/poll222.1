package com.briup.apps.poll.bean;

public class Course {
    private Long id;//大学可以为空置，包装技术类型
    private String name;
    private String description;
    private Integer period;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public Integer getPeriod() {
		return period;
	}
	public void setPeriod(Integer period) {
		this.period = period;
	}
	public static void main(String[] args) {
		
	}
    
}
