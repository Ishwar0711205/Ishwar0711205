import java.util.*;
import java.util.Arrays;
import java.util.stream.IntStream;
public class Array01 {

//    public static void check(int toCheckValue) {
//        int []arr = new int[10];
//        Boolean test = false;
//        for (int element : arr) {
//            if (element == toCheckValue) {
//                test = true;
//                break;
//            }
//        }
//
//        System.out.println("Is" + toCheckValue + "test");
//    }
//
//        public static void main (String[]args){
//            int[] arr = new int[10];
//            int toCheckValue = 7;
//            System.out.println("Array:" + Arrays.toString(arr));
//            check(toCheckValue);
//        }
//    }

    public static void main(String[]args){
        int[] num ={1,2,3,4,5};
        int tofind  =7;

        boolean found = IntStream.of(num).anyMatch((n -> n == tofind));

        if(found)
            System.out.println(tofind+"is found.");
        else
            System.out.println(tofind+"is not find ");
    }


}