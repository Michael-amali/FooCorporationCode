public class FooCorporation {
    public static void main(String[] args) {

        printTotalPay(7.50, 35);
        printTotalPay(8.20, 47);
        printTotalPay(10.0, 73);
    }

    public static void printTotalPay(double basePay, int hoursWorked){
        double minimumWage = 8.0;
        double totalPay = 0;
        int maximumNormalWorkingHours = 40;
        int maximumAcceptableWorkingHours = 60;
        int minimumNormalWorkingHours = 0;
        int hoursOverTime = hoursWorked - 40;
        double overTimePay = (basePay * 1.5) * hoursOverTime;

        if(((hoursWorked >= minimumNormalWorkingHours) &&
                (hoursWorked <= maximumAcceptableWorkingHours) && (basePay >= minimumWage))) {
            if(hoursWorked > maximumNormalWorkingHours){
                totalPay = overTimePay + (basePay * maximumNormalWorkingHours);
                System.out.printf("Total pay is: $%.2f", totalPay);
                System.out.println();
            } else {
                totalPay = basePay * hoursWorked;
                System.out.printf("Total pay is: $%.2f", totalPay);
                System.out.println();
            }
        } else{
            System.out.println("Error!!! Either below minimum wage or out of working hour range");
        }
    }
}
