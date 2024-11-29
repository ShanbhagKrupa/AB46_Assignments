package assignments;

public class A2_Operators_NonstaticMethods {

	 void addition()
	{
		int a=100;
		int b=200;
		int add = a+b;
		System.out.println("The addition of 2 numbers is: " + add);
	}
	 void subtraction()
	{
	int a=100;
	int b=200;
	int sub = b-a;
	System.out.println("The subtraction of 2 numbers is: " + sub);
	}
	 void multiplication()
	{
		int a=100;
		int b=200;
		int mul = b*a;
		System.out.println("The multiplication of 2 numbers is: " + mul);
	}
	 void division()
	{
		int a=100;
		int b=200;
		int div = b/a;
		System.out.println("The division of 2 numbers is: " + div);
	}
	 void modulus()
	{
		int a=100;
		int b=202;
		int mod = b%a;
		System.out.println("The modulus/Remainder of 2 numbers is: " + mod);
	}
	
	public static void main(String[] args)
	{
		A2_Operators_NonstaticMethods n1 = new A2_Operators_NonstaticMethods();
		n1.addition();
		n1.subtraction();
		n1.multiplication();
		n1.division();
		n1.modulus();


	}

}
