package HW7_2_Inheritance.Task1;

public abstract class Payment {

    private String paymentTypeName;


    public String getPaymentTypeName() {
        return paymentTypeName;
    }

    public void setPaymentTypeName(String paymentTypeName) {
        this.paymentTypeName = paymentTypeName;
    }

    public abstract double calculateSalary(double payment);
}
