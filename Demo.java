import java.util.*;
class Adder
{
void add()
{
int a,b,c;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=a+b;
System.out.println("Addition of "+a+","+b+"="+c);
}
void add(int a,int b)
{
System.out.println("Addition of "+a+","+b+"="+a+b);
}
void add(double a,double b)
{
System.out.println("Addition of "+a+","+b+"="+a+b);
}
}
class Demo
{
public static void main (String args[])
{
Adder c1=new Adder();
c1.add();
c1.add(1,2);
c1.add(1.2,2.3);
}
}