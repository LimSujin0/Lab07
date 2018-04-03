package edu.handong.java.csee.prob2;//this is package name

/**
 * This is class named Chicken_main
 * This program is print out each menu's name and rating
 * Enjoy my program!
 * @author imsuj
 *
 */
public class Chicken_main {
	
	/**
	 * This is a main method of Chicken_main class
	 * This main method prints out chicken's rating
	 * @param args
	 */
	public static void main(String[] args) {
		Chicken menu1 = new Chicken("Chesse_mustard", 16000.00, 5);//instantiating Chicken class( menu1)
		Chicken menu2 = new Chicken("Honey_mustard", 16000.00, 4);//instantiating Chicken class( menu2)
		Chicken menu3 = new Chicken("Spily_mustard", 17000.00, 1);//instantiating Chicken class( menu3)
		
		menu1.set_stars(3);//set the menu1's stars to 3
		menu2.set_stars(4);//set the menu2's stars to 4
		menu3.set_stars(1);//set the menu3's stars to 1
		
		System.out.println(menu1.get_name() + "'s rating is " + menu1.get_stars());//print out the menu1's rating
		System.out.println(menu2.get_name() + "'s rating is " + menu2.get_stars());//print out the menu2's rating
		System.out.println(menu3.get_name() + "'s rating is " + menu3.get_stars());//print out the menu3's rating
	}
}
