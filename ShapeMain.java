import java.util.*;
class Shape{
    void display(){
        System.out.println("thid is a shspe");

    }
}

class Circle extends Shape{
    private double radius;

    Circle (double radius){
        this.radius =radius;

    }

    double calculateArea(){
        return Math.PI*radius;

    }
}

public class ShapeMain {

    public static void main(Strings [] args ){
        Scanner sc = new Scanner (System.in);

        int n;
        System.out.println("enter the radiud of circle:");
        n=sc.nextInt();
        Circle circle = new Circle (n);
        circle.display();
        System.out.println("Area of circle"+ circle.calculateArea());

    }
}
