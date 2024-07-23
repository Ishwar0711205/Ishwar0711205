import java.util.*;
public class TwoDArray {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int rows = sc.nextInt();
        int colu = sc.nextInt();

        int [][] numbers=new int[rows][colu];
//
//        //for gitting input
////        //rows
//        //            for colums
//        for (int i=0;i<rows;i++) {
//            for (int j = 0; j < colu; j++) {
//                numbers[i][j] = sc.nextInt();
//            }
//        }
//
////        for output
//        for (int i=0;i<rows;i++){
////            for colums
//            for (int j=0;j<colu;j++){
//                System.out.print(numbers[i][j] + " ");
//            }
//            System.out.println();
//        }



        for (int i=0;i<rows;i++) {
            for (int j = 0; j < colu; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter no you want to find" +
                "");
        int x= sc.nextInt();
        for (int i=0;i<rows;i++) {
            for (int j = 0; j < colu; j++) {
                if (numbers[i][j] ==x){
                    System.out.println("numner found at location "+ i+","+j);
                }
            }
        }

    }
}
