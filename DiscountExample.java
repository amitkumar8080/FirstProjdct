package sep17th;

public class DiscountExample {

	public static void main(String[] args) {
		
		String A1 = "A1";
		String A2 = "A2";
		String A3 = "A3";
		
		int priceA = 200;
		int priceB = 80;
		int priceC = 150;
		
		int qA = 3;
		int qB = 5;
		int qC = 2;
		
		double discount = 0.15;
		double tax = 0.02;
		
		double TotalBill = ((priceA*qA) + (priceB*qB) + (priceC*qC));
		double FinalAmount = TotalBill - (TotalBill * discount)+ (TotalBill * tax);
		
		System.out.println("Total Price of purchased items = " + FinalAmount);
		
		
		

	}

}
