////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
////        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
////        // to see how IntelliJ IDEA suggests fixing it.
////        System.out.printf("Hello and welcome!");
////
////        for (int i = 1; i <= 5; i++) {
////            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
////            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
////            System.out.println("i = " + i);
////        }
//
//        int n = 4;
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - 1; j++) {
//                System.out.println(" ");
//            }
//            //inner loop
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//
//        }
//    }
//}


import java.io.CharArrayReader;
import java.io.IOException;

class Chararrayinput{
    public static void main(String[] args) {
        String obj="abcdefh";
        int length =obj.length();
        char c[] =new char [length];
        obj.getChars(0,length,c,0);
        CharArrayReader input1=new CharArrayReader(c);
        CharArrayReader input2=new CharArrayReader(c,1,4);
        int i,j;
        try{
            while ((i=input1.read())==(j=input2.read())) {
                System.out.println((char) i);
            }
            }catch (IOException e){
                e.printStackTrace();
            }
//
//
//        final int i;
//        i=20;
//        i=30;
//        System.out.println(i);

        }
   }
