import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Hogwarts[] hogwarts = {
                new Hogwarts("Гарри Поттер", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Hogwarts("Гермиона Грейнджер", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Hogwarts("Рон Уизли", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Hogwarts("Захария Смит", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Hogwarts("Седрик Диггори", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Hogwarts("Джастин Финч-Флетчли", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Hogwarts("Чжоу Чанг", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Hogwarts("Падма Патил", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Hogwarts("Маркус Белби", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Hogwarts("Драко Малфой", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Hogwarts("Грэхэм Монтегю", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Hogwarts("Грегори Гойл", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
        };
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
        Methods methods = new Methods();
        methods.print(griffindor);
        methods.print(puffendui);
        methods.print(kogtevran);
        methods.print(slytherin);
        methods.simileGriffindor(griffindor, 2, 1);
        methods.similePuffendui(puffendui, 0, 2);
        methods.simileKogtevran(kogtevran, 2,1);
        methods.simileSlytherin(slytherin, 0,1);
        methods.simileHogwarts(hogwarts, 10,2);}







    }
