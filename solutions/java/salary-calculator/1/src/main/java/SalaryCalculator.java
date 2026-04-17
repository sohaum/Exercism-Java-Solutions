public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        double x = daysSkipped>=5 ? 0.85 : 1.0;
        return x;
    }

    public int bonusMultiplier(int productsSold) {
        int monUnits = productsSold>=20 ? 13 : 10;
        return monUnits;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold*bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double sal = 1000*salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        return sal>=2000.00 ? 2000.00 : sal;
    } 
}
