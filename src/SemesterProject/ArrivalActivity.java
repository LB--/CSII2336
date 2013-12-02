package SemesterProject;

public class ArrivalActivity extends Activity {
	private int party;

	public ArrivalActivity(Restaurant r, int tableNum, int partySize){
		super(r.tableFor(tableNum));
		party = partySize;
	}

	@Override
	public void process(){
		getTable().seatParty(party);
	}

	@Override
	public String toString(){
		//...
	}
}
