public class CreditCalculator {

    private final int MONTH_IN_YEAR = 12;

    public double calcMonthPayment(double amount, double rate, int monthCount) {
        return calcTotalAmount(amount, rate, monthCount) / monthCount;
    }

    public double calcTotalAmount(double amount, double rate, int monthCount) {
        return amount + calcRevenueAmount(amount, rate, monthCount);
    }

    public double calcRevenueAmount(double amount, double rate, int monthCount) {
        double monthRevenue = amount * rate / MONTH_IN_YEAR;
        return monthRevenue * monthCount;
    }
}