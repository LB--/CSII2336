package SemesterProject;

public class Server {
	
	private String name;
	private int [] tables;
	
	
	/**
	 * 
	 * @param name of the the server
	 * @param list of the tables
	 */
	public Server(String name, int [] tables){
		this.name = name;
		this.tables = new int []{1, 2, 3, 4, 5, 6, 7, 8, 9, 
				10, 11, 12, 13, 14, 15, 16, 17, 18};
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