package SemesterProject;

public class OrderActivity extends Activity {
	private Menu.Item[] items;

	public OrderActivity(Restaurant r, int tableNum, Menu.Item[] orders){
		super(r.tableFor(tableNum));
		items = orders;
	}

	@Override
	public void process(){
		getTable().placeOrders(items);
	}

	@Override
	public String toString(){
		//...
	}
}
