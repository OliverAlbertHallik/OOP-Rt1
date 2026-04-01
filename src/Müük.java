import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Müük {

    private List<Pilet> piletidMüügil;

    public Müük(int n) { // Loob uue piletite müügi, kus on alguses n piletit kohtadele 1 kuni n.
        this.piletidMüügil = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            piletidMüügil.add(new Pilet(i));
        }
    }

    public boolean ostuKatse(int n) {
        if (n > piletidMüügil.size())
            return false; // Annab peaklassi meetodile teada, et programmi töö tuleb lõpetada.
        if (n == 0) {
            System.out.println("Pileteid ei soovitud osta.\nJärel on " + piletidMüügil.size() + " piletit.\n"); // Kahekordne reavahetus, vahele tühi rida.
            return true;
        }
        if (n < 0) {
            System.out.println("Siin ei saa ostetud pileteid tagastada.\n");
            return true;
        }

        List<Pilet> ümberJärjestatav = new ArrayList<>(); // Nii säilib müügil olevate piletite korrastatud kasvav järjekord, lisaks võimaldab uuest ArrayList-ist juba valitud piletid eemaldada.
        ümberJärjestatav.addAll(piletidMüügil);
        List<Pilet> pakutavad = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Collections.shuffle(ümberJärjestatav); // Juhusliku valimiseks juhuslik järjekord.
            pakutavad.add(ümberJärjestatav.getFirst()); // Valida pilet, mis on juhuslikult sattunud esimeseks.
            ümberJärjestatav.removeFirst(); // Eemaldada vastav pilet sellest loetelust, et sama piletit ei pakutaks mitmekordselt.
        }

        System.out.print("\nOstmiseks pakutavad piletid:\n[");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n-1; i++) {
            sb.append(pakutavad.get(i).getKoht());
            sb.append(',');
        }
        sb.append(pakutavad.getLast().getKoht());
        sb.append(']');
        System.out.println(sb); // Väljastada ekraanile StringBuilder isendi sisu.

        System.out.print("Kas kinnitada piletite ost? (J/e): ");
        Scanner scan = new Scanner(System.in);
        String kinnitus = scan.next().toLowerCase();
        if (kinnitus.equals("e") || kinnitus.equals("ei")) {
            System.out.println("Ostmine tühistatud.\n");
            return true; // Lõpeta see katse ja jätka peaklassis.
        }
        System.out.println("Piletite ostmine...");
        for (Pilet pilet : pakutavad) {
            pilet.ostaPilet(); // Lisa piletile kontrolliks märge, et see on ostetud.
            piletidMüügil.remove(pilet); // Eemalda ostetud pilet müüdavate nimekirjast.
        }
        System.out.print("Piletid ostetud.\nJärel on ");
        System.out.print(piletidMüügil.size());
        System.out.println(" piletit.\n"); // Kaks reavahetust korraga, vahele tühi rida.
        return true;
    }

    public List<Pilet> getPiletidMüügil() {
        return piletidMüügil;
    }
}
