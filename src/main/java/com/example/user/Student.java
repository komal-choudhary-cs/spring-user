package com.example.user;






public class Student {
	private String name;
	private int rollno;

	
	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public Student() {
		super();
	}
	public void displayStudnetInfo() {
		System.out.println("Name of student is "+ name + "and the rollno is "+rollno);
	}
	public static void main(String[] args) {
		Student s = new Student("a", 1);

	}

}
