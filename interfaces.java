//public class reversearray {
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 3, 6, 8, 9};
//        // Quick Quiz: Displaying the Array in Reverse order (for loop)
//        System.out.println("Printing using for loop in reverse order");
//        for (int i = array.length - 1; i >= 0; i--) {
//            System.out.println(array[i]);
//
//        }
//
//
//        // Quick Quiz: Displaying the Array in Reverse order (for loop)
//        System.out.println("Printing using for loop in order");
//        for (int i = 0 ; i < array.length; i++) {
//            System.out.println(array[i]);
//
//        }
//
//        for (int i =0;i<array.length;i++){
//
//                System.out.println(array[i]);
//            array[i] = Math.max(i,array[i]);
//        }
//        int n;
//        for (int i = 0; i <=100; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("2");
//            }
//
//        }
//    }
//
////
//        int i=0;
//
//        while (i>=i){
//            System.out.println("2");
//            i++;
//        }
//        int i=0;
//        do{
//            System.out.println("2");
//        }
//        while (i>=i);


////
//        import static java.util.lang.System .*;
//
//    class ProgrammingInjava {
//        public static void main(String args[]) {
//            out.println("Welcome !");
//        }
//    }


interface calculater {
    void cal (int item);

}
class display implements calculater{
    int x;
    public void cal(int item) {

    x=item*item;
}
}
class interfaces{
    public static void main(String[] args) {
        display arr=new display();
        arr.x=0;
        arr.cal(2);
        System.out.println(arr.x);

    }
}



