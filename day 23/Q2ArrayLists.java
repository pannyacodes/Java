import java.util.ArrayList;
import java.util.Scanner;

public class Q2ArrayLists {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number of arrays");
        int n = scn.nextInt();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("enter the size of array " + (i + 1));
            int n1 = scn.nextInt();
            ArrayList<Integer> l2 = new ArrayList<>();
            System.out.println("enter " + n1 + " elements");

            for (int j = 0; j < n1; j++) {
                l2.add(scn.nextInt());
            }

            list.add(i, l2);
        }

        System.out.println("enter the number of queries to process");
        int q = scn.nextInt();

        for (int k = 0; k < q; k++) {
            System.out.println("enter the row number and column number for query " + (k+1));
            int r = scn.nextInt();
            int c = scn.nextInt();
            try{
            System.out.println("elements at " + r + ", " + c + ": " + list.get(r-1).get(c-1));
            }
            catch(Exception e){
                System.out.println("error");
            }
        }

    }
}
