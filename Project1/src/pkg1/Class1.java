package pkg1;

public class Class1 
{
	public Class1()
	{
	this(1,2,3);
	System.out.println("Default constructor");
	}
	public Class1(int a)
	{
	this(5,6);
	System.out.println("One parametrized constructor");
	}
	public Class1 (int a, int b)
	{
	this();
	System.out.println("Two parametized constructor");
	}
	public Class1(int a, int b, int c)
	{
		System.out.println("Three parametrized constructor");
		}
	public Class1(int a, int b, int c, int d)
	{
		this(1);
		System.out.println("Four parametrized constructor");
		}
	public static void main(String[] args) 
	{
		Class1 ob= new Class1(1,2,3,4);
	}
	}
