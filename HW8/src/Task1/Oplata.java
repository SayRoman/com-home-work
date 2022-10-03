package Task1;

public abstract class Oplata {

    double day;
    float hours;
    long countOfFinishWork;
    double paymentOfDay = 100.0;
    double paymentOfHours = 22.1;
    double getPaymentOfFinishWork = 15;
    double salaryStavka;

    public Oplata(double day) {
        this.day = day;
    }

    public Oplata(float hours) {
        this.hours = hours;
    }

    public Oplata(int countOfFinishWork, float hours){
        this.countOfFinishWork = countOfFinishWork;
        this.hours = hours;
    };

    public Oplata(long countOfFinishWork) {
        this.countOfFinishWork = countOfFinishWork;
    };
}
