import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a year:");
        int year=scan.nextInt();
        if(year%4==0)System.out.println(true);
        else System.out.println(false);
    }
}
