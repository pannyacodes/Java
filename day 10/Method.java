
public class Method {
    void multiply(int a, int b){
        System.out.println(a*b);
    }

    static double add(double a, double b){
        double c = a + b;
        return c;
    }

    public static void main(String[] args) {
        System.out.println(add(8.1, 6.8));
        Method m1 = new Method();
        m1.multiply(3, 4);
    }

}
