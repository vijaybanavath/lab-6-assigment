package proxyDesignPattern;

// concrete class is created for purchase class
public class PurchaseImplementation implements Purchase {

	@Override
	public void purchaseSoap(String soapName) {
		// display the purchase start message and call the end process method
		System.out.println("Purchase proces is started for " + soapName);
		endPurchase(soapName);
	}

	private void endPurchase(String soapName) {
		// display the purchase end method
		System.out.println("Purchase process is ended for " + soapName);
	}

}
