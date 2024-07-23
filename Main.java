import java.util.*;
class School
{
int s()
{
System.out.println("3");
}
}
class School1 extends School 
{
int s()
{
System.out.println("2");
}
}
class School2 extends School 
{
int s()
{
System.out.println("1");
}
}
class main
{
public static void main(String args[])
{
School1 Sc1 = new School1();
School2 Sc2 = new School2();
Sc1.s();
Sc2.s();
}
}