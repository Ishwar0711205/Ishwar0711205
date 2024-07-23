public class Methods_lec_30 {
    static int  logic(int x,int y){
        int z;
        if (x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }

//    int  logic(int x,int y){
//        int z;
//        if (x>y){
//            z=x+y;
//        }
//        else{
//            z=(x+y)*5;
//        }
//        return z;
//    }








    public static void main(String[]args){
        int a;
        int b;
        int c;
        a=3;
        b=4;
//
//        Methods_lec_30 obj = new Methods_lec_30();
//
//
//        c=obj.logic(a,b);

        c=logic(a,b);
//        if (a>b){
//            c=a+b;
//        }
//        else{
//            c=(a+b)*5;
//        }
//
        int a1;
        int b1;
        int c1;
        a1=6;
        b1=7;

//        c1=obj.logic(a1,b1);

        c1=logic(a1,b1);
//        if(a1>b1){
//            c1=a1+b1;
//
//        }
//        else{
//            c1=(a1+b1)*5;
//        }
        System.out.println(c);
        System.out.println(c1);
    }
}
