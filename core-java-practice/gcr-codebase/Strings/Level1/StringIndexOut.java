import java.util.*;
public class StringIndexOut {
    public class Main{

    static void gen(String s){

        System.out.println(s.charAt(100));
    }

    static void handle(String s){

        try{
            System.out.println(s.charAt(100));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Exception handled");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        handle(s);
    }
}
}
