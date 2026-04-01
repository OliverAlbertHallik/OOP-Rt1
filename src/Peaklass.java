import java.util.Random;

public class Peaklass {
    public static void main(String[] args) {
        System.out.println("Bussipiletite ostmine: Müügil on piletid bussis vabadele kohtadele.");
        System.out.println("Pärast ostetavate piletite soovitud koguse sisestamist pakutakse juhuslikult valitud piletid vabadele kohtadele, kasutaja saab tehingu kinnitada või ostmisest loobuda.");
        System.out.println("Kui piletid on müüdud, on edaspidi bussis vähem vabu kohti järel. Ülejäänud piletite ostmist saab jätkata, kuni küsitakse korra rohkem pileteid, kui vabu kohti järel on.\n");
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