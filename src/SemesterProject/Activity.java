package SemesterProject;

/**
 * An activity in the restaurant.
 * @author Nicholas
 */
public abstract class Activity
{
	/**
	 * The name of the activity.
	 */
	private String name;
	/**
	 * The server responsible for this activity
	 */
	private Server server;
	/**
	 * The table this activity belongs to.
	 */
	private Table table;
	/**
	 * ???
	 */
	private char party;

	/**
	 * Default constructor, does nothing.
	 */
	public Activity()
	{
	}

	/**
	 * Processes this activity.
	 * This method is implemented by deriving classes.
	 * @return ???
	 */
	public abstract double processActivity();

	/**
	 * Sets the name of this activity.
	 * @param n The new name for this activity.
	 */
	public void setName(String n)
	{
		name = n;
	}
	/**
	 * Sets the server responsible for this activity.
	 * @param s The new server responsible for this activity.
	 */
	public void setServer(Server s)
	{
		server = s;
	}
	/**
	 * Sets the table associated with this activity.
	 * @param t The new table associated with this activity.
	 */
	public void setTable(Table t)
	{
		table = t;
	}
	/**
	 * ???
	 * @param p ???
	 */
	public void setPary(char p)
	{
		party = p;
	}

	/**
	 * Retrieves the name of this activity.
	 * @return The name of this activity.
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * Retrieves the server responsible for this activity.
	 * @return The server responsible for this activity.
	 */
	public Server getServer()
	{
		return server;
	}
	/**
	 * Retrieves the table associated with this activity.
	 * @return The table associated with this activity.
	 */
	public Table getTable()
	{
		return table;
	}
	/**
	 * ???
	 * @return ???
	 */
	public char getParty()
	{
		return party;
	}

	/**
	 * ???
	 * This method is implemented by deriving classes.
	 * @return ???
	 */
	public abstract String getMessage(char c);

	/**
	 * Returns a human-readable string representing the state of this activity.
	 * This method is implemented by deriving classes.
	 * @return A human-readable string representing the state of this activity.
	 */
	public abstract String toString();
}
