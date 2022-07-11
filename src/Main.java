import java.security.PublicKey;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        Scanner s = new Scanner(System.in);
        int ch;
        while(true) {
            System.out.println("Enter the Serial Number as choice Given Below");
            System.out.println("1) To Check if Employee is Present or Not select ");
            System.out.println("2) To Check the Daily Wages of an Employee");
            System.out.println("3) To Add an part time Employee Wage");
            System.out.println("4) To Calculate Wages for a Month");

            System.out.println("Press any Other Number to Exit");
            ch = s.nextInt();
            Employee emp = new Employee();
            switch (ch) {
                case 1:
                    emp.empAttendence();
                    System.out.println("----------------------------------------");
                    break;
                case 2:
                    emp.dailyWage();
                    System.out.println("----------------------------------------");
                    break;
                case 3:
                    emp.partimeWage();
                    System.out.println("----------------------------------------");
                    break;
                case 4:
                    emp.wageMonth();
                    System.out.println("----------------------------------------");
                    break;
                default:
                    System.out.println("----------------------------------------");
                    System.out.println("Thank you for using Employee Wage Computation Program ");
                    System.exit(0);

            }

        }


    }

}