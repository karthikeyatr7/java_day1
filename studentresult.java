import java.util.Scanner;
public class studentresult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Result Analyzer");
        System.out.println("Enter the name of the student: ");
        String name = sc.nextLine();
        System.out.println("Enter the three subject marks of the student: ");
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();
        int total = mark1 + mark2 + mark3;
        int average = total / 3;

        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        if(average >= 90){
            System.out.println("Student deserves a special award for excellent performance.");
        }
        else if(average >= 80 && average < 90){
            System.out.println("Student got Distinction.");
        }
        else if(average >= 30 && average < 80){
            System.out.println("Student has passed.");
        }
        else{
            System.out.println("Student has failed.");
        }

        sc.close();

    }
}