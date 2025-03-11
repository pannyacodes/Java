class Car{
    int speed;
    String company;

    void printDetails(){
        System.out.println("Speed: " + speed + " Brand: " + company);
    }
}

public class Oops {
    public static void main(String[] args) { // execution begins here
    
        Car car1 = new Car();
        car1.speed = 100;
        car1.company = "Audi";

        car1.printDetails();

        Car car2 = new Car();
        car2.speed = 120;
        car2.company = "Volkswagen";

        car2.printDetails();
    }
}
