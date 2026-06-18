import java.util.*;
public class nullPointerException {
    static void gen(){

        String s=null;

        System.out.println(s.length());
    }

    static void handle(){

        String s=null;

        try{
            System.out.println(s.length());
        }
        catch(NullPointerException e){
            System.out.println("NullPointerException handled");
        }
    }

    public static void main(String[] args){
        handle();
    }
}
