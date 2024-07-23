class Vehicle {
    void displayInfo() {
        System.out.println("vehicle");
    }
}

class Car extends Vehicle {
    @Override
    void displayInfo() {
        System.out.println("car");
    }
}

class Bike extends Vehicle {
    @Override
    void displayInfo() {
        System.out.println("bike");
    }
}

public class Dmd {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Bike();
        vehicle1.displayInfo(); 
        vehicle2.displayInfo(); 
    }
}



