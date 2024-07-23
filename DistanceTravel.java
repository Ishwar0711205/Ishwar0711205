import java.util.*;
public class DistanceTravel {
    public static void main(String[] args) {
        int t;
        double s,a,u;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter intial velocity and acceleration:");
        u=sc.nextDouble();
        a=sc.nextDouble();

        for(t=1;t<=20;t++){
            s=u*t+(0.5*a*t*t);
            System.out.println(t+ "    "+s);
        }
    }
}
