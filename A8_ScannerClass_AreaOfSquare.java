package assignments;

import java.util.Scanner;

public class A8_ScannerClass_AreaOfSquare
{

	public static void main(String[] args)
	{
		
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the side of square:" );
		double side = s1.nextDouble();
		double area =   side* side;
		System.out.print("The area of square is:" + area);

	}

}
