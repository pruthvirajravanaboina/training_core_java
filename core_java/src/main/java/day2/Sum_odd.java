package day2;

public class Sum_odd {

	public static void main(String[] args) {
		int i, sum = 0;
		for (i = 1; i <= 100; i++)
		{
			if (i % 2 != 0)
			{
				sum = sum + i;
			}
		}
			System.out.println("Sum of odd numbers are: " + sum);

	}
}