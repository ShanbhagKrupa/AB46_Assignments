package assignments;

import java.util.Scanner;

public class A6_ScannerClass_CircleCircumference
{

	public static void main(String[] args) 
	{
		
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the radius of circle:" );
		double radius = s1.nextDouble();
		double circumference = 2*3.14 * radius;
		System.out.print("The area of circle is:" + circumference);

	}

}
