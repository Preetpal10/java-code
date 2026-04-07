
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    void fuel() {
        System.out.println("Car uses fuel");
    }
}

class ElectricCar extends Car {
    void battery() {
        System.out.println("Electric car uses battery");
    }
}


public class InheritanceExample {
    public static void main(String[] args) {

        ElectricCar obj = new ElectricCar();

        obj.run();     
        obj.fuel();   
        obj.battery(); 
    }
}