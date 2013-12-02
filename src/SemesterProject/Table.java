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
	 * returns the label
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * sets the label
	 * @param label
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * returns the status
	 * @return the status
	 */
	public char getStatus() {
		return status;
	}

	/**
	 * sets the status
	 * @param status
	 */
	public void setStatus(char status) {
		this.status = status;
	}
}
