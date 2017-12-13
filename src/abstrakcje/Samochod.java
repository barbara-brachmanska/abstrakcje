package abstrakcje;

public abstract class Samochod {
    protected int kola = 4;
    protected String nazwa;
    
    public Samochod(String nazwa) {
        this.nazwa = nazwa;
    }
    public Samochod(String nazwa, int kola) {
        this.nazwa = nazwa;
        this.kola = kola;
    }
    
    public String getNazwa() {
        return this.nazwa;
    }
    public abstract void jedz();
    public abstract void wylacz();
    public void uruchom() {
        System.out.println("uruchamiam");
    }
}
