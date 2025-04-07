import java.util.Scanner;
public class RArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       
        System.out.println("enter the number of rows");
        int r = scn.nextInt();
        
        System.out.println("enter the number of columns");
        int c = scn.nextInt();

        System.out.println("enter the elements");
        int [][] arr = new int[r][c];

        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println("the 2D array representation is: ");

        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
