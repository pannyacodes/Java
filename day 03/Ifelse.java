import java.util.Scanner;

public class Ifelse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter your weight");
        double weight = sc.nextDouble();

        if(weight<=95){
            System.out.println("you can order food");
        }else{
            System.out.println("you can't");
        }
    }
}
