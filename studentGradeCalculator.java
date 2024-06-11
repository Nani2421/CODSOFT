import java.util.Scanner;

public class studentGradeCalculator {

    // total marks method
    public int totalMarks( int maths1, int maths2, int physics, int chemistry, int english, int sanskrit){
        int totalMarks;
        totalMarks = maths1 + maths2 + physics + chemistry + english + sanskrit;
        return totalMarks;
    }

    //average percentage method
    public double averagePercentage(int totalMarks) {
        double averagePercentage;
        averagePercentage = (totalMarks / 6 *100);
        return averagePercentage;
    }

    //grade method
    public char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else if (averagePercentage >= 40) {
            return 'E';
        } else {
            return 'F';
        }
    }
    public static void main(String[] args) {

        // initialize the varibles
        int maths1,maths2,physics,chemistry,english,sanskrit;
        int totalMarks;
        double averagePercentage;
        char grade;


        //implement scanner class
        Scanner sc = new Scanner(System.in);

        // take the inputs from the user
        System.out.println("Enter the marks in maths1 (out of 100) : ");
        maths1 = sc.nextInt();

        System.out.println("Enter the marks in maths2 (out of 100) : ");
        maths2 = sc.nextInt();

        System.out.println("Enter the marks in physics (out of 100) : ");
        physics = sc.nextInt();

        System.out.println("Enter the marks in chemistry (out of 100) : ");
        chemistry = sc.nextInt();

        System.out.println("Enter the marks in english (out of 100) : ");
        english = sc.nextInt();

        System.out.println("Enter the marks in sanskrit (out of 100) : ");
        sanskrit = sc.nextInt();

        //create the object for the class 
        studentGradeCalculator calculator = new studentGradeCalculator();

        totalMarks = calculator.totalMarks(maths1, maths2, physics, chemistry, english, sanskrit);
        System.out.println("Total Marks are : " + totalMarks);

        averagePercentage = calculator.averagePercentage(totalMarks);
        System.out.println("Your average percentage is : " + averagePercentage);

        grade = calculator.calculateGrade(averagePercentage);
        System.out.println("Your grade is : " + grade);
        sc.close();
    }
}