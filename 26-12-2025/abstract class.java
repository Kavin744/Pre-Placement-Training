abstract class Vehicle {
    abstract void speed();
}
class Bike extends Vehicle {
    void speed() {
        System.out.println("60 km/h");
    }
}
