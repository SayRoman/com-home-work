package HW7_2_Inheritance.Task1;

public class Hourly extends Payment{

    public Hourly(){
        super.setPaymentTypeName("Почасовая");
    }

    @Override
    public double calculateSalary(double payment) {
        return payment;
    }
}
