package assignments;

public class A4_MethodOverloading_NonStatic {

	
	static void addition()
	{
		int a=100;
		int b=200;
		int sum = a+b;
		System.out.println(sum);
	}
	
	 static void addition(int a, int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
	 
	 static void addition(boolean b, String c, char d)
		{
			System.out.println("My Name is: " + c);
		}
	 
	 void addition(double a, double b)
	{
		double sum = a+b;
		System.out.println(sum);
	}
	 void addition(int a, double b)
	{
		double sum = a+b;
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		addition(10,20);
		A4_MethodOverloading_NonStatic m1 = new A4_MethodOverloading_NonStatic();
		
		m1.addition(10.0,20.0);
		m1.addition(10, 20.0);
		addition(true, "Krupa", 'K');
		addition();

	}

}
