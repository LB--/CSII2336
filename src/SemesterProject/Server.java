package SemesterProject;

import java.util.Arrays;

/**
 * Represents a restaurant server, e.g. a waiter or waitress.
 * Each server is aware of which tables they are responsible for.
 */
public class Server {
	/**
	 * The name of this server.
	 */
	private String name;
	/**
	 * The tables this server is responsible for.
	 */
	private int[] tables;

	/**
	 * Constructs this server from a name and their associated tables.
	 * @param name The name of this server.
	 * @param tables The list of tables this server is responsible for.
	 */
	public Server(String name, int[] tables){
		this.name = name;
		this.tables = tables;
	}

	/**
	 * Renames this server.
	 * @param name The new name of this server.
	 */
	public void setName(String name){
		this.name = name;
	}

	/**
	 * Returns this server's name.
	 * @return The name of this server.
	 */
	public String getName(){
		return name;
	}

	@Override
	public String toString(){
		return name + ", responsible for tables "+Arrays.toString(tables);
	}
}