public class FutureValueCalculator {

    public static double futureValue(double amount, double rate, int years) {
        if (years == 0) {
            return amount;
        }
        return futureValue(amount, rate, years - 1) * (1 + rate);
    }
}