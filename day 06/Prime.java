
public class Prime {
    public static void main(String[] args) {
        int x = 8;
        int i;
        for (i = 2; i < x; i++) {
            if (x % i == 0) {
                break;
            }
        }
        if (i == x) {
            System.out.println(x + " is a prime number");
        } else {
            System.out.println(x + " is not a prime number");
        }
    }
}
