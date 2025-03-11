class Mammals{
    void mam(){
        System.out.println("inside mammals class");
    }
}

class Lion extends Mammals{
    void roar(){
        System.out.println("inside lion class");
    }
}

class Human extends Mammals{
    void hum(){
        System.out.println("inside human class");
    }
}

public class Mammal{
    public static void main(String[] args) {
        Lion obj = new Lion();
        obj.roar();
        obj.mam();
    }
}
