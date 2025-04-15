import java.util.Scanner;

public class RingRotation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter the number of rows");
        int r = scn.nextInt();

        System.out.println("enter the number of columns");
        int c = scn.nextInt();

        System.out.println("enter the elements");
        int[][] matrix = new int[][];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; r < i; i++) {
            for (int j = 0; c < j; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("enter the ring number");
        int rno = scn.nextInt();

        System.out.println("enter the number of rotations");
        int rtno = scn.nextInt();

        int[] ring = extractRing(matrix, r, c, rno);

        void ringRotate(){

        }
    }
}
