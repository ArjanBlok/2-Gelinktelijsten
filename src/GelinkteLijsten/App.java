package GelinkteLijsten;

/**
 * In deze opdracht verken je het generieke karakter van de gelinkte
 * datastructuur. Daarvoor programmeer je eerst de klasse 'GelinkteLijst'
 * (Linked List). Deze klasse is abstract. De Klasses Stapel (Stack) en Wachtrij
 * (Queue) implementeren de GelinkteLijst.
 *
 * - Zorg dat je criteria opstelt en beschrijf dit in de javadoc bij elke
 * methode. - Aan de hand van de criteria controleer je of de opdracht correct
 * werkt. - Implementeer tot slot de klasse App. Deze is bedoeld om de werking
 * van verschillende klassen te demonstreren.
 *
 * @author youritjang
 *
 */
public class App {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("programma gestart!");
        GelinkteLijst stapel = new GelinkteLijst();
        stapel.insertLast(8);
        //stapel.insertFirst(4);
        //stapel.insertLast(20);
        //stapel.insertBefore(25,30);
        
        stapel.insertBefore(30,20);
        stapel.insertBefore(20,20);
        stapel.remove(20);
        System.out.println(stapel.print());
        
        System.out.println("programma gestopt!");
    }

}
