package assignments;

import java.util.Scanner;

public class A9_ScannerClass_AreaOfRectangle 
{

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the length of rectangle:" );
		double length = s1.nextDouble();
		System.out.print("Enter the breadth of rectangle:" );
		double breadth = s1.nextDouble();
		double area =   length* breadth;
		System.out.print("The area of rectangle is:" + area);
		

	}

}
