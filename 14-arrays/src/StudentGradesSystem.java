import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentGradesSystem {
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#.0");
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int numberOfStudents;
        double[] programming, dataAccess, dataBases;
        double sumProgrammingGrades = 0, sumDataAccessGrades = 0, sumDataBaseGrades = 0;

        try {
            do {
                System.out.println("Enter the number of students in the course:");
                numberOfStudents = sc.nextInt();
                do {
                    if (numberOfStudents <= 0 || numberOfStudents > 10) {
                        System.out.println(RED +
                                "The number of students may not be less than zero or more than ten" + RESET);
                        System.out.println("Enter the number of students in the course:");
                        numberOfStudents = sc.nextInt();
                    }
                } while (numberOfStudents <= 0 || numberOfStudents > 10);
            } while (numberOfStudents <= 0);

            // Instantiate the arrays
            programming = new double[numberOfStudents];
            dataAccess = new double[numberOfStudents];
            dataBases = new double[numberOfStudents];

            // The user has to enter the grades of the students
            System.out.println(BLUE + "Students' grades for the programming subject" + RESET);
            for (int i = 0; i < programming.length; i++) {
                System.out.println("Enter the student's grade " + (i + 1) + ":");
                programming[i] = sc.nextDouble();
            }

            System.out.println(BLUE + "Students' grades for the data access subject" + RESET);
            for (int i = 0; i < dataAccess.length; i++) {
                System.out.println("Enter the student's grade " + (i + 1) + ":");
                dataAccess[i] = sc.nextDouble();
            }

            System.out.println(BLUE + "Students' grades for the databases subject" + RESET);
            for (int i = 0; i < dataBases.length; i++) {
                System.out.println("Enter the student's grade " + (i + 1) + ":");
                dataBases[i] = sc.nextDouble();
            }

            // Add up the students' grades for each subject
            for (int i = 0; i < numberOfStudents; i++) {
                sumProgrammingGrades += programming[i];
                sumDataAccessGrades += dataAccess[i];
                sumDataBaseGrades += dataBases[i];
            }

            // Show average mark for each subject
            double averageProgrammingGrade = sumProgrammingGrades / numberOfStudents;
            double averageDataAccessGrade = sumDataAccessGrades / numberOfStudents;
            double averageDatabasesGrade = sumDataBaseGrades / numberOfStudents;
            double averageGradeCourse = (averageProgrammingGrade + averageDataAccessGrade + averageDatabasesGrade) / 3;
            System.out.println("Average grade of programming: " + GREEN + (df.format(averageProgrammingGrade)) + RESET);
            System.out.println("Average grade of data access: " + GREEN + (df.format(averageDataAccessGrade)) + RESET);
            System.out.println("Average grade of databases: " + GREEN + (df.format(averageDatabasesGrade)) + RESET);
            System.out.println("Average grade for the course " + year + "/" + (year + 1) + ": " + GREEN + df.format(averageGradeCourse) + RESET);

            // Get a student by it's identifier
            System.out.println(BLUE + "Get a student by it's identifier" + RESET);
            System.out.println("Enter the student's identifier from 1 to " + numberOfStudents + ":");
            int id = sc.nextInt() - 1;

            System.out.println("Student's grade in the programming subject: " + GREEN + df.format(programming[id] ) + RESET);
            System.out.println("Student's grade in the data access subject: " + GREEN + df.format(dataAccess[id]) + RESET);
            System.out.println("Student's grade in the programming subject: " + GREEN + df.format(dataBases[id]) + RESET);

            double studentAverageGrade = (programming[id] + dataAccess[id] + dataBases[id]) / 3;
            System.out.println("Average student's grade " + (id + 1) + ": " + GREEN + df.format(studentAverageGrade) + RESET);
        } catch (InputMismatchException e) {
            System.out.println(RED + "You must enter a numeric value" + RESET);
        }
        sc.close();
    }
}
