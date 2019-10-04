package com.deepesh.pojo;

public class Student {
	
	private int empid;
	private String name;
	private String mobile;
	private int age;
	private Address address;
	
	public Student() {
		super();
	}
	public Student(int empid, String name, String mobile, int age, Address address) {
		super();
		this.empid = empid;
		this.name = name;
		this.mobile = mobile;
		this.age = age;
		this.address = address;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [empid=" + empid + ", name=" + name + ", mobile=" + mobile + ", age=" + age + ",\n address ["
				+ address + "]";
	}
	
	
	
	
}
