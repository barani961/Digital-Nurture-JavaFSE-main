public class ClassObject {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Innova", 2002);
        Car car2 = new Car("Tata", "Sumo", 2004);
        car1.displayDetails();
        car2.displayDetails();
    }
}

class Car {
    String make;
    String model;
    int year;

    public Car(String make,String model,int year) {
        this.make=make;
        this.model=model;
        this.year=year;
    }

    public void displayDetails() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}
