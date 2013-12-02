package SemesterProject;

public class Table {
	/**
	 * The label for this table.
	 */
	private String label;
	/**
	 * The status of this table.
	 */
	private Status status;
	/**
	 * The size of the party seated at this table.
	 */
	private int party = 0;

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
	 * ...
	 */
	public void seatParty(int partySize) throws IllegalStateException {
		if(status == Status.Ready){
			party = partySize;
			setStatus(Status.Ordering);
		}
		else throw new IllegalStateException("Cannot seat party while table has status "+status);
	}
	/**
	 * ...
	 */
	public void service() throws IllegalStateException {
		if(status == Status.Waiting){
			setStatus(Status.Eating);
		}
		else if(status == Status.Dirty){
			setStatus(Status.Ready);
		}
		else throw new IllegalStateException("Cannot service table while table has status "+status);
	}

	@Override
	public String toString(){
		return label+"("+status+")";
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
		 * The table is occupied and in the process of ordering.
		 */
		Odering,
		/**
		 * The table has ordered and is waiting to be serviced.
		 */
		Waiting,
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
