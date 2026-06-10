import java.util.*;

public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int power=sc.nextInt();

        long result=1;
        int count=0;

        while(count<power){
            result*=n;
            count++;
        }

        System.out.println(result);
    }
}

