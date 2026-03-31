import java.util.Random;

public class Peaklass {
    public static void main(String[] args) {
        Random juhuslik = new Random();
        int pileteidKokku = juhuslik.nextInt(30,150);
        Müük müük = new Müük(pileteidKokku);
        System.out.println("Pileteid on kokku " + pileteidKokku);
        //System.out.println(müük.getPiletidMüügil());
    }
}