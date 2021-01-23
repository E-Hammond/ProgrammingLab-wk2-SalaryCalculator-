public class FooCorporation {
    public static double salaryCalculator(double basePay, int hoursWorked) {
        double salary = 0;
        int overtimeHour;
        if (basePay < 8 || hoursWorked > 60) {
            System.out.println("Either Base pay is less than minimum wage ($8.00) or hours worked exceeds available hours.");
        } else if (hoursWorked >= 0 && hoursWorked <= 40) {
            double salary1 = basePay * hoursWorked;
            salary += salary1;
        } else if (hoursWorked > 40) {
            overtimeHour = hoursWorked - 40;
            double overtimePay = overtimeHour * 1.5 * basePay;
            double salary1 = basePay * 40;
            double salary2 = salary1 + overtimePay;
            salary += salary2;
        }
        return salary;
    }
}
