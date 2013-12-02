package SemesterProject;

public class CheckActivity extends Activity {
	public CheckActivity(Restaurant r, int tableNum){
		super(r.tableFor(tableNum));
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
