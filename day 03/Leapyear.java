
public class leapyear {
    public static void main(String args[]){
        int year = 2024;
        String result = (year%4==0 && year%100!=0) || (year%400==0)?"leap year":"not leap year";
        System.out.println(result);
    }
}
