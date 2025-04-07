class Vehicles {
    int speed, capacity;

    Vehicles(int s, int c) {
        speed = s;
        capacity = c;
    }

    void getDetails() {
        System.out.println("speed: " + speed);
        System.out.println("capacity: " + capacity);
    }
}

class Bus extends Vehicles {
    int routeNumber;

    Bus(int s, int c, int r) {
        // speed = s;
        // capacity = c;
        super(s, c);
        routeNumber = r;
    }

    void getDetails() {
        // System.out.println("speed: " + speed);
        // System.out.println("capacity: " + capacity);
        super.getDetails();
        System.out.println("route number: " + routeNumber);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Bus b1 = new Bus(60, 50, 3);
        b1.getDetails();
    }
}
    