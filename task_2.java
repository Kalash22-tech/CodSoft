import java.util.Scanner;

public class Student_Grade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🎓 Welcome to the Student Grade Calculator!");
        System.out.print("Please enter the number of subjects you have: ");
        int numSubjects = scanner.nextInt();

        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        System.out.println("\n📘 Let's enter the marks for each subject out of 100.");

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.println("⚠️ Oops! Marks should be between 0 and 100.");
                System.out.print("Please enter valid marks for Subject " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();
            }
            totalMarks += marks[i];
        }

        double averagePercentage = (double) totalMarks / numSubjects;

        String grade;
        if (averagePercentage >= 90) {
            grade = "A+ 🌟";
        } else if (averagePercentage >= 80) {
            grade = "A 🎉";
        } else if (averagePercentage >= 70) {
            grade = "B 👍";
        } else if (averagePercentage >= 60) {
            grade = "C 🙂";
        } else if (averagePercentage >= 50) {
            grade = "D 🙁";
        } else {
            grade = "F 😞";
        }

        System.out.println("\n--- 📊 Results ---");
        System.out.println("You've completed your entries. Here are your results:");
        System.out.println("📈 Total Marks: " + totalMarks + " out of " + (numSubjects * 100));
        System.out.printf("📉 Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("📋 Your Grade: " + grade);

        if (grade.contains("A+ 🌟") || grade.contains("A 🎉")) {
            System.out.println("🌟 Excellent work! Keep it up!");
        } else if (grade.contains("B 👍") || grade.contains("C 🙂")) {
            System.out.println("👏 Good job! A little more effort, and you'll be at the top!");
        } else if (grade.contains("D 🙁")) {
            System.out.println("🙂 You've passed, but there's room for improvement. Keep studying hard!");
        } else {
            System.out.println("😞 Don't be discouraged. Review your work, and you'll do better next time!");
        }

        scanner.close();
    }
}
