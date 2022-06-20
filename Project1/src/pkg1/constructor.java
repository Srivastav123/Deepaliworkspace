package pkg1;

public class constructor 

{
public constructor()
{System.out.println("Default constructor");}
public constructor(int a)
{System.out.println("One parametrized constructor");}
public constructor (int a, int b)
{System.out.println("Two parametized constructor");}
public constructor(int a, int b, int c)
{System.out.println("Three parametrized constructor");}
public static void main(String[] args) 
{
	constructor ob= new constructor();
	constructor ob1= new constructor(1);
	constructor ob2= new constructor(4,5);
	constructor ob3= new constructor(55,66,77);
}
}