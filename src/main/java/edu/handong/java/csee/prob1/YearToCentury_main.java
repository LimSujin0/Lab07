package edu.handong.java.csee.prob1;//package name

import java.util.Scanner;//import Scanner class
/**
 * This is a class named YearToCentury_main.
 * this class calculates the century given a year. 
 * @author imsuj
 *
 */
public class YearToCentury_main { //class named YearToCentury_main
	/**
	 * This is a main method of this class
	 * this main method receive user's input, year
	 * and print out the outcome on the monitor
	 * @param args
	 */
	public static void main(String[] args) { //main method in this program.
		Scanner keyboard = new Scanner(System.in);//Instantiating the scanner
		int yr = 0; //this is variable named yr
		
		System.out.println("Input year: "); //print out this line on the monitor
		yr = keyboard.nextInt(); //get a integer variable from the user, and set yr to getting num.
		
		YearToCentury year = new YearToCentury(yr);//instantiating YearToCentury class
		System.out.println(yr + " is " + year.calc_century() + "th century. ");//print out the outcome of the century.
		
	}

}
