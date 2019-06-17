package backEndAssigment;

public class GoldCard extends CardAbstract{

	
	public GoldCard(String customerName, String jmbg, int turnover) {
		super(customerName, jmbg, turnover);
		setDiscRate();
	}
	
	public GoldCard() {
		super();
	}

	public GoldCard(String customerName, String jmbg) {
		super(customerName, jmbg);
		
	}

	@Override
	protected void setDiscRate() {
			discRate = 2.0 + (900 > turnover ? ((turnover / 100)) : (8.0));
		
		
	}

}
