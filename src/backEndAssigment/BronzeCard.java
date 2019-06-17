package backEndAssigment;

public class BronzeCard extends CardAbstract{

	public BronzeCard(String customerName, String jmbg) {
		super(customerName, jmbg);
	}
	
	public BronzeCard(String customerName, String jmbg, int turnover) {
		super(customerName, jmbg, turnover);
		setDiscRate();
	}
	
	public BronzeCard() {
		super();
	}

	@Override
	protected void setDiscRate() {
		
		if(turnover < 100) {
			discRate = 0.0;
		}else if(turnover >= 100 && turnover <= 300) {
			discRate = 1.0;
		}else {
			discRate = 2.5;
		}
		
	}
	
}
