import java.util.*;
public class Switch_Case_01 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter button you want : ");
        int button=sc.nextInt();

        switch (button){

            case 1:
            System.out.println("Hello");
        break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("bonjour");
                break;
            default:
                System.out.println("invalid button");

        }
    }
}
