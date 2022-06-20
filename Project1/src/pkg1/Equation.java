package pkg1;

public class Equation 
{
public int add(int x, int y, int z)
{
int addresult= x+y;
int addresult1 = addresult +z;
return addresult1;
}
public int sub(int addresult1, int p)
{
int subresult = addresult1 - p;
return subresult;
}
public int mult(int subresult, int q)
{
int multresult = subresult*q;
return multresult;
 }
public void div(int multresult)
{
int result;
}

public static void main(String[]args) 
{
Equation ob= new Equation();
int addresult1= ob.add(10, 2, 2);
int subresult= ob.sub(addresult1, 2);
int multresult= ob.mult(subresult, 2);
ob.div(multresult);
int result= multresult/2;
System.out.println("Final result is "+result);
}
}