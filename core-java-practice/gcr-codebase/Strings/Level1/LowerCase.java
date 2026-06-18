import java.util.*;
public class LowerCase {
    static String low(String s){

        String r="";

        for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);

            if(ch>='A'&&ch<='Z'){
                ch=(char)(ch+32);
            }

            r+=ch;
        }

        return r;
    }

    static boolean chk(String a,String b){

        if(a.length()!=b.length()){
            return false;
        }

        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        String a=low(s);
        String b=s.toLowerCase();

        System.out.println(a);
        System.out.println(b);
        System.out.println(chk(a,b));
    }
}
