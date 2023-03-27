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

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }
}
