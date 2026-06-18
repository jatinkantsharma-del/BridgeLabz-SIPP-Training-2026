import java.util.*;

public class multipleCatchBlock {
    public static void main(String[] args) {

        try {
            int[] a = {10,20,30,40};

            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();

            System.out.println("Value at index " + i + ": " + a[i]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }
        catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}
