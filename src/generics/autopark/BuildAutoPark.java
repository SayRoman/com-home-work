package generics.autopark;

public class BuildAutoPark {
    public static void main(String[] args) {

        AutoPark<BoxForTransport> autoPark = new AutoPark<>();

        BoxForTransport<Bus> busBox = new BoxForTransport<>();
        Bus b1 = new Bus();
        busBox.setTransport(b1);

        BoxForTransport<Cars> carsBox = new BoxForTransport<>();
        Cars c1 = new Cars();
        Cars c2 = new Cars();
        carsBox.setTransport(c1);
        carsBox.setTransport(c2);

        autoPark.addTransport(busBox);
        autoPark.addTransport(carsBox);
        autoPark.addTransport(carsBox);

        for (BoxForTransport b : autoPark.getAutoTransport()) {
            System.out.println(b.toString());
        }
    }
}
