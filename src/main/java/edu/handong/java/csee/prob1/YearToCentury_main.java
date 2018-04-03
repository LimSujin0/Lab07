package edu.handong.java.csee.prob1;//package name

import java.util.Scanner;//import Scanner class

public class YearToCentury_main {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);//Instantiating the scanner
		int yr = 0; //this is variable named yr
		
		System.out.println("Input year: "); //print out this line on the monitor
		yr = keyboard.nextInt(); //get a integer variable from the user, and set yr to getting num.
		
		YearToCentury year = new YearToCentury(yr);
		System.out.println(yr + " is " + year.calc_century() + "th century. ");
		
	}

}
