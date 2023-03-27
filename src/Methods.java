public class Methods {
    public void print(Griffindor[] griffindors) {
        for (int i = 0; i < griffindors.length; i++) {
            Griffindor griffindor = griffindors[i];
            System.out.println("Имя: " + griffindor.getName() + "; сила магии: " + griffindor.getWitchcraft() + "; " +
                    "расстояние трансгресии: " + griffindor.getTransgress() + "; благородство: " + griffindor.getNobility() +
                    "; честь: " + griffindor.getHonor() + "; храбрость: " + griffindor.getBravery());

        }
        System.out.println();
    }

    public void print(Puffendui[] puffenduis) {
        for (int i = 0; i < puffenduis.length; i++) {
            Puffendui puffendui = puffenduis[i];
            System.out.println("Имя: " + puffendui.getName() + "; сила магии: " + puffendui.getWitchcraft() + "; " +
                    "расстояние трансгресии: " + puffendui.getTransgress() + "; трудолюбие: " + puffendui.getIndustriousness() +
                    "; верность: " + puffendui.getLoyal() + "; честность: " + puffendui.getHonest());

        }
        System.out.println();
    }

    public void print(Kogtevran[] kogtevrans) {
        for (int i = 0; i < kogtevrans.length; i++) {
            Kogtevran kogtevran = kogtevrans[i];
            System.out.println("Имя: " + kogtevran.getName() + "; сила магии: " + kogtevran.getWitchcraft() + "; " +
                    "расстояние трансгресии: " + kogtevran.getTransgress() + "; ум: " + kogtevran.getSmart() +
                    "; мудрость: " + kogtevran.getWise() + "; остроумность: " + kogtevran.getWitty() + "; творчество: "
                    + kogtevran.getCreation());
        }
        System.out.println();
    }

    public void print(Slytherin[] slytherins) {
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Имя: " + slytherin.getName() + "; сила магии: " + slytherin.getWitchcraft() + "; " +
                    "расстояние трансгресии: " + slytherin.getTransgress() + "; хитрость: " + slytherin.getCunning() +
                    "; решительность: " + slytherin.getDetermination() + "; амбициозность: " + slytherin.getAmbition() + "; находчивость : "
                    + slytherin.getResourcefulness() + "; жажда власти: " + slytherin.getLustForPower());
        }
        System.out.println();
    }

    public void simileGriffindor(Griffindor[] griffindors, int i, int j) {
        int sumi = griffindors[i].getNobility() + griffindors[i].getHonor() + griffindors[i].getBravery();
        int sumj = griffindors[j].getNobility() + griffindors[j].getHonor() + griffindors[j].getBravery();
        if (sumi > sumj) {
            System.out.println("У " + griffindors[i].getName() + " сумма баллов равна " + sumi + ", а у " +
                    griffindors[j].getName() + " " + sumj + ". Значит " + griffindors[i].getName() + " лучший Гриффиндорец, чем " +
                    griffindors[j].getName());
        } else {
            System.out.println("У " + griffindors[j].getName() + " сумма баллов равна " + sumj + ", а у " +
                    griffindors[i].getName() + " " + sumi + ". Значит " + griffindors[j].getName() + " лучший Гриффиндорец, чем " +
                    griffindors[i].getName());
        }
    }

    public void similePuffendui(Puffendui[] puffenduis, int i, int j) {
        int sumi = puffenduis[i].getIndustriousness() + puffenduis[i].getLoyal() + puffenduis[i].getHonest();
        int sumj = puffenduis[j].getIndustriousness() + puffenduis[j].getLoyal() + puffenduis[j].getHonest();
        if (sumi > sumj) {
            System.out.println("У " + puffenduis[i].getName() + " сумма баллов равна " + sumi + ", а у " +
                    puffenduis[j].getName() + " " + sumj + ". Значит " + puffenduis[i].getName() + " лучший Пуффендуец, чем " +
                    puffenduis[j].getName());
        } else {
            System.out.println("У " + puffenduis[j].getName() + " сумма баллов равна " + sumj + ", а у " +
                    puffenduis[i].getName() + " " + sumi + ". Значит " + puffenduis[j].getName() + " лучший Пуффендуец, чем " +
                    puffenduis[i].getName());
        }
    }

    public void simileKogtevran(Kogtevran[] kogtevrans, int i, int j) {
        int sumi = kogtevrans[i].getSmart() + kogtevrans[i].getWise() + kogtevrans[i].getWitty() + kogtevrans[i].getCreation();
        int sumj = kogtevrans[j].getSmart() + kogtevrans[j].getWise() + kogtevrans[j].getWitty() + kogtevrans[j].getCreation();
        if (sumi > sumj) {
            System.out.println("У " + kogtevrans[i].getName() + " сумма баллов равна " + sumi + ", а у " +
                    kogtevrans[j].getName() + " " + sumj + ". Значит " + kogtevrans[i].getName() + " лучший Когтевранец, чем " +
                    kogtevrans[j].getName());
        } else {
            System.out.println("У " + kogtevrans[j].getName() + " сумма баллов равна " + sumj + ", а у " +
                    kogtevrans[i].getName() + " " + sumi + ". Значит " + kogtevrans[j].getName() + " лучший Когтевранец, чем " +
                    kogtevrans[i].getName());
        }
    }
    public void simileSlytherin(Slytherin[] slytherins, int i, int j) {
        int sumi = slytherins[i].getCunning() + slytherins[i].getDetermination() + slytherins[i].getAmbition() +
                slytherins[i].getResourcefulness() + slytherins[i].getLustForPower();
        int sumj = slytherins[j].getCunning() + slytherins[j].getDetermination() + slytherins[j].getAmbition() +
                slytherins[j].getResourcefulness() + slytherins[j].getLustForPower();
        if (sumi > sumj) {
            System.out.println("У " + slytherins[i].getName() + " сумма баллов равна " + sumi + ", а у " +
                    slytherins[j].getName() + " " + sumj + ". Значит " + slytherins[i].getName() + " лучший Слизеринец, чем " +
                    slytherins[j].getName());
        } else {
            System.out.println("У " + slytherins[j].getName() + " сумма баллов равна " + sumj + ", а у " +
                    slytherins[i].getName() + " " + sumi + ". Значит " + slytherins[j].getName() + " лучший Слизеринец, чем " +
                    slytherins[i].getName());
        }
    }
    public void simileHogwarts(Hogwarts[] hogwarts, int i, int j) {
        int sumi = hogwarts[i].getWitchcraft() + hogwarts[i].getTransgress();
        int sumj = hogwarts[j].getWitchcraft() + hogwarts[j].getTransgress();
        if (sumi > sumj) {
            System.out.println(hogwarts[i].getName() + " обладает бОльшей мощностью магии, чем " + hogwarts[j].getName());
        } else {
            System.out.println(hogwarts[j].getName() + " обладает бОльшей мощностью магии, чем " + hogwarts[i].getName());
        }
    }
}

