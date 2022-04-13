import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCalculatorTest {

    @Test
    public void testCalcMonthPayment() {
        CreditCalculator creditCalculator = new CreditCalculator();
        double creditAmount = 100000.0;
        double rate = 0.12;
        int monthCount = 20;
        double expectedAmount = 6000.0;
        double calculatedAmount = creditCalculator.calcMonthPayment(creditAmount, rate, monthCount);
        assertEquals(expectedAmount, calculatedAmount, 0.0);
    }

    @Test
    public void testCalcTotalAmount() {
        CreditCalculator creditCalculator = new CreditCalculator();
        double creditAmount = 100000.0;
        double rate = 0.12;
        int monthCount = 20;
        double expectedAmount = 120000.0;
        double calculatedAmount = creditCalculator.calcTotalAmount(creditAmount, rate, monthCount);
        assertEquals(expectedAmount, calculatedAmount, 0.0);
    }

    @Test
    public void testCalcRevenueAmount() {
        CreditCalculator creditCalculator = new CreditCalculator();
        double creditAmount = 100000.0;
        double rate = 0.12;
        int monthCount = 20;
        double expectedAmount = 20000.0;
        double calculatedAmount = creditCalculator.calcRevenueAmount(creditAmount, rate, monthCount);
        assertEquals(expectedAmount, calculatedAmount, 0.0);
    }
}
