package SemesterProject;

public class OrderActivity extends Activity {
	private Menu.Item[] items;

	public OrderActivity(Restaurant r, int tableNum, Menu.Item[] order){
		super(r.tableFor(tableNum));
		items = order;
	}

	@Override
	public void process(){
		//...
	}

	@Override
	public String toString(){
		//...
	}
}
