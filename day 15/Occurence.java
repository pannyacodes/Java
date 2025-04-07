import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int x = sc.nextInt();
        int[] arr = { 14, -5, 13, 75, 8, -5, 31, 1, 2, 3, -5 };
        int i;
        int count = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        System.out.println("the number " + x + " appears " + count + " times");
    }
}
