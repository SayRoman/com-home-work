package HW7_2_Inheritance.Task3;

public abstract class Payment {

    private String paymentTypeName;
    private double tax;
    private boolean isChildren;


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

    public boolean getChildren() {
        return isChildren;
    }

    public void setChildren(boolean children) {
        this.isChildren = children;
    }

    public abstract double calculateSalary(double payment);

    public abstract double calculateFinalSalary(double payment);

}
