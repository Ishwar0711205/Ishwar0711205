class parent
{
public int id=1;
String name = "XYZ Public School";
void printID()
{
System.out.println("School ID: "+this.id);
}
}
class child extends parent
{
int id=10;
void Schoolname()
{
System.out.println("School Name: "+super.name);
}
void printID()
{
System.out.println("Teacher ID: "+this.id);
super.printID();
}
public static void main(String args[])
{
child ob= new child();
ob.printID();
ob.Schoolname();
}
} 