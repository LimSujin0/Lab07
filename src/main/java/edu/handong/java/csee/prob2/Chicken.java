package edu.handong.java.csee.prob2;//package name

/**
 * This is a public class named chicken
 * This class define the variables and methods needed to this program
 * @author imsuj
 *
 */
public class Chicken {
	private String name;//this is a sting type variable named name
	private double price;//this is a double type variable named price 
	private int stars;//this is a integer type variable named stars
	
	/**
	 * This is a public method named chicken
	 * This method Initialize the variables(name, price, stars) 
	 */
	public Chicken() {
		this.name = " ";//set name to " "(blank)
		this.price = 0.0;//set price to 0.0
		this.stars = 0;//set stars to 0
	}
	
	/**
	 * This is a method named Chicken
	 * this method sets the variables to parameters' value
	 * @param name
	 * @param price
	 * @param stars
	 */
	public Chicken(String name, double price, int stars) {
		this.name = name;//set name to parameter's value
		this.price = price;//set price to parameter's value
		this.stars = stars;//set stars to parameter's value
	}
	
	/**
	 * This is getter method named get_name
	 * this getter method returns value of private member name
	 * @return
	 */
	public String get_name() {
		return this.name;//returns value of private member name
	}
	
	/**
	 * This is getter method named get_price
	 * this getter method returns value of private member price
	 * @return
	 */
	public double get_price() {
		return this.price;//returns value of private member price
	}
	
	/**
	 * This is a getter method named get_stars
	 * This getter method returns value of private member stars
	 * @return
	 */
	public int get_stars() {
		return this.stars;//returns value of private member stars
	}
	
	/**
	 * This is a setter method named set_name
	 * this method puts the value to private member name
	 * @param name
	 */
	public void set_name(String name) {
		this.name = name;//puts the value to private member name
	}
	
	/**
	 * This is a setter method named set_price
	 * this method puts the value of private member price
	 * @param price
	 */
	public void set_price(double price) {
		this.price = price;//puts the value of private member price
	}
	
	/**
	 * This is a setter method named set_stars
	 * this method puts the value of private member stars
	 * @param stars
	 */
	public void set_stars(int stars) {
		this.stars = stars;//puts the value of private member stars
	}
}
