class Car {

    String brand;

    Car(String b) {
        brand = b;
    }

    void show() {
        System.out.println("Brand: " + brand);
    }
}

public class bmw {

    public static void main(String[] args) {

        Car c1 = new Car("BMW");

        c1.show();
    }
}