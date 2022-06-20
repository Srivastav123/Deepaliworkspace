package pkg1;

public class Parent 
{
public Parent()
{
	this(1,2,3);
	System.out.println("Default parent constructor");
}
public Parent(int a)
{
	this ();
	System.out.println("One parametrized parent constructor");
}
public Parent(int a, int b)
{
	this (1);
	System.out.println("Two parametrized parent constructor");
}
public Parent(int a, int b, int c)
{
	System.out.println("Three parametrized parent constructor");
}
public static void main(String[] args) 
{
	Parent ob= new Parent(1,2);
}
}
