package org.gitsample;

public class Company {
	//Comment 1
	private String name;
	private String address;
	private String city;
	@Override
	public String toString() {
		return " [name=" + name + ", address=" + address + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
}
