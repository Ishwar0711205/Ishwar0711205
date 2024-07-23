import java.util.*;
public class Pattern {
    public static void main(String[] args){
// int r,c;
      Scanner sc =new Scanner(System.in);

//        System.out.println("how many rows you want :" );
//        System.out.println("how many coloums you want :");
//        r=sc.nextInt();
//        c=sc.nextInt();

        for (int i=1; i<=4; i++){
            for (int j=1 ;j<=4;j++){
                if(i<=j) {
                    System.out.print("*" + "\t");
                }
            }
           System.out.println(" ");
        }
    }
}
