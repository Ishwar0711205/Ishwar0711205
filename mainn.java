class cons
{
private int l,w;
int cons()
{
l=5;
w=5;
System.out.println("Length is : "+l+" Width is: "+w);
return l;
}
int cons(int l, int w)
{
System.out.println("Length is : "+l+" Width is: "+w);
return l;
}
}
class mainn
{
public static void main(String args[])
{
cons c1= new cons();
c1.cons();
cons c2= new cons();
c2.cons(2,6);
}
}