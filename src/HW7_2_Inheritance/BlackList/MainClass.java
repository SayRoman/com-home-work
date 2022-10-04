package HW7_2_Inheritance.BlackList;

public class MainClass {
    public static void main(String[] args) {

        Employee employee = new Employee();
        Employee employee2 = new Employee();

        employee.setFio("Андреев Андрей Андреевич");
        employee.setTypePayment("Ставка");
        employee.setWorkingDay(31);
        employee.setPayment(350);
        employee.setChildren(true);
        employee.calculateTotalSalary();
        employee.calculateFinalTotalSalary(employee.getTotalSalary());
        System.out.println(employee.toString());

        employee2.setFio("Феаноров Феанор Феонорович");
        employee2.setTypePayment("Почасовая");
        employee2.setWorkingHours(200);
        employee2.setPayment(20);
        employee2.setChildren(true);
        employee2.calculateTotalSalary();
        employee2.calculateFinalTotalSalary(employee2.getTotalSalary());
        System.out.println(employee2.toString2());
    }
}
