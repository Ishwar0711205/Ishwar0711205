class CLA
{
void palindrome()
{
int rev=0;
int og;
int n,r;
og=n;
n=Integer.parseInt(args[0]);
while (n!=0)
{
r= n%10;
rev=rev*10+r;
n = n/10;
}
if (og==n)
{
System.out.println("Palindrome");
}
else
{
System.out.println("Not palindrome");
}
}
}