package SemesterProject;

public class Table {

	private String label;
	private char status;

	/**
	 * 
	 * @param label of the table
	 * @param status of the table
	 */
	public Table(String label, char status) {
		this.label = label;
		this.status = status;
	}

	/**
	 * 
	 * @return
	 */
	public String getLabel() {
		return label;
	}
	
	/**
	 * 
	 * @param label
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * 
	 * @return
	 */
	public char getStatus() {
		return status;
	}
		
	/**
	 * 
	 * @param status
	 */
	public void setStatus(char status) {
		this.status = status;
	}
}
