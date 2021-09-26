import java.util.*;
public class Divisible {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=scan.nextInt();
        if(number%2==0)System.out.println(number+" is divisible by 2: "+true);
        else System.out.println(number+" is divisible by 2: "+false);
        if(number%3==0)System.out.println(number+" is divisible by 3: "+true);
        else System.out.println(number+" is divisible by 3: "+false);
        if(number%5==0)System.out.println(number+" is divisible by 5: "+true);
        else System.out.println(number+" is divisible by 5: "+false);
    }
}
