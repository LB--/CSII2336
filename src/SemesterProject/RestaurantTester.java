package SemesterProject;

import java.util.Scanner;

/**
 * CS2336 Semester Project
 * by Raul & Nicholas
 * rig130030
 * ngb130030
 */
public class RestaurantTester {
	private static Restaurant r;
	/**
	 * Tests out the functionality of the restaurant.
	 * @param args Ignored.
	 */
	public static void main(String[] args){
		System.out.println("Welcome to Raul & Nick's Italian JDK7 Restaurant");

		Scanner in = new Scanner(System.in);
		MainLoop: while(true){
			System.out.println();
			System.out.println("************************");
			System.out.println("1. Display Menu");
			System.out.println("2. Display Servers List");
			System.out.println("3. Restaurant Activities");
			System.out.println("4. Quit");
			System.out.println("************************");
			System.out.print("Enter choice: ");
			switch(in.nextInt()){
				case 1: { //menu
					System.out.println(r.getMenu());
				} break;
				case 2: { //servers
					System.out.println();
					r.printServers(System.out);
				} break;
				case 3: { //activities
					System.out.println();
					ActivityLoop: while(true) {
						System.out.println("**********************");
						System.out.println("1. Restaurant activity");
						System.out.println("2. Quit");
						System.out.println("**********************");
						System.out.print("Enter choice: ");
						switch(in.nextInt()){
							case 1: { //activity
								System.out.print("Enter activity: ");
								Scanner act = new Scanner(in.nextLine());
								//...
							} break;
							case 2: break ActivityLoop; //quit
							default: conditnue ActivityLoop; //invalid
						}
					}
				} break;
				case 4: break MainLoop; //quit
				default: continue MainLoop; //invalid
			}
		}
	}
}
 