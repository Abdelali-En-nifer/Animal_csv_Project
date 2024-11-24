public class Tiger extends Animal {
    Tiger(String Tierart, String Name, int Chipnummer, String Fressverhalten, String Lebensraum, String IstBedroht) {
        super(Tierart, Name, Chipnummer, Fressverhalten, Lebensraum, IstBedroht);
    }

    public String text() {
        System.out.println("\nThis " + Tierart + " has the name: " + Name + " and the number: " + Chipnummer + " " + Name + " lives\n" +
                "in the" + Lebensraum + " and eats " + Fressverhalten + ". The Sumatran tiger is not afraid of water\n" +
                "and is a very good swimmer. That’s why he has webbed feet between his toes. Is the\n" +
                "sumatran tiger threatened?: " + IstBedroht + "\n");

        return null;
    }
}
