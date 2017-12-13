package abstrakcje;

public class Audi extends Samochod{

    public Audi(String nazwa) {
        super(nazwa);
    }

    @Override
    public void jedz() {
        System.out.println("Jedzie audi co ma " + kola + " kola.");       
    }

    @Override
    public void wylacz() {
        System.out.println("Wylaczam audi");       
    }
}
