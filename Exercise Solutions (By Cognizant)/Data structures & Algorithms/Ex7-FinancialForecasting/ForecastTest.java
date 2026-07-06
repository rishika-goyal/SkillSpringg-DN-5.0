public class ForecastTest {
    public static void main(String[] args) {

        double amount = 10000.0;
        double rate = 0.08; // 8% per year
        int years = 5;

        double result = FutureValueCalculator.futureValue(amount, rate, years);

        System.out.println("Initial amount: " + amount);
        System.out.println("Rate: " + (rate * 100) + "%");
        System.out.println("Years: " + years);
        System.out.println("Future value after " + years + " years: " + String.format("%.2f", result));

        System.out.println();

        for (int y = 1; y <= years; y++) {
            double val = FutureValueCalculator.futureValue(amount, rate, y);
            System.out.println("Year " + y + ": " + String.format("%.2f", val));
        }
    }
}