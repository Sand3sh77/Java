import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks of subject in natural numbers" + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        int total = 0;

        for (int number : marks) {
            total = total + number;
        }

        int average = total / marks.length;

        System.out.println("Total marks: " + total);
        System.out.println("Average marks: " + average);
    }
}