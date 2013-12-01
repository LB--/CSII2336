package SemesterProject;

public class Server {
	
	private String name;
	private int [] listOfTables;
	
	
	/**
	 * 
	 * @param name of the the server
	 * @param list of the tables
	 */
	public Server(String name, int [] listOfTables){
		this.name = name;
		this.listOfTables = listOfTables;
	}
	
	/**
	 * Sets the name
	 * @param name
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * returns the name
	 * @return the name
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * Modifies name
	 */
	public String toString(){
		return name;
	}
}