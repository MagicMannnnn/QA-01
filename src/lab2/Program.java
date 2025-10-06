package lab2;

import java.util.Scanner;

public class Program {
    static Scanner sc = new Scanner(System.in);

    public static void Main(String[] args) {
        System.out.print("grade: ");
        int grade = sc.nextInt();

        if (grade < 1 || grade > 100){
            throw new IllegalArgumentException("grade must be between 1 and 100");
        }

        if (grade < 50) {
            System.out.println("Fail");
        }else if (grade <= 60) {
            System.out.println("Pass");
        }else if (grade <= 70) {
            System.out.println("Merit");
        }else {
            System.out.println("Distinction");
        }
    }
}
