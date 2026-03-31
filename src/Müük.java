import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

        List<Pilet> ümberJärjestatav = new ArrayList<>(); // Nii säilib müügil olevate piletite korrastatud kasvav järjekord.
        Collections.copy(ümberJärjestatav,piletidMüügil);
        List<Pilet> pakutavad = new ArrayList<>();

        for (int i = 0; i < n; i++) {

        }
        return true;
    }

    public List<Pilet> getPiletidMüügil() {
        return piletidMüügil;
    }
}
