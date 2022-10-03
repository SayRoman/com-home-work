package HW7_2;

public class Employee {

    Payment pay = new WageRate();
    private String fio;
    private String typePayment;
    private int workingDay;
    private double payment;
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

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public void calculateTotalSalary() {
        if (getWorkingDay() !=0 ) {
            this.totalSalary = getWorkingDay() * getPayment();
        } else {}
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void calculateFinalTotalSalary(double totalSalary){
        double totalTax = totalSalary * pay.getTax() / 100;
        this.finalTotalSalary = totalSalary - totalTax;
    }

    public String toString() {
        return "FIO: " + getFio() + ". Вид оплаты: " + getTypePayment() + ". Налог (%) = " + pay.getTax()
                + ". Cумма = " + totalSalary + ". К оплате = " + finalTotalSalary + " гр.";
     }

}
