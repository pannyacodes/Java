import java.util.ArrayList;
import java.util.Scanner;
public class Q1ArrayLists {

    public static void solution(ArrayList<Integer> al){
        for(int i = al.size()-1; i>=0; i--){
            if(isPrime(al.get(i)) == true){
                al.remove(i);
            }
        }
    }

    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }

        for(int div = 2; div * div <= n; div++){
            if(n%div==0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number of integers");
        int n = scn.nextInt();

        System.out.println("enter " + n + " integers");
        for(int i = 0; i < n; i++){
            al.add(scn.nextInt());
        }

        solution(al);

        System.out.println("modified list without primes: " + al);
    }
}

