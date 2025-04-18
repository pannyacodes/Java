import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       
        System.out.println("enter the number of discs");
        int n = scn.nextInt();
        System.out.println("enter the position of t1");
        int t1 = scn.nextInt();
        System.out.println("enter the position of t2");
        int t2 = scn.nextInt();
        System.out.println("enter the position of t3");
        int t3 = scn.nextInt();

        toh(n, t1, t2, t3);
    }

    public static void toh(int n, int t1, int t2, int t3) {
        if (n==0) return;
        toh(n-1, t1, t3, t2);
        System.out.println("move disc " + n + " from tower " + t1 + " to tower " + t2);
        toh(n-1, t3, t2, t1);
    }
}
