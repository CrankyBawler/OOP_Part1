public class Puffendui extends Hogwarts {
    private int industriousness;
    private int loyal;
    private int honest;

    public Puffendui(String name, int witchcraft, int transgress, int industriousness, int loyal, int honest) {
        super(name, witchcraft, transgress);
        this.industriousness = industriousness;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }
}
