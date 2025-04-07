
public class MethodOverloading {

    void add(int a, int b){
        System.out.println("the sum of two numbers is " + (a + b));
    }

    void add(int a, int b, int c){
        System.out.println("the sum of three numbers is "+ (a + b + c));
    }
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        obj.add(90, 321);
        obj.add(12, 34, 90);
    }
}
