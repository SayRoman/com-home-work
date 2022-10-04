package HW7_2_Inheritance.BlackList;

public class Employee {

    Payment pay = new WageRate();
    Payment pay2 = new Hourly();
    private String fio;
    private String typePayment;
    private int workingDay;
    private double payment;

    private double workingHours;

    private double totalSalary;
    private double finalTotalSalary;

    private boolean children;


    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getTypePayment() {
        return typePayment;
    }

    public void setTypePayment(String typePayment) {
        this.typePayment = typePayment;
    }

    public int getWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(int workingDay) {
        this.workingDay = workingDay;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public boolean isChildren() {
        return children;
    }

    public void setChildren(boolean children) {
        this.children = children;
    }

    public void calculateTotalSalary() {
        if (getWorkingDay() >= 0) {
            this.totalSalary = getWorkingDay() * getPayment();
        }
        else if (getWorkingHours() >=0) {
            this.totalSalary = getWorkingHours() * getPayment();
        }
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void calculateFinalTotalSalary(double totalSalary) {
        if (isChildren() == false) {
            double totalTax = totalSalary * (pay.getTax() + 5) / 100;
            this.finalTotalSalary = totalSalary - totalTax;
        } else {
            double totalTax = totalSalary * pay.getTax() / 100;
            this.finalTotalSalary = totalSalary - totalTax;
        }
    }

    public String toString() {
        return "FIO: " + getFio() + ". Вид оплаты: " + getTypePayment() + ". Налог (%) = " + pay.getTax()
                + ". Cумма = " + totalSalary + ". К оплате = " + finalTotalSalary + " гр.";
    }
    public String toString2() {
        return "FIO: " + getFio() + ". Вид оплаты: " + getTypePayment() + ". Налог (%) = " + pay2.getTax()
                + ". Cумма = " + totalSalary + ". К оплате = " + finalTotalSalary + " гр.";
    }

}
