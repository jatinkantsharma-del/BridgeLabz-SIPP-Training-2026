import java.util.*;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double phy=sc.nextDouble();
        double chem=sc.nextDouble();
        double maths=sc.nextDouble();

        double per=(phy+chem+maths)/3;

        System.out.println("Percentage = "+per);

        if(per>=90){
            System.out.println("Grade A");
            System.out.println("Excellent");
        }
        else if(per>=75){
            System.out.println("Grade B");
            System.out.println("Very Good");
        }
        else if(per>=60){
            System.out.println("Grade C");
            System.out.println("Good");
        }
        else if(per>=40){
            System.out.println("Grade D");
            System.out.println("Pass");
        }
        else{
            System.out.println("Grade F");
            System.out.println("Fail");
        }
    }
}