import java.util.*;
interface Name 
{
    void Name();
}

interface ID 
{
    void ID();
}

class employee implements Name, ID 
{
    public void Name() 
    {
        String n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        n= sc.nextLine();
        System.out.println("Name: "+n);
    }

    public void ID() 
    {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID");
        i= sc.nextLine();
        System.out.println("Employee ID: "+i);
    }
}

public class MI 
{
    public static void main(String[] args) {
        employee c = new employee();
        c.Name();
        c.ID();
    }
}
