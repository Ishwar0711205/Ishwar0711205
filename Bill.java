import java.util.*;
public class Bill {
    public static void main(String[] args) {
        int units;
        double bill =1.00;
        Scanner sc =new Scanner(System.in);
        units =sc.nextInt();
        if(units < 50){
            bill= units*3.50;
        }
         else if ((units >100 ) && (units<=150)) {
             bill =units*4.00;
        }
        else if ((units >150 ) && (units<=200)) {
            bill =units*4.25;
        }
        else if ((units >200 ) && (units<=250)) {
            bill =units*4.50;
        }
        else if ((units >250 ) && (units<=300)) {
            bill =units*4.75;
        }   else if (units >300){
            bill =units*6.00;
        }
        System.out.println( "the bill is :"+bill);



    }
}
