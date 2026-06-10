import java.util.Scanner;

public class Calculate_Simple_Interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal amount");
        double principal=sc.nextDouble();
        System.out.println("Enter the rate of interest");
        double rate=sc.nextDouble();
        System.out.println("Enter the time period");
        double time=sc.nextDouble();
        double si=(principal*rate*time)/100;
        System.out.println("Simple Interest is "+si);
    }
}