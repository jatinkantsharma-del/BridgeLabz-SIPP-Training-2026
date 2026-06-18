import java.util.*;
public class CompareType {
    static String checkCharacter(char ch) {

        if(ch>='A' && ch<='Z') {
            ch=(char)(ch+32);
        }

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
            return "Vowel";
        }

        if(ch>='a' && ch<='z') {
            return "Consonant";
        }

        return "Not a Letter";
    }

    static String[][] createData(String inputText) {

        int textLength=inputText.length();

        String[][] data=new String[textLength][2];

        for(int i=0;i<textLength;i++) {

            data[i][0]=String.valueOf(inputText.charAt(i));
            data[i][1]=checkCharacter(inputText.charAt(i));
        }

        return data;
    }

    static void displayData(String[][] data) {

        System.out.println("Character\tType");

        for(int i=0;i<data.length;i++) {
            System.out.println(data[i][0]+"\t\t"+data[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Text : ");
        String inputText=sc.nextLine();

        String[][] data=createData(inputText);

        displayData(data);
    }
}
