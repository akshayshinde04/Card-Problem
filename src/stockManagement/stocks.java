package stockManagement;

public class stocks {
	
	public static void main(String[] args) {
		Portfolio port = new Portfolio();
		String stockName = port.userinput();
		System.out.println(" Stock Name :"+ stockName );
		int noOfValue = port.userinputInt();
		System.out.println("Stock Value :"+ noOfValue );
		int noOfStock = port.userinputInt2();
		System.out.println("Total no Of Stock :"+ noOfStock );
		
		System.out.println("Total value of Your Shares : " + noOfValue*noOfStock);		
	}
}
