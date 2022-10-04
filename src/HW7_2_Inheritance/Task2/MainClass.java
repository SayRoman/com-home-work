package HW7_2_Inheritance.Task2;

public class MainClass {
    public static void main(String[] args) {

        Person employee1 = new Person();
        Payment payment1 = new WageRate();
        employee1.setFIO("Дмитриев Дмитрий Дмитриевич");
        employee1.setWorkingDays(30);
        employee1.setPayment(300);
        employee1.typeOfPayment = payment1;
        employee1.getSalary();
        employee1.getFinalSalary();
        System.out.println(employee1.toString());

        Person employee2 = new Person();
        Payment payment2 = new Hourly();
        employee2.setFIO("Алексеев Алексей Алексеевич");
        employee2.setWorkingHours(250);
        employee2.setPayment(30);
        employee2.typeOfPayment = payment2;
        employee2.getSalary();
        employee2.getFinalSalary();
        System.out.println(employee2.toString());

        Person employee3 = new Person();
        Payment payment3 = new PieceWork();
        employee3.setFIO("Николаев Николай Николаевич");
        employee3.setWorkingPiece(150);
        employee3.setPayment(75);
        employee3.typeOfPayment = payment3;
        employee3.getSalary();
        employee3.getFinalSalary();
        System.out.println(employee3.toString());

    }
}
