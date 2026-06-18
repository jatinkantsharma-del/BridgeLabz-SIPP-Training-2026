import java.util.*;
public class numberFormateException {
    static void gen(String s){

        int n=Integer.parseInt(s);

        System.out.println(n);
    }

    static void handle(String s){

        try{
            int n=Integer.parseInt(s);
            System.out.println(n);
        }
        catch(NumberFormatException e){
            System.out.println("NumberFormatException handled");
        }
        catch(RuntimeException e){
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        handle(s);
    }
}
