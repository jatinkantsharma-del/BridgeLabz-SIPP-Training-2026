import java.util.*;
public class nestedTryCatch {
    public static void main(String[] args) {

        int[] a = {10,20,30,40};

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int d = sc.nextInt();

        try {
            try {
                int x = a[i] / d;
                System.out.println(x);
            }
            catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}
