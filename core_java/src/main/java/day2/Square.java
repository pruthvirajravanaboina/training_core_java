package day2;
import java.util.Scanner;
public class Square {

	public static void main(String[] args) {
		int x;
		Scanner y = new Scanner(System.in);
		System.out.println("Enter a number: ");
		x = y.nextInt();
		System.out.println("Square of "+x+" is "+(x*x));
		y.close();
	}

}
