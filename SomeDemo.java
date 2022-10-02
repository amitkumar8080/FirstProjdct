package sep17th;

public class SomeDemo {

	int y = 200; // instance variable

	static int z = 500; // static variable

	public static void main(String[] args) {

		int x = 100; // local variable

		System.out.println("local variable one " + x);

		SomeDemo objj = new SomeDemo();
		System.out.println("instance variable two " + objj.y);

		System.out.println("Value of static variable three " + SomeDemo.z);

		SomeDemo obj = new SomeDemo(); // instantiation

		System.out.println("instance variable four " + obj.y);

		obj.y = 888;
		System.out.println("instance variable five " + obj.y);

		System.out.println(" instance variable with anonymous object " + new SomeDemo().z);

		SomeDemo obj1 = new SomeDemo();

		System.out.println("instance variable " + obj1.y);

		System.out.println(obj.z);
		System.out.println(obj1.z);

		obj.z = 1000;

		System.out.println(obj.z);
		System.out.println(obj1.z);

	}

}
