package HW7_2;

public class MainClass {
    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.setFio("Андреев Андрей Андреевич");
        employee.setTypePayment("Ставка");
        employee.setWorkingDay(30);
        employee.setPayment(350);
        employee.calculateTotalSalary();
        employee.calculateFinalTotalSalary(employee.getTotalSalary());
        System.out.println(employee.toString());
    }
}
