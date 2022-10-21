package Day4_problems;
public class Emp_Switch
{
    //Contants
         public static final int IS_FULL_TIME = 1;
         public static final int IS_PART_TIME = 2;
         public static final int EMP_RATE_hrs = 20;

         public static void main(String[] args)
         {
        //variables
        int empHrs = 0;
        int empWage = 0;
        //compution
        int empCheck = (int) Math.floor(Math.random() * 10) % 3; // 0 1 2
        switch (empCheck) {
            case IS_PART_TIME:
                empHrs = 4;
                break;
            case IS_FULL_TIME:
                empHrs = 8;
                break;
            default:
                empHrs = 0;
        }
        empWage = empHrs * EMP_RATE_hrs;
        System.out.println("Emp Wage: " + empWage);
    }
}


