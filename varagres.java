public class varagres {
    static int sum (int ...arr){
        int result =0;

        for(int a:arr){
            result+=a;
        }
        return result;
    }

    static int sub (int ...arr){
        int result =0;

        for(int a:arr){
            result+=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("the sum of 4,3 is "+sum(4,5));
        System.out.println("the sum of 4,3 is "+sum(4,7,4,33,3,5,55,332,5,7,7,10,7));
                System.out.println("the sum of 4,3 is "+sum(33,5,5,6,6,6,4,4,4,3,3,2));
        System.out.println("the sum of 4,3 is "+sum());

        System.out.println("the sum of 4,3 is "+sub(4,5));

    }
}
