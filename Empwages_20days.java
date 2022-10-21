package Day4_problems;

public class Empwages_20days {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_hrs = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 10;

    public static void main(String[] args) {
        //variables
        int empHrs = 0, totalEmployeeHrs = 0, totalWorkingDays = 0;
        //compution
        while(totalEmployeeHrs<=MAX_HRS_IN_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
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
            totalEmployeeHrs += empHrs;
            System.out.println("Days#: " + totalWorkingDays + " Emp hrs: " +empHrs);
        }
            int totalEdge = totalEmployeeHrs * EMP_RATE_hrs;
            System.out.println("totalEdge: "+totalEdge);
        }
    }





