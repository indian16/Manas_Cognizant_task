//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double initialValue = 1000.0;
        double growthRate = 0.08; // 8% annual growth
        int forecastYears = 10;

        // Simple recursive prediction
        double futureValue = Financialforecast.predictFutureValue(initialValue, growthRate, forecastYears);
        System.out.println("Future Value (Recursive): $" + String.format("%.2f", futureValue));

        // Optimized recursive prediction
        Double[] memo = new Double[forecastYears + 1];
        double memoizedValue = Financialforecast.predictFutureValueMemo(initialValue, growthRate, forecastYears, memo);
        System.out.println("Future Value (Memoized): $" + String.format("%.2f", memoizedValue));
    }
}
