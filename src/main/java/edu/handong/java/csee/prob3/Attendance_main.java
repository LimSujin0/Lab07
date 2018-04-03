package edu.handong.java.csee.prob3;

import java.util.Random;
public class Attendance_main {

	public static void main(String[] args) {
		Attendance student1 = new Attendance("Jess", "4th grade", "21400999", 0);
		Attendance student2 = new Attendance("Kent", "2nd grade", "21700111", 0);
		Attendance student3 = new Attendance("Lucas", "1th grade", "21833222", 0);
		Attendance student4 = new Attendance("Martha", "2nd grade", "21733444", 0);
		
		Random rannum = new Random();
		student1.set_absence(rannum.nextInt(10));
		student2.set_absence(rannum.nextInt(10));
		student3.set_absence(rannum.nextInt(10));
		student4.set_absence(rannum.nextInt(10));
		
		student1.send_message();
		student2.send_message();
		student3.send_message();
		student4.send_message();
		
	}

}
