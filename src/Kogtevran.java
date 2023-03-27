public class Kogtevran extends Hogwarts{
    private int smart;
    private int wise;
    private int witty;
    private int creation;

    public Kogtevran(String name, int witchcraft, int transgress, int smart, int wise, int witty, int creation) {
        super(name, witchcraft, transgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creation = creation;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreation() {
        return creation;
    }

}
