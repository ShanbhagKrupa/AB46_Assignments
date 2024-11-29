package assignments;

public class A3_StaticMethodOverloading 
{

	static void addition(int a, int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
	static void addition(double a, double b)
	{
		double sum = a+b;
		System.out.println(sum);
	}
	static void addition(int a, double b)
	{
		double sum = a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args)
	{
		addition(10,20);
		addition(10.0,20.0);
		addition(10, 20.0);

	}

}
