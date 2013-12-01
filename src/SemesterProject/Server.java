package SemesterProject;

public class Server {
	
	private String name;
	
	
	/**
	 * 
	 * @param name of the the server
	 * @param ?
	 */
	public Server(String name, int [] numOfServers){
		this.name = name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public String toString(){
		return name;
	}
}
