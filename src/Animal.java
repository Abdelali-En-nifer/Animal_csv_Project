public abstract class Animal {
    public String Tierart;
    public String Name;
    public int Chipnummer;
    public String Fressverhalten;
    public String Lebensraum;
    public String IstBedroht;


    /**
     * ich initialisiere die Attribute mit Hilfe von Konstruktor
     */
    public Animal(String Tierart, String Name, int Chipnummer, String Fressverhalten, String Lebensraum, String IstBedroht) {
        this.Tierart = Tierart;
        this.Name = Name;
        this.Chipnummer = Chipnummer;
        this.Fressverhalten = Fressverhalten;
        this.Lebensraum = Lebensraum;
        this.IstBedroht = IstBedroht;

    }

    /**
     * i create an abstract Methode that does return a value and can be accessed from anywhere
     */
    public abstract String text();


}
