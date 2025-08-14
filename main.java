import java.util.Scanner;

class ReportCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter Student Name: ");
              String name = scanner.nextLine();

        System.out.println("Enter Roll Number: ");
String rollNo = scanner.nextLine();

              System.out.println("Enter Semester: ");
              String semester = scanner.nextLine();

              System.out.println("Enter number of subjects: ");
          int subjectCount = scanner.nextInt();
          scanner.nextLine();  

        String[] subjects = new String[subjectCount];
        int[] marks = new int[subjectCount];
        int total = 0;

        for (int i = 0; i < subjectCount; i++) {
            System.out.print("Enter name of Subject " + (i + 1) + ": ");
            subjects[i] = scanner.nextLine();

            System.out.print("Enter marks for " + subjects[i] + ": ");
            marks[i] = scanner.nextInt();
            scanner.nextLine(); 
            total += marks[i];
        }

        double average = (double) total / subjectCount;
        String grade;

        
        if (average >= 90)
            grade = "A+";
        else if (average >= 80)
            grade = "A";
        else if (average >= 70)
            grade = "B+";
        else if (average >= 60)
            grade = "B";
        else if (average >= 50)
            grade = "C";
        else
            grade = "F";

        // Print report card
        System.out.println("\n===== Report Card =====");
        System.out.println("Name      : " + name);
        System.out.println("Roll No   : " + rollNo);
        System.out.println("Semester  : " + semester);
        System.out.println("-----------------------------");
        System.out.println("Subject\t\tMarks");

        for (int i = 0; i < subjectCount; i++) {
            System.out.printf("%-15s %3d\n", subjects[i], marks[i]);
        }

        
        System.out.println("Total Marks : " + total);
        System.out.printf("Average     : %.2f\n", average);
        System.out.println("Grade       : " + grade);
        

        scanner.close();
    }
}