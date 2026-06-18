import java.util.*;
public class ArrayIndexOutofBound {
    static void gen(String[] a){

        System.out.println(a[100]);
    }

    static void handle(String[] a){

        try{
            System.out.println(a[100]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception handled");
        }
        catch(RuntimeException e){
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String[] a=new String[3];

        for(int i=0;i<3;i++){
            a[i]=sc.next();
        }
        handle(a);
    }
}
