import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1-Aufgabe
        String file = "src\\animals.csv";
        BufferedReader reader;
        String line;
        List<Animal> animalList = new ArrayList<>();

        /**
         * Zeile 24: try-Catch -> um die Eceptions beim Lesen der Datei abzufangen.
         * Zeile 25: ich verwende "BufferedReader", um die CSV-Datei zu lesen.
         * Zeile 26: for-Schleife -> jede Zeile der Datei zu lesen und zu verarbeiten.
         * Zeile 27: Diese Codezeile teilt eine Zeichenkette "line" anhand des Trennzeichens ";" auf.
         * Zeile 28-29-30: Switch-Anweisung -> um zu überprüfen und mit Case-Anweisungen zu vergleichen, damit in zeile-30 die neue Instanz der Klassen erzeugen wird.
         * Zeile 31-32 -> der neu erzeugene Objekt wird in AnimalList heinzugefügt danach wird die "text();" Methode aufgerufen.
         */
        try {
            reader = new BufferedReader(new FileReader(file));
            for (line = reader.readLine(); line != null; line = reader.readLine()) {
                String[] row = line.split(";");
                switch (row[0]) {
                    case "Lion" -> {
                        Lion lion = new Lion(row[0], row[1], Integer.parseInt(row[2]), row[3], row[4], row[5], row[8]);
                        animalList.add(lion);
                        lion.text();
                    }
                    case "Tiger" -> {
                        Tiger tiger = new Tiger(row[0], row[1], Integer.parseInt(row[2]), row[3], row[4], row[5]);
                        animalList.add(tiger);
                        tiger.text();
                    }
                    case "Elephant" -> {
                        Elephant elephant = new Elephant(row[0], row[1], Integer.parseInt(row[2]), row[3], row[4], row[5], Integer.parseInt(row[6]));
                        animalList.add(elephant);
                        elephant.text();
                    }
                    case "Blue Whale" -> {
                        BlueWhale blueWhale = new BlueWhale(row[0], row[1], Integer.parseInt(row[2]), row[3], row[4], row[5], row[7]);
                        animalList.add(blueWhale);
                        blueWhale.text();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        /**
         * ich habe Collection.reverse verwendet, um die "Animallist" in umkehter Reihenfolge zu sortieren
         */
        Collections.reverse(animalList);
        /**
         * ich verwende foor-Schleife, um jedes Tier in der umgekehrten Reihenfolge auszugeben
         */
        for (Animal animal : animalList) {
            animal.text();
        }
    }
}












