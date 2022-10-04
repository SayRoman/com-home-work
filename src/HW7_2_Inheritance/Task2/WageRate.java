package HW7_2_Inheritance.Task2;

public class WageRate extends Payment {

    public WageRate() {
        super.setPaymentTypeName("Ставка");
        super.setTax(20);
    }

    @Override
    public double calculateSalary(double payment) {
        return payment;
    }

    @Override
    public double calculateFinalSalary(double payment) {
        double totalTax = payment * getTax() / 100;
        return payment - totalTax;
    }
}
