public class Financialforecast {
    public static double predictFutureValue(double presentValue, double annualGrowthRate, int years) {
        if (years == 0) return presentValue;
        return predictFutureValue(presentValue * (1 + annualGrowthRate), annualGrowthRate, years - 1);
    }

    // Optimized version using memoization
    public static double predictFutureValueMemo(double presentValue, double annualGrowthRate, int years, Double[] memo) {
        if (years == 0) return presentValue;
        if (memo[years] != null) return memo[years];
        memo[years] = predictFutureValueMemo(presentValue * (1 + annualGrowthRate), annualGrowthRate, years - 1, memo);
        return memo[years];
    }

}
