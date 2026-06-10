import java.util.*;

public class PowerFor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int power=sc.nextInt();

        if(n>0&&power>=0){
            long result=1;

            for(int i=1;i<=power;i++){
                result*=n;
            }

            System.out.println(result);
        }
        else{
            System.out.println("Invalid input");
        }
    }
}