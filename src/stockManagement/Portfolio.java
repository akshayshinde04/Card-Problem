package stockManagement;

import java.util.Scanner;

public class Portfolio {

	public String userinput() {	
		Scanner scanData = new Scanner(System.in);
		System.out.println("Enter the Stock Name");
		String stringInput = scanData.nextLine();
		return stringInput;
	}
	
	public int userinputInt() {
		Scanner scanData = new Scanner(System.in);
		System.out.println("Enter the Value of Stock");
		int stringInput = scanData.nextInt();
		return stringInput;
	}
	
	public int userinputInt2() {
		Scanner scanData = new Scanner(System.in);
		System.out.println("Enter total No of shares");
		int stringInput = scanData.nextInt();
		return stringInput;
	}
	
	//public int userinput3() {
		//System.out.println("Total Value of Your Shares");
		//int totalValue = 
	//}
}

