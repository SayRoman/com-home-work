package HW7_2_Inheritance.Task3;

public class Person {

    private String FIO;
    Payment typeOfPayment;

    private boolean children;
    private double payment;

    private String kids;
    private double workingDays;
    private double workingHours;
    private double workingPiece;
    private double salaryWithoutTax;

    private double finalSalary;

    public String getFIO() {
        return FIO;
    }

    public boolean isChildren() {
        return children;
    }

    public void setChildren(boolean children) {
        this.children = children;
    }

    public String getKids() {
        if (children){
            this.kids = "Да";}
        if (children ){
            this.kids = "Нет";}
        return kids;
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

    public void getSalary() {
        if (workingDays != 0 && workingDays > 0) {
            this.salaryWithoutTax = typeOfPayment.calculateSalary(getPayment() * getWorkingDays());
        } else if (workingHours != 0 && workingHours > 0) {
            this.salaryWithoutTax = typeOfPayment.calculateSalary(getPayment() * getWorkingHours());
        } else {
            this.salaryWithoutTax = typeOfPayment.calculateSalary(getPayment() * getWorkingPiece());
        }
    }
    public void getFinalSalary() {
        if (workingDays != 0 && workingDays > 0 ) {
            this.finalSalary = typeOfPayment.calculateFinalSalary(getPayment() * getWorkingDays());
        } else if (workingHours != 0 && workingHours > 0) {
            this.finalSalary = typeOfPayment.calculateFinalSalary(getPayment() * getWorkingHours());
        } else {
            this.finalSalary = typeOfPayment.calculateFinalSalary(getPayment() * getWorkingPiece());
        }
    }


    @Override
    public String toString() {

             return "FIO: " + getFIO() + ". Наличие детей: " + getKids() + ". Налог (%) = " + typeOfPayment.getTax() + ". Способ оплаты:  " +
                 typeOfPayment.getPaymentTypeName() +  ". Сумма = " + salaryWithoutTax +
                 ". Оплата = " + finalSalary + "гр."; }
    }

