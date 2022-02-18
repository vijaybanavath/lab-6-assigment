package implementation;

import java.util.Scanner;
import proxyDesignPattern.Purchase;
import proxyDesignPattern.PurchaseProxy;

// driver class is created
public class SoapPurchaseProcess {

	public static void main(String[] args) {
		// required instance is created
		Scanner readInput = new Scanner(System.in);
		Purchase purchase = new PurchaseProxy();
		// repeat the process until user enters '-1'
		while (true) {
			// receiver soap name
			System.out.print("Enter the soap name or enter -1 to exit: ");
			String soapName = readInput.nextLine();
			if (soapName.equals("-1"))
				// when the user entered '-1' as input then break the loop
				break;
			// call the purchase soap method of proxy class
			purchase.purchaseSoap(soapName);
		}
		System.out.println("Program ends");
		// scanner is closed
		readInput.close();
	}

}
