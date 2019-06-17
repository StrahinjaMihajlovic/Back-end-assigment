package backEndAssigment;

class PayDesk{
	
	public static double discountRate(CardAbstract card) {
		return card.getDiscRate();
	}
	
	public static double discount(CardAbstract card, int valueOfPurchase) {
		return card.calculateDiscount(valueOfPurchase);
			
		}
	
	public static double totalPurchaseValue(CardAbstract card, int valueOfPurchase) {
		return valueOfPurchase - discount(card, valueOfPurchase);
		
	}
}


public class Main {

	public static void main(String[] args) {
		// example code
		int[] purchaseValue = {150, 850 , 1300};
		CardAbstract[] allCards = {new BronzeCard("John", "121", 0), 
				new SilverCard("Anna", "298", 600), 
				new GoldCard("Marco", "9821", 1500)};
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("Purchase value: %.2f%n",(double)purchaseValue[i]);
			System.out.printf("Discount rate: %.1f%n", PayDesk.discountRate(allCards[i]));
			System.out.printf("Discount: %.2f%n", PayDesk.discount(allCards[i], purchaseValue[i]));
			System.out.printf("Total: %.2f%n", 
					PayDesk.totalPurchaseValue(allCards[i], purchaseValue[i]));
		}

	}

}
