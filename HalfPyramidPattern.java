public class HalfPyramidPattern {
    public static void main(String args[]) {
        int n = 5;
//        int m = 4;
//pattern 1
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= m; j++) {
//                if (i == j || i>=j) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//
//                }
//
//            }
//


        //pattern 2
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //pattern 3
        //outer loop
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n-i; j++){
//                System.out.print(" ");
//            }
//                //inner loop
//
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }


//
        for(int i=1;i<=n;i++){
            for(int j=1 ;j<=n-i;j++ ){

                    System.out.print(j+" ");

            }
            System.out.println(" ");
        }



    }
}
