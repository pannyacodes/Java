class Car {
    private int speed;
    private boolean isLock;

    void setSpeed(int speed){
        this.speed = speed;
    }

    void setLock(boolean isLock){
        this.isLock = isLock;
    }

    boolean getLock(){
        return isLock;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setLock(true);

    if (c1.getLock()==true){
        System.out.println("the vehicle is locked");
    }else{
        System.out.println("the vehicle is not locked");
    }
    }   
}
