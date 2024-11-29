package assignments;

public class A1_StaticMethodsCall5
{

	static void name()
	{System.out.println("Krupa S");}
	static void apartment()
	{System.out.println("Natures Retreat");}
	static void city()
	{System.out.println("Bangalore");}
	static void state()
	{System.out.println("Karnataka");}
	static void pincode()
	{System.out.println("567765");}

	public static void main(String[] args)
	{
		System.out.println("Students Details:");
		System.out.print("Students Name:" );
		name();
		System.out.print("Address:" );
		apartment();
		city();
		state();
		pincode();
	}

}
