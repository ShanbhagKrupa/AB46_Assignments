package assignments;

import java.util.Scanner;

public class A7_ScannerClass_AreaOfTriangle
{

	public static void main(String[] args) 
	{
		
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the base of traingle:" );
		double base = s1.nextDouble();
		System.out.print("Enter the height of traingle:" );
		double height = s1.nextDouble();
		
		double Area = 0.5*base*height;
		System.out.print("The area of triangle is:" + Area);

	}

}
