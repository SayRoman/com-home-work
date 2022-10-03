package Task1;

public class Main {
    public static void main(String[] args) {
        Stavka stavka = new Stavka(5);
        Employer employer1 = new Employer("Ivan", "Ivanov", "Ivanovich");
        System.out.println(employer1.toString() + " " + stavka.toString());
    }
}
