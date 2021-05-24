package day2;

import java.util.Scanner;

public class Area_circle {

	public static void main(String[] args) {
		int i;
		double pi = 3.14, area;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter radius of circle:");
		i = s.nextInt();
		area = pi * i * i;
		System.out.println("Area of circle of radius " + i + " is " + area);
		s.close();
	}

}
