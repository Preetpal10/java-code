
abstract class Vehicle {
    
    int noOfWheels; 

 
    abstract void start(); 
}


class Car extends Vehicle { 
    
    public Car() {
        this.noOfWheels = 4; 
    }


    @Override
    void start() {
        System.out.println("Car starts with a key. It has " + noOfWheels + " wheels.");
    }
}


class Bike extends Vehicle { 
    
    public Bike() {
        this.noOfWheels = 2; 
    }
    @Override
    void start() {
        System.out.println("Bike starts with a kick/button. It has " + noOfWheels + " wheels.");
    }
}


public class vehicleabs {
    public static void main(String[] args) {
        
        
        Vehicle obj = new Car();
        
        obj.start(); 
        
        System.out.println("--------------------");
    
        Vehicle obj2 = new Bike();
        obj2.start();
    }
}