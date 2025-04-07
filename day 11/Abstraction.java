abstract class Objects {
    abstract void showShape();
    void shape(){
        System.out.println("abstract");
    }
}

class Sphere extends Objects{
    void showShape(){
        System.out.println("object is sphere");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Sphere s1 = new Sphere();
        s1.showShape();
        s1.shape();
    }
}
