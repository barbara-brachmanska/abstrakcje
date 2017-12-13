package abstrakcje;

public class App {
    int b = 4;
    
    public static void main(String[] args) {
   
        new Parking().wypisz();
       
        
        
        Parking park = new Parking();
        
        park.wjedz(new Opel("opel"));
        
        park.wjedz(new Audi("audi"));
        
        park.wjedz(new Opel());
        
        park.status();
    }
    
}
