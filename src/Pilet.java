public class Pilet {

    private int koht;
    private boolean ostetud;

    public Pilet(int koht) {
        this.koht = koht; // Konstruktor pileti loomiseks, määrab sellele vastava koha bussis.
    }

    public int getKoht() {
        return koht; // Millisele kohale bussis pilet vastab.
    }

    public void ostaPilet() {
        if (ostetud) // Kontroll, et programmi vea tagajärjel ei müüdaks sama piletit uuesti.
            throw new RuntimeException("Viga pileti ostmisel: Pilet on juba varem ostetud");
        ostetud = true;
    }

    @Override
    public String toString() {
        return "Pilet{" +
                "koht=" + koht +
                ", ostetud=" + ostetud +
                '}';
    }
}