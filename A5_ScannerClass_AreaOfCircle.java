package assignments;

import java.util.Scanner;

public class A5_ScannerClass_AreaOfCircle
{
	final static double pi=3.14;
	public static void main(String[] args)
	{
		
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the radius of circle:" );
		double radius = s1.nextDouble();
		double area = pi * radius* radius;
		System.out.print("The area of circle is:" + area);

	}

}
