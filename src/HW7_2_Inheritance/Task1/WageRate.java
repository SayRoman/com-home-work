package HW7_2_Inheritance.Task1;

public class WageRate extends Payment{

    public WageRate() {
        super.setPaymentTypeName("Ставка");
    }

    @Override
    public double calculateSalary(double payment) {
        return payment;
    }
}
