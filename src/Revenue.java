import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter product price:");
        double price=scan.nextDouble();
        System.out.println("Enter product quantity:");
        double quantity=scan.nextDouble();
        double revenue=price*quantity;
        System.out.println("Revenue= "+revenue);

    }
}
