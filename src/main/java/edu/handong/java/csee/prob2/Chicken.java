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
	 * This is a mehotd named Chicken
	 * @param name
	 * @param price
	 * @param stars
	 */
	/*public Chicken(String name, double price, int stars) {
		this.name = name;
		this.price = price;
		this.stars = stars;
	}*/
	
	public String get_name() {
		return this.name;
	}
	
	public double get_price() {
		return this.price;
	}
	
	public int get_stars() {
		return this.stars;
	}
	
	public void set_name(String name) {
		this.name = name;
	}
	
	public void set_price(double price) {
		this.price = price;
	}
	
	public void set_stars(int stars) {
		this.stars = stars;
	}
	
	
}
