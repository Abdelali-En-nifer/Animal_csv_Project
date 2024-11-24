public class Elephant extends Animal {
    public int Groesse;

    public Elephant(String Tierart, String Name, int Chipnummer, String Fressverhalten, String Lebensraum, String IstBedroht, int Groesse) {
        super(Tierart, Name, Chipnummer, Fressverhalten, Lebensraum, IstBedroht);
        this.Groesse = Groesse;
    }

    public String text() {
        System.out.println("\nThis " + Tierart + " has the name: " + Name + " and the number: " + Chipnummer + " " + Name + " lives in the\n" +
                Lebensraum + " and eats " + Fressverhalten + "The elephant is the largest land creature and" + Name +
                "measures\n" + Groesse + ". Is the elephant threatened?: " + IstBedroht + "\n");
        return null;
    }
}
