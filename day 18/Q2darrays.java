import java.util.Scanner;

public class Q2darrays {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
        };

        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // sum += arr[i][j];
        // }
        // }
        // System.out.println(sum);

        // int max = arr[0][0];
        // for (int i=0; i<arr.length; i++){
        // for (int j=0; j<arr[i].length; j++){
        // if (arr[i][j] > max){
        // max = arr[i][j];
        // }
        // }
        // }
        // System.out.println(max);

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i;
        for (i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == x) {
                    System.out.println(x + " is in the array");
                }
            }
            break;
        }
        if (i == arr.length) {
            System.out.println(x + " is not in the array");
        }
    }
}
