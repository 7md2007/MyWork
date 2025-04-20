// Hamad Mohammed Aljenibi / 2013150794 / 784200780964100 / 12CAI / CAI720

class Car{
    void drive() {
        System.out.println("The car is driving.");
    }
}

class SportsCar extends Car {
    @Override
    void drive() {
        System.out.println("The sports car is fast!");
    }
}

class ElectricCar extends Car {
    @Override
    void drive() {
        System.out.println("The electric car is driving quietly.");
    }
}
public class Main {
    public static void main(String[] args) {
        Car myCar;
        
        myCar = new SportsCar();
        myCar.drive();
        
        myCar = new ElectricCar();
        myCar.drive();
    }
}