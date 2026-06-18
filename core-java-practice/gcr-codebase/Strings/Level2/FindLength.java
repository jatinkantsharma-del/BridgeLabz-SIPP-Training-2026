import java.util.*;
public class FindLength {
    static int findLength(String text) {
        int count=0;
        try {
            while(true) {
                text.charAt(count);
                count++;
            }
        }
        catch(Exception e) {
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String : ");
        String inputText=sc.next();
        int calculatedLength=findLength(inputText);
        int builtInLength=inputText.length();
        System.out.println("Length By Method = "+calculatedLength);
        System.out.println("Length By length() = "+builtInLength);
    }
}
