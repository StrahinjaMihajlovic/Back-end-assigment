package backEndAssigment;

public abstract class CardAbstract {
	protected String customerName, jmbg;
	protected Integer turnover;
	protected Double discRate;
	
	//default, (String, String) and (String, String, int) constructor
	protected CardAbstract() {
		turnover = 0;
		discRate = 0.0;
	}
	
	protected CardAbstract(String customerName, String jmbg) {
		this.customerName = customerName;
		this.jmbg = jmbg;
		turnover = 0;
		discRate = 0.0;
	}
	
	protected CardAbstract(String customerName, String jmbg, int turnover) {
		this.customerName = customerName;
		this.jmbg = jmbg;
		this.turnover = turnover;	
	}
	
	// standard getters and setters.
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getJmbg() {
		return jmbg;
	}
	
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	
	public Integer getTurnover() {
		return turnover;
	}
	
	public Double getDiscRate() {
		return discRate;
	}
	
	public void setTurnover(int turnover) {
		this.turnover = turnover;
		setDiscRate();
	}
	
	public double calculateDiscount(int valueOfPurchase) {
		return valueOfPurchase * (discRate/100);
	}
	
	// defined in derived classes and invoked by setTurnover setter.
	protected abstract void setDiscRate();
	
	
	
	
}
