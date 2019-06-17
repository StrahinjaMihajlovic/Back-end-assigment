package backEndAssigment;

public class SilverCard extends CardAbstract{

	
	public SilverCard(String customerName, String jmbg, int turnover) {
		super(customerName, jmbg, turnover);
		setDiscRate();
	}

	public SilverCard(String customerName, String jmbg) {
		super(customerName, jmbg);
	}
	
	public SilverCard() {
		super();
	}
	
	@Override
	protected void setDiscRate() {
		if(turnover > 300) {
			discRate = 3.5;
		} else {
			discRate = 2.0;
		}
		
	}

}
