class Car{
    int speed;
    String company;

    //constructor
    Car(int myspeed, String mycompany){
        speed = myspeed;
        company = mycompany;
    }
    void printDetails(){
        System.out.println("Speed: " + speed + " Brand: " + company);
}
}

public class Constructors {
    public static void main(String[] args) {
        Car car1 = new Car(100, "Audi");
        car1.printDetails();
    }
}
