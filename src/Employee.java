import java.util.Scanner;

public class Employee {
    Scanner s = new Scanner(System.in);
    int wagePerHour =20;
    int fullDay =8;
    int partTimehours=8;
    public  void empAttendence(){

        Double random = Math.floor(Math.random()*1000 % 2);
        if(random==1){
            System.out.println("Employee is Present");
        }
        else{
            System.out.println("Employee is Absent");
        }

    }
    public void dailyWage(){
        System.out.println("Daily wage of an employee is "+(wagePerHour*fullDay));
    }
    public void partimeWage(int wage){
        System.out.println("Part Time Employee Wage is "+(wage*partTimehours));

    }
    public void wageMonth(){
        int workingDays=20;
        System.out.println("Wages for a Month is "+(workingDays*wagePerHour));

    }
}
