package HW7_2_Inheritance.Task3;

public class WageRate extends Payment {

    public WageRate() {

        if (super.getChildren() == false) {
            super.setTax(25);
        } else {
            super.setTax(20);
        }
        super.setPaymentTypeName("Ставка");

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
