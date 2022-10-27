package application;

import entities.Student;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        System.out.print("Enter your name: ");
        student.name = sc.nextLine();
        System.out.print("Enter your first quarter grade: ");
        student.nota1 = sc.nextDouble();
        System.out.print("Enter your second quarter grade: ");
        student.nota2 = sc.nextDouble();
        System.out.print("Enter your third quarter grade: ");
        student.nota3 = sc.nextDouble();


        if (student.notafinal() >= 60) {
            System.out.printf("Final grade: %.2f", student.notafinal());
            System.out.println();
            System.out.println("Pass !!! Congratulations.");
        }
        else {
            System.out.printf("Final grade: %.2f", student.notafinal());
            System.out.println();
            System.out.println("Failed");
            System.out.printf("Missing: %.2f points.", student.restpontos());
        }
        sc.close();
    }

}