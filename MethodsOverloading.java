public class MethodsOverloading {
    static void ishwar(){
        System.out.println("HELO ! GOOOD MORNING BRO  ");
    }

    static void ishwar(int a){
        System.out.println("HELO ! GOOOD MORNING " +a+ " BRO ");

    }

    static void ishwar(int a, int b){
        System.out.println("HELO ! GOOOD MORNING " +a+ " BRO ");
        System.out.println("HELO ! GOOOD MORNING " +b+ " BRO ");

    }

    public static void main(String[] args) {
        ishwar();
        ishwar(300);
        ishwar(800,100);
    }
}
