package edu.handong.java.csee.prob1;//package name

/**
 * This is class named YearToCentury
 * this class defines variables, methods for the program
 * @author imsuj
 *
 */
public class YearToCentury {
	int year;//this is integer variable named year
	
	/**
	 * This is a public method named YearToCentry
	 * This class makes year's variable 0
	 */
	public YearToCentury() {
		year = 0;//set year to 0
	}
	
	/**
	 * this is a public method named YearToCentury
	 * this class sets year to value given from user 
	 * @param year
	 */
	public YearToCentury(int year) {
		this.year = year;//sets year to value given from user 
	}
	
	/**
	 * This is a public method named clac-century
	 * This method calculates a century about year
	 * @return
	 */
	public int calc_century() {
		if(year%100 == 0)//if year%100 == 0, (if year is fully divided by 100)
			year = year/100;//set century to year/100
		else {//if year is not fully divided by 100
			year = (year/100)+1;//set century to year 100+1
		}
		return year;
	}
}