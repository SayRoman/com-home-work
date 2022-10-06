package HW7_2_Inheritance.Task3;

public class PieceWork extends Payment {

    public PieceWork(){
        super.setPaymentTypeName("Сделка");

            super.setTax(15);
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
