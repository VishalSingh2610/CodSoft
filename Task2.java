import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total Subjects: ");
        int totalSub = sc.nextInt();

        int totalMarks = 0;
        for (int i = 1; i <= totalSub; i++) {
            System.out.println("Enter obtained marks in Subject " + i + ": ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid Marks. Marks should be in between 0 to 100");
                return;
            }
            totalMarks += marks;
        }

        System.out.println("Total Marks Obtained: " + totalMarks);

        double averagePer = (double) totalMarks / (totalSub);

        System.out.println("Average Percentage: " + averagePer + "%");

        char grade;

        if (averagePer >= 90) {
            grade = 'A';
        } else if (averagePer >= 80) {
            grade = 'B';
        } else if (averagePer >= 70) {
            grade = 'C';
        } else if (averagePer >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade : " + grade);

        sc.close();
    }
}
