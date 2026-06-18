import java.util.*;
public class SplitAndCompare {
     static int findLength(String text) {

        int count=0;

        try {

            while(true) {
                text.charAt(count);
                count++;
            }

        }
        catch(Exception e) {
        }

        return count;
    }

    static String[] splitText(String text) {

        int textLength=findLength(text);
        int wordCount=1;

        for(int i=0;i<textLength;i++) {

            if(text.charAt(i)==' ') {
                wordCount++;
            }
        }
        String[] words=new String[wordCount];
        int startIndex=0;
        int wordIndex=0;
        for(int i=0;i<=textLength;i++) {
            if(i==textLength || text.charAt(i)==' ') {

                String currentWord="";

                for(int j=startIndex;j<i;j++) {
                    currentWord=currentWord+text.charAt(j);
                }

                words[wordIndex]=currentWord;
                wordIndex++;
                startIndex=i+1;
            }
        }
        return words;
    }

    static boolean compareArrays(String[] firstArray,String[] secondArray) {
        if(firstArray.length!=secondArray.length) {
            return false;
        }
        for(int i=0;i<firstArray.length;i++) {
            if(!firstArray[i].equals(secondArray[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Text : ");
        String inputText=sc.nextLine();
        String[] userWords=splitText(inputText);
        String[] builtInWords=inputText.split(" ");
        boolean comparisonResult=compareArrays(userWords,builtInWords);
        System.out.println("Words");
        for(int i=0;i<userWords.length;i++) {
            System.out.println(userWords[i]);
        }
        System.out.println("Same = "+comparisonResult);
    }
}
