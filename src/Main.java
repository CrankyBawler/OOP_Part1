import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Griffindor[] griffindor = {
                new Griffindor("Гарри Поттер", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(),
                        Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Griffindor("Гермиона Грейнджер", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(),
                        Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Griffindor("Рон Уизли", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(),
                        Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber())
        };

        Puffendui [] puffendui = {
                new Puffendui("Захария Смит", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(),
                        Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Puffendui("Седрик Диггори", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(),
                        Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Puffendui("Джастин Финч-Флетчли", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(),
                        Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber())
        };
        Kogtevran[] kogtevran = {
                new Kogtevran("Чжоу Чанг", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(),
                        Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Kogtevran("Падма Патил", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(),
                        Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Kogtevran("Маркус Белби", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(),
                        Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),

        };
        Slytherin[] slytherin = {
                new Slytherin("Драко Малфой", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(),
                        Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(),
                        Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Slytherin("Грэхэм Монтегю", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(),
                        Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(),
                        Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Slytherin("Грегори Гойл", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(),
                        Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(),
                        Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
        };
        PrintServis printServis = new PrintServis();
        printServis.print(griffindor);
        printServis.print(puffendui);
        printServis.print(kogtevran);
        printServis.print(slytherin);
        }






    }
