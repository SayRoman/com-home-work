package HW7_2_Inheritance.Task1;

public class PieceWork extends Payment{

    public PieceWork(){
        super.setPaymentTypeName("Сделка");
    }
    @Override
    public double calculateSalary(double payment) {
        return payment;
    }
}
