public class PrintServis {
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
}

