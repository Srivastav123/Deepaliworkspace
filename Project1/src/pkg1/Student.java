package pkg1;

public class Student 
{
int rollno= 21;
int age =27;
public void display1()
{System.out.println("Roll 21 name is abc");}
public void display2()
{System.out.println("abc age is 27");}
public static void main(String[] args) 
{
	Student ob = new Student();
	ob.display1();
	ob.display2();
	System.out.println(ob.rollno);
	System.out.println(ob.age);
}
}
