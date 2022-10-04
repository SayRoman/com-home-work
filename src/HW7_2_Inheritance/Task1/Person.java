package HW7_2_Inheritance.Task1;

public class Person {

    private String FIO;
    Payment typeOfPayment;
    private double payment;
    private double workingDays;
    private double workingHours;
    private double workingPiece;

    private double finalSalary;

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public double getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(double workingDays) {
        this.workingDays = workingDays;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    public double getWorkingPiece() {
        return workingPiece;
    }

    public void setWorkingPiece(double workingPiece) {
        this.workingPiece = workingPiece;
    }

    public void getFinalSalary() {
        if (workingDays !=0 && workingDays >0) {
            this.finalSalary = typeOfPayment.calculateSalary(getPayment() * getWorkingDays());
        } else if (workingHours != 0 && workingHours >0) {
            this.finalSalary = typeOfPayment.calculateSalary(getPayment() * getWorkingHours());
        } else {
            this.finalSalary = typeOfPayment.calculateSalary(getPayment() * getWorkingPiece());
        }
    }


    @Override
    public String toString() {
        return  "FIO: " + getFIO() + ". Способ оплаты:  " + typeOfPayment.getPaymentTypeName() +
                ". Оплата = " + finalSalary + "гр.";
    }
}
