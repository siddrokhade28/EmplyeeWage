import java.util.Scanner;

public class Employee {
    Scanner s = new Scanner(System.in);
    int wagePerHour =20;
    int fullDayHour =8;
    int partTimehours=4;
    public  double empAttendence(){

        Double random = Math.floor(Math.random()*1000 % 3);

        if(random==0){
            System.out.println(" Employee is Absent");

        }
        else{
            System.out.println("Employee is Present");
        }
        return random;

    }
    public void dailyWage(){
        System.out.println("Daily wage of an employee is "+(wagePerHour*fullDayHour));
    }
    public void partimeWage(){
        System.out.println("Part Time Employee Wage is "+(wagePerHour*partTimehours));

    }
    public void wageMonth(){
        int workingDays=0;
        double totalWage =0;
        int workingHours=0;
        //System.out.println("Wages for a Month is "+(workingDays*wagePerHour));
        while(true){
           double a= empAttendence();
           switch ((int)a){
               case 0:
                   System.out.println("employee is absent");
                   break;
               case 1:
                   workingDays++;
                   workingHours +=8;
                   break;
               case 2:
                   workingDays++;
                   workingHours +=4;
                   break;
           }

           if(workingDays>=20 || workingHours>=100){
               break;
           }
           totalWage=workingHours*20;

        }
        System.out.println("total wage "+totalWage);

    }
}
