package Day4_problems;
public class Emp_wage {

    public static void main(String[] args)
    {
        //Contants
        int IS_FULL_TIME = 1;
        int EMP_RATE_hrs = 20;
        //variables
        int empHrs = 0;
        int empWage = 0;
        //compution
        double empCheck = Math.floor(Math.random() * 10) % 2; // 0 1
        if (empCheck == IS_FULL_TIME)
           empHrs = 8;
        else
            empHrs = 0;
        empWage = empHrs * EMP_RATE_hrs;
        System.out.println("Emp Wage: " + empWage);
    }
}
