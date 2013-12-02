package SemesterProject;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

public class Menu {
	/**
	 * Maps item names to information about the item.
	 */
	private Map<String, Item> items = new HashMap<>();

	/**
	 * Reads from menu.txt and generates a list of menu items.
	 * @throws IOException if there is an exception reading the file
	 */
	public Menu() throws IOException {
		try(Scanner in = new Scanner(new File("SemesterProject/menu.txt"))){
			while(in.hasNext()){
				String c = in.next();
				String n = in.next();
				double p = in.nextDouble();
				items.put(c, new Item(n, p));
			}
		}
	}
	
	/**
	 * Returns the item mapped to the given code.
	 * @param code the code of the item to get
	 * @return the item associated with the code
	 */
	public Item getItem(String code){
		return items.get(code);
	}

	@Override
	public String toString(){
		String r = "";
		for(Map.Entry<String, Item> e : items.entrySet()){
			r += e.getKey() + ": " + e.getValue();
		}
		return r;
	}
	
	public class Item {
		/**
		 * The name of this item.
		 */
		private String name;
		/**
		 * The cost of this item.
		 */
		private double price;

		/**
		 * Constructs this item from the given code, name, and price.
		 * @param n the name of this item
		 * @param p the price of this item
		 */
		public Item(String n, double p){
			name = n;
			price = p;
		}

		/**
		 * Sets item name
		 * @param n the name
		 */
		public void setName(String n){
			name = n;
		}

		/**
		 * Sets the price
		 * @param p the price
		 */
		public void setPrice(double p){
			price = p;
		}

		/**
		 * Returns the name
		 * @return the name
		 */
		public String getName(){
			return name;
		}

		/**
		 * Returns the price
		 * @return the price
		 */
		public double getPrice(){
			return price;
		}

		@override
		public String toString(){
			return n + ", costs $"+p;
		}
	}
}
