package Day4_problems;

public class EmpAttendance {
        public static void main(String[] args) {
            int fulltimehrs = 1;
            double empCheck = Math.floor(Math.random() * 10) % 2;

            if (empCheck == fulltimehrs) {
                System.out.println("Employee is present in the company");
            } else {
                System.out.println("Employee has left the company");
            }
        }
    }


