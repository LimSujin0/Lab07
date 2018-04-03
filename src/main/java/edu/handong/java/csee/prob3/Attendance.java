package edu.handong.java.csee.prob3;

public class Attendance {
	private String name;
	private String grade;
	private String id;
	private int absence;
	
	public Attendance(String name, String grade, String id, int absence) {
		this.name = name;
		this.grade = grade;
		this.id =id;
		this.absence = absence;
	}
	public void set_name(String name) {
		this.name = name;
	}
	
	public void set_grade(String grade) {
		this.grade = grade;
	}
	
	public void set_id(String id) {
		this.id = id;
	}
	
	public void set_absence(int absence) {
		this.absence = absence;
	}
	
	public String get_name() {
		return this.name;
	}
	
	public String get_grade() {
		return this.grade;
	}
	
	public String get_id() {
		return this.id;
	}
	
	public void send_message() {
		if(this.absence > 6) {
			System.out.println("I'm sorry, " + this.name + ". You failed this course");
		}
		else {
			System.out.println("We'll see about the grade," + this.name);
		}
	}	
	
}
