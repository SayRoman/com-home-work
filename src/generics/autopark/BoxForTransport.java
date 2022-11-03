package generics.autopark;

public class BoxForTransport <E>{

    private E transport;

    public void setTransport(E transport) {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return "Transport: " + transport.toString();
    }


}
