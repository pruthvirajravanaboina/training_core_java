package day2;

public class Variable {
	// variable inside class is known as global variable
	long i; // instance variable
	static long j; // class variable

	public static void main(String[] args) {
		// variable inside a method/function is known as local variable
		float k = 10;
		System.out.println(k);

		// since i want to access global variable i which is non static inside static
		// void main
		// so i have to create object of Variable class
		Variable v = new Variable(); // create object of class Variable
		System.out.println(v.i);

		System.out.println(j);
	}
}
