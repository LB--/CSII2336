package SemesterProject;

public class Table {
	private String label;
	private Status status;

	/**
	 * 
	 * @param label of the table
	 * @param status of the table
	 */
	public Table(String label, Status status) {
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
	public Status getStatus() {
		return status;
	}

	/**
	 * sets the status
	 * @param status
	 */
	public void setStatus(Status status) {
		this.status = status;
	}

	/**
	 * Represents the status of a table.
	 */
	public static enum Status
	{
		/**
		 * The table is unoccupied and is clean.
		 */
		Ready,
		/**
		 * The table s occupied and in the process of ordering.
		 */
		Odering,
		/**
		 * The table is waiting for food and/or eating.
		 */
		Eating,
		/**
		 * The table is unoccupied and requires cleaning.
		 */
		Dirty;
	}
}
