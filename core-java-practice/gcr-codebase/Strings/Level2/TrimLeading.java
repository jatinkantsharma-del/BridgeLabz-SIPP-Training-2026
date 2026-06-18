import java.util.*;
public class TrimLeading {
    
    static int[] trimIndexes(String text) {

        int startIndex=0;
        int endIndex=text.length()-1;

        while(startIndex<text.length() &&
                text.charAt(startIndex)==' ') {

            startIndex++;
        }

        while(endIndex>=0 &&
                text.charAt(endIndex)==' ') {

            endIndex--;
        }

        int[] indexes=new int[2];

        indexes[0]=startIndex;
        indexes[1]=endIndex;

        return indexes;
    }

    static String createSubstring(String text,
                                  int startIndex,
                                  int endIndex) {

        String result="";

        for(int i=startIndex;i<=endIndex;i++) {
            result=result+text.charAt(i);
        }

        return result;
    }

    static boolean compareStrings(String firstText,
                                  String secondText) {

        if(firstText.length()!=secondText.length()) {
            return false;
        }

        for(int i=0;i<firstText.length();i++) {

            if(firstText.charAt(i)!=secondText.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Text : ");
        String inputText=sc.nextLine();

        int[] indexes=trimIndexes(inputText);

        String userTrim=
                createSubstring(inputText,
                        indexes[0],
                        indexes[1]);

        String builtInTrim=inputText.trim();

        boolean result=
                compareStrings(userTrim,builtInTrim);

        System.out.println("User Trim = "+userTrim);
        System.out.println("Built In Trim = "+builtInTrim);
        System.out.println("Same = "+result);
    }
}
