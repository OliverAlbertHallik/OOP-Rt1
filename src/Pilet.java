public class Pilet {

    private int koht;
    private boolean ostetud;

    public Pilet(int koht) {
        this.koht = koht;
    }

    public int getKoht() {
        return koht;
    }

    public void ostaPilet() {
        if (ostetud)
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