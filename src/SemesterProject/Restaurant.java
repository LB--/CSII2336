package SemesterProject;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Represents a restaurant with servers, tables, a menu, and activities.
 * @author Nicholas Braden
 */
public class Restaurant {
	/**
	 * The menu for this restaurant.
	 */
	private Menu menu = new Menu();
	/**
	 * Maps table numbers to instances of the Table class.
	 */
	private Map<Integer, Table> tables = new HashMap<>();
	/**
	 * Maintains a list of the Servers working at this restaurant.
	 */
	private List<Server> servers = new ArrayList<>();

	/**
	 * Initializes the servers, their tables,
	 * and the menu from configuration files.
	 * @throws IOException if an error occurs reading the configuration files.
	 */
	public Restaurant() throws IOException {
		try(Scanner in = new Scanner(new File("SemesterProject/servers.txt"))){
			while(in.hasNext()){
				Scanner line = new Scanner(in.nextLine());
				String name = line.next();
				List<Integer> t = new ArrayList<>();
				while(line.hasNextInt()){
					int n = line.nextInt();
					t.add(n);
					if(tables.get(n) == null)
					{
						tables.put(n, new Table("Table #"+n, Table.Status.Ready));
					}
				}
				int[] tarr = new int[t.size()];
				for(int i = 0; i < tarr.length; ++i){
					tarr[i] = t.get(i);
				}
				servers.add(new Server(name, tarr));
			}
		}
	}
}
