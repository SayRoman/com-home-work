package HW7_2_Inheritance.Task2;

public abstract class Payment {

    private String paymentTypeName;
    private double tax;



    public String getPaymentTypeName() {
        return paymentTypeName;
    }

    public void setPaymentTypeName(String paymentTypeName) {
        this.paymentTypeName = paymentTypeName;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public abstract double calculateSalary(double payment);
    public abstract double calculateFinalSalary(double payment);

}
