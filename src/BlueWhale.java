public class BlueWhale extends Animal {
    public String Farbe;

    BlueWhale(String Tierart, String Name, int Chipnummer, String Fressverhalten, String Lebensraum, String IstBedroht, String Farbe) {
        super(Tierart, Name, Chipnummer, Fressverhalten, Lebensraum, IstBedroht);
        this.Farbe = Farbe;

    }

    public String text() {

        System.out.println("\nThis " + Tierart + " has the name: " + Name + " and the number: " + Chipnummer + " " + Name + "lives in\n" +
                "the" + Lebensraum + " and eats " + Fressverhalten + ". The blue whale is the largest sea creature.\n" +
                Name + " has the color as a distinguishing feature: " + Farbe + ". Is the blue whale threatened?:" + IstBedroht + "\n");
        return null;
    }

}
