public class Lion extends Animal {
    public String Herkunft;

    /**
     * ich definiere die Konstruktor für die Klasse "Lion" mit gleichen Prametern
     */
    public Lion(String Tierart, String Name, int Chipnummer, String Fressverhalten, String Lebensraum, String IstBedroht, String Herkunft) {
        super(Tierart, Name, Chipnummer, Fressverhalten, Lebensraum, IstBedroht);
        this.Herkunft = Herkunft;
    }

    /**
     * diese Methode "text()" etnhält Informationen über das Tier
     */
    public String text() {
        System.out.println("\nThis " + Tierart + " has the name: " + Name + " and the number: " + Chipnummer + " " + Name + " lives in the\n" +
                Lebensraum + " and eats " + Fressverhalten + ".The lion is considered the king of beasts and in\n" +
                "this case" + Name + "is a specimen from" + Herkunft + ". Is the lion threatened?: " + IstBedroht + "\n");
        return null;
    }

}
