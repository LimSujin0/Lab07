package edu.handong.java.csee.prob2;

public class Chicken_main {

	public static void main(String[] args) {
		Chicken menu1 = new Chicken("Chesse_mustard", 16000.00, 5);
		Chicken menu2 = new Chicken("Honey_mustard", 16000.00, 4);
		Chicken menu3 = new Chicken("Spily_mustard", 17000.00, 1);
		
		menu1.set_stars(4);
		menu2.set_stars(2);
		menu3.set_stars(5);
		
		System.out.println(menu1.get_name() + "'s rating is " + menu1.get_stars());
		
	}

}
