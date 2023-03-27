public class Hogwarts {
    private String name;
    private int witchcraft;
    private int transgress;

    public Hogwarts(String name, int witchcraft, int transgress) {
        this.name = name;
        this.witchcraft = witchcraft;
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public int getTransgress() {
        return transgress;
    }

    public static int randomDiceNumber() {
        return (int) (Math.random() * 100);
    }


    }
