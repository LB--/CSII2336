package SemesterProject;

public class ServiceActivity extends Activity {
	public ServiceActivity(Restaurant r, int tableNum){
		super(r.tableFor(tableNum));
	}

	@Override
	public void process){
		getTable().service();
	}

	@Override
	public String toString(){
		return "Service";
	}
}
