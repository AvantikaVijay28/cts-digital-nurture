public class FinancialForecast 
{
    static double forecast(double currentValue, double growthRate, int years) 
    {

        if (years == 0) {
            return currentValue;
        }

        return forecast(currentValue, growthRate, years - 1)* (1 + growthRate / 100);
    }

    public static void main(String[] args) 
    {

        double currentValue = 10000;
        double growthRate = 8;
        int years = 5;

        double futureValue = forecast(currentValue, growthRate, years);

        System.out.println("Current Value: " + currentValue);
        System.out.println("Growth Rate: " + growthRate + "%");
        System.out.println("Years: " + years);
        System.out.println("Predicted Future Value: " + futureValue);
    }
}