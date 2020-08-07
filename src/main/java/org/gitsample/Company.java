package org.gitsample;

public class Company {
	
	private String name;
	//Change 1
	
	private String city;
	private int salary;
	
	@Override
	public String toString() {
		return "Company [name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
}
