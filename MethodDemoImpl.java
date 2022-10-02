package sep17th;

public class MethodDemoImpl {

	public static void main(String[] args) {

	MethodDemo obj = new MethodDemo();
	
	System.out.println("Result of addition = " + obj.getAddition(100, 100));
	System.out.println("Result of substraction = " + obj.getSubraction(100, 20));
	System.out.println("Result of multiplication = " + obj.getProduct(100, 20));
	System.out.println("Result of multiplication = " + obj.getDivQuotient(100, 20));
	System.out.println("Remainder of division = " + obj.getDivRemainder(101, 20));
	System.out.println(obj.myname);
		
	}

}
