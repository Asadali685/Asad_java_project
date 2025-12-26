import java.util.Scanner;

public class GradeAnalyzer1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int n = Integer.parseInt(sc.nextLine());

        int[] marks = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for subject " + (i + 1) + ":");
            marks[i] = Integer.parseInt(sc.nextLine());
            total += marks[i];
        }

        double average = total / (double) n;

        String grade;
        if (average >= 90) grade = "A";
        else if (average >= 75) grade = "B";
        else if (average >= 60) grade = "C";
        else if (average >= 40) grade = "D";
        else grade = "Fail";

        System.out.println("\n--- Grade Report ---");
        System.out.println("Student Name : " + name);
        System.out.println("Total Marks  : " + total);
        System.out.println("Average      : " + average);
        System.out.println("Grade        : " + grade);

        sc.close();
    }
}
