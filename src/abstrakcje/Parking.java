package abstrakcje;

import java.util.ArrayList;
import java.util.List;

public class Parking {
    List<Samochod> auta = new ArrayList<Samochod>();
    
    public void wjedz(Samochod auto) {
        auta.add(auto);
        auto.jedz();
        auto.wylacz();     
    }
    
    public void status() {
        for(Samochod auto : auta) {
           System.out.println(auto.getNazwa());
        }
    }
    
    public void wypisz() {
        System.out.println("dupadupa");
    }
    
}
