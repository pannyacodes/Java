import java.util.ArrayList;
import java.util.Scanner;

public class SubSequence {
    public static void printSubSequences(int[] arr, int index, ArrayList<Integer> path)  {
        if(index == arr.length){
            if(path.size() > 0){
                System.out.println(path);
            }
        } else {
            printSubSequences(arr, index + 1, path);
            path.add(arr[index]);
            printSubSequences(arr, index + 1, path);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<Integer> path = new ArrayList<>();
        printSubSequences(arr, 0, path);
    }
}
