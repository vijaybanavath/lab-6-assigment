package proxyDesignPattern;

import java.util.ArrayList;

public class PurchaseProxy implements Purchase {
	// required variables are declared
	private PurchaseImplementation purchaseImpl = new PurchaseImplementation();
	private static ArrayList<String> purchaseList = new ArrayList<String>();

	@Override
	public void purchaseSoap(String soapName) {
		// check whether the soap purchased or not
		if (purchaseList.contains(soapName)) {
			// when the soap is purchased then display the message
			System.out.println("The soap " + soapName + " is already purchased");
		} else {
			// when the soap is not purchased then call the purchase soap method and the soap to purchased list
			purchaseImpl.purchaseSoap(soapName);
			purchaseList.add(soapName);
		}
	}

}
