import java.util.*;

public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n>0&&n<100){
            int i=n;

            while(i<100){
                System.out.println(i);
                i+=n;
            }
        }
        else{
            System.out.println("Invalid input");
        }
    }
}