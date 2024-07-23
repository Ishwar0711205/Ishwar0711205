public class pattern2 {

    public static void pattern(int a ,int b){
    int n;
//        for( int i =1;i<=a;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//    }

        for( int i =1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if( i<=j) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        int c;
        pattern(4 ,4);
    }
}
