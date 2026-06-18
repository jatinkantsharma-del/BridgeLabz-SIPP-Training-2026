import java.util.*;
public class VotingElegibility {
    
    static int[] createAges(int studentCount) {

        int[] ages=new int[studentCount];

        for(int i=0;i<studentCount;i++) {

            ages[i]=(int)(Math.random()*90)+10;
        }

        return ages;
    }

    static String[][] checkVote(int[] ages) {

        String[][] data=new String[ages.length][2];

        for(int i=0;i<ages.length;i++) {

            data[i][0]=String.valueOf(ages[i]);

            if(ages[i]>=18) {
                data[i][1]="true";
            }
            else {
                data[i][1]="false";
            }
        }

        return data;
    }

    static void displayData(String[][] data) {

        System.out.println("Age\tCan Vote");

        for(int i=0;i<data.length;i++) {

            System.out.println(
                    data[i][0]+"\t"+data[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number Of Students : ");
        int studentCount=sc.nextInt();

        int[] ages=createAges(studentCount);

        String[][] data=checkVote(ages);

        displayData(data);
    }
}
