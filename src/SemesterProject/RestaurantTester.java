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
								int table = Integer.parseInt(act.next().substring(1));
								String command = act.next();
								switch(command.charAt(0)){
									case 'P': { //seat party
										int party = Integer.parseInt(command.substring(1));
										r.process(new ArrivalActivity(r, table, party));
									} break;
									case 'S': { //service
										r.process(new ServiceActivity(r, table));
									} break;
									case 'C': { //checkout
										r.process(new CheckActivity(r, table));
									} break;
									case 'O': { //place order
										List<Menu.Item> order = new ArrayList<>();
										while(act.hasNext()){
											order.add(r.getMenu().getItem(act.next()));
										}
										r.process(new OrderActivity(r, table, (Menu.Item[])order.toArray(new Menu.Item[0])));
									} break;
									default: continue ActivityLoop; //invalid
								}
							} break;
							case 2: break ActivityLoop; //quit
							default: continue ActivityLoop; //invalid
						}
					}
				} break;
				case 4: break MainLoop; //quit
				default: continue MainLoop; //invalid
			}
		}
	}
}
 