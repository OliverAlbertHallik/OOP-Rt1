import java.util.Random;

public class Peaklass {
    public static void main(String[] args) {
        Random juhuslik = new Random();
        int pileteidKokku = juhuslik.nextInt(30,151);
        Müük müük = new Müük(pileteidKokku); // Loob piletite müügi, milles alguses on etteantud juhuslik arv pileteid.
        System.out.println("Pileteid on kokku " + pileteidKokku);
        //System.out.println(müük.getPiletidMüügil());
        int ostusoov = 0;
        do {

        } while (müük.ostuKatse(ostusoov));
        System.out.println("Küsiti rohkem pileteid, kui vabu kohti jäänud on.");
    }
}