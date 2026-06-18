import java.util.*;

public class BMI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double weight=sc.nextDouble();
        double height=sc.nextDouble();

        height=height/100;

        double bmi=weight/(height*height);

        System.out.println("BMI = "+bmi);

        if(bmi<18.5){
            System.out.println("Underweight");
        }
        else if(bmi<25){
            System.out.println("Normal Weight");
        }
        else if(bmi<30){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obese");
        }
    }
}