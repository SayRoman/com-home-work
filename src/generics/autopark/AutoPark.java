package generics.autopark;

import java.util.ArrayList;
import java.util.List;

public class AutoPark <E> {

     List <E> autoTransport;

     public AutoPark () {
         this.autoTransport = new ArrayList<>();
     }

     public void addTransport (E transport) {
         autoTransport.add(transport);
     }

    public List<E> getAutoTransport() {
        return autoTransport;
    }


}
