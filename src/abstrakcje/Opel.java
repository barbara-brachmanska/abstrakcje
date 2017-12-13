package abstrakcje;

public class Opel extends Samochod{

    public Opel() {
        super("opel-domyslny");
    }
    public Opel(String nazwa) {
        super(nazwa, 5);  
    }

    @Override
    public void jedz() {
        kola++;
        System.out.println("Jedzie opel co ma " + kola + " kola.");       
    }

    @Override
    public void wylacz() {
        System.out.println("Wylaczam opel");       
    }



}
