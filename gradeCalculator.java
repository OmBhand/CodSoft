import java.util.Scanner;
public class gradeCalculator {
    public static void main(String[] args) {
        Scanner sub = new Scanner(System.in);

        System.out.println("Enter total number of subjects:- ");
        int allSubject = sub.nextInt();

        int totalMarks = 0;

        for(int i = 1; i <= allSubject; i++){
            System.out.println("Enter the marks for subject "+ i + " between 1 - 100:- ");
            int marks = sub.nextInt();

            if(marks < 0 || marks > 100){
                System.out.println("Invalid marks!!!!!!");
                return;
            }

            totalMarks += marks;
        }

        double averagePercentage = (double)totalMarks / allSubject;

        System.out.println("Results: ");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);

        String grade = calculateGrade(averagePercentage);
        System.out.println("Grade: "+ grade);
    }

    public static String calculateGrade(double averagePercentage){
        if(averagePercentage >= 90){
            return "A+ Grade";
        }
        else if(averagePercentage >= 80){
            return "A Grade";
        }
        else if(averagePercentage >= 70){
            return "B Grade";
        }
        else if(averagePercentage >= 60){
            return "C Grade";
        }
        else if(averagePercentage >= 50){
            return "D Grade";
        }
        else{
            return "E Grade";
        }
    }
}