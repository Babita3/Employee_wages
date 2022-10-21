package Day4_problems;

public class Emp_parttime {
    public static void main(String[] args)
    {
        //Constants
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int EMP_RATE_hrs = 20;
        //variables
        int empHrs = 0;
        int empWage = 0;
        //compution
        double empCheck = Math.floor(Math.random() * 10) % 3; // 0 1 2
        if (empCheck == IS_PART_TIME)
            empHrs = 4;
        else if (empCheck == IS_FULL_TIME)
            empHrs = 8;
        else
            empHrs = 0;
        empWage = empHrs * EMP_RATE_hrs;
        System.out.println("Emp Wage: " + empWage);
    }
}


