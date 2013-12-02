package SemesterProject;

/**
 * An activity in the restaurant.
 * @author Nicholas
 */
public abstract class Activity {
	/**
	 * The table this activity belongs to.
	 */
	private Table table;

	/**
	 * Constructs this activity from the given table.
	 * @param t The table this activity is associated with.
	 */
	public Activity(Table t){
		table = t;
	}

	/**
	 * Processes this activity.
	 * This method is implemented by deriving classes.
	 * @return ???
	 */
	public abstract void process();

	/**
	 * Retrieves the table associated with this activity.
	 * @return The table associated with this activity.
	 */
	public Table getTable(){
		return table;
	}

	/**
	 * Returns a human-readable string representing the state of this activity.
	 * This method is implemented by deriving classes.
	 * @return A human-readable string representing the state of this activity.
	 */
	public abstract String toString();
}
