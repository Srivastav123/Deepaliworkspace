package pkg1;

public class Child extends Parent
{
	public Child()
	{
		super(1,2);
		System.out.println("Default child constructor");
	}
	public Child(int a)
	{
		this (1,2);
		System.out.println("One parametrized child constructor");
	}
	public Child(int a, int b)
	{
		this (1,2,3);
		System.out.println("Two parametrized child constructor");
	}
	public Child(int a, int b, int c)
	{
		this();
		System.out.println("Three parametrized child constructor");
	}
	public static void main(String[] args) 
	{
		Child ob= new Child(1);
	}
}
