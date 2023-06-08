public class PrintPerson {
    public void print() {
        System.out.println("Студенты Хогвартс.");
    }
    public void print(Gryffindor[] gryffindors) {
        System.out.println("Список Гриффиндор:");
        for (Gryffindor gryffindor : gryffindors) {
            System.out.println("Студент: " + gryffindor.getName() + " " + gryffindor.getSurName()
                    + " - сила магии " + gryffindor.getPower()
                    + "; расстояние трансгрессии " + gryffindor.getTransgress()
                    + "; благородство " + gryffindor.getNobility()
                    + "; честь " + gryffindor.getHonor()
                    + "; храбрость " + gryffindor.getBravery() + ".");
        }
        System.out.println();
    }
    public void print(Slytherin[] slytherins) {
        System.out.println("Список Слизерин:");
        for (Slytherin slytherin : slytherins) {
            System.out.println("Студент: " + slytherin.getName() + " " + slytherin.getSurName() +
                    " - сила магии " + slytherin.getPower() +
                    "; расстояние трансгрессии " + slytherin.getTransgress() +
                    "; хитрость " + slytherin.getTheTrick() +
                    "; решительность " + slytherin.getDetermination() +
                    "; амбициозность " + slytherin.getAmbition() +
                    "; находчивость  " + slytherin.getResourcefulness() +
                    "; жажда власти  " + slytherin.getLustForPower() +
                    ".");
        }
        System.out.println();
    }
    public void print(Hufflepuff[] hufflepuffs) {
        System.out.println("Список Пуффендуй:");
        for (Hufflepuff hufflepuff : hufflepuffs) {
            System.out.println("Студент: " + hufflepuff.getName() + " " + hufflepuff.getSurName() +
                    " - сила магии " + hufflepuff.getPower() +
                    "; расстояние трансгрессии " + hufflepuff.getTransgress() +
                    "; трудолюбие " + hufflepuff.getIndustriousness() +
                    "; верность " + hufflepuff.getLoyalty() +
                    "; честность " + hufflepuff.getHonesty() +
                    ".");
        }
        System.out.println();
    }
    public void print(Ravenclaw[] ravenclaws) {
        System.out.println("Список Когтевран:");
        for (Ravenclaw ravenclaw : ravenclaws) {
            System.out.println("Студент: " + ravenclaw.getName() + " " + ravenclaw.getSurName() +
                    " - сила магии " + ravenclaw.getPower() +
                    "; расстояние трансгрессии " + ravenclaw.getTransgress() +
                    "; ум " + ravenclaw.getMind() +
                    "; мудрость " + ravenclaw.getWisdom() +
                    "; остроумие " + ravenclaw.getWit() +
                    "; творчество " + ravenclaw.getCreativity() +
                    ".");
        }
        System.out.println();
    }
    public void print(int i, int j, Gryffindor[] gryffindors) {
        System.out.println("Лучший Гриффиндорец на факультете:");
        if (0 <= i && i <= gryffindors.length && 0 <= j && j <= gryffindors.length){
        int person1 = gryffindors[i].getPower() +
                gryffindors[i].getTransgress() +
                gryffindors[i].getNobility() +
                gryffindors[i].getHonor() +
                gryffindors[i].getBravery();
        int person2 = gryffindors[j].getPower() +
                gryffindors[j].getTransgress() +
                gryffindors[j].getNobility() +
                gryffindors[j].getHonor() +
                gryffindors[j].getBravery();
        if (person1 > person2) System.out.println(gryffindors[i].getName() + "  лучший Гриффиндорец, чем " + gryffindors[j].getName());
        else System.out.println(gryffindors[j].getName() + "  лучший Гриффиндорец, чем " + gryffindors[i].getName());
        } else System.out.println("значения введены неверно");
    }
    public void print(int i, int j, Slytherin[] slytherins) {
        System.out.println("Лучший Слизеринец на факультете:");
        if (0 <= i && i <= slytherins.length && 0 <= j && j <= slytherins.length){
            int person1 = slytherins[i].getPower() +
                    slytherins[i].getTransgress() +
                    slytherins[i].getTheTrick() +
                    slytherins[i].getDetermination() +
                    slytherins[i].getAmbition() +
                    slytherins[i].getResourcefulness() +
                    slytherins[i].getLustForPower();
            int person2 = slytherins[j].getPower() +
                    slytherins[j].getTransgress() +
                    slytherins[j].getTheTrick() +
                    slytherins[j].getDetermination() +
                    slytherins[j].getAmbition() +
                    slytherins[j].getResourcefulness() +
                    slytherins[j].getLustForPower();
            if (person1 > person2) System.out.println(slytherins[i].getName() + "  лучший Слизеринец, чем " + slytherins[j].getName());
            else System.out.println(slytherins[j].getName() + "  лучший Слизеринец, чем " + slytherins[i].getName());
        } else System.out.println("значения введены неверно");
    }
    public void print(int i, int j, Hufflepuff[] hufflepuffs) {
        System.out.println("Лучший Пуффендорец на факультете:");
        if (0 <= i && i <= hufflepuffs.length && 0 <= j && j <= hufflepuffs.length){
            int person1 = hufflepuffs[i].getPower() +
                    hufflepuffs[i].getTransgress() +
                    hufflepuffs[i].getIndustriousness() +
                    hufflepuffs[i].getLoyalty() +
                    hufflepuffs[i].getHonesty();
            int person2 = hufflepuffs[j].getPower() +
                    hufflepuffs[j].getTransgress() +
                    hufflepuffs[j].getIndustriousness() +
                    hufflepuffs[j].getLoyalty() +
                    hufflepuffs[j].getHonesty();
            if (person1 > person2) System.out.println(hufflepuffs[i].getName() + "  лучший из Пуффендуй, чем " + hufflepuffs[j].getName());
            else System.out.println(hufflepuffs[j].getName() + "  лучший из Пуффендуй, чем " + hufflepuffs[i].getName());
        } else System.out.println("значения введены неверно");
    }
    public void print(int i, int j, Ravenclaw[] ravenclaws) {
        System.out.println("Лучший из Когтевран  на факультете:");
        if (0 <= i && i <= ravenclaws.length && 0 <= j && j <= ravenclaws.length){
            int person1 = ravenclaws[i].getPower() +
                    ravenclaws[i].getTransgress() +
                    ravenclaws[i].getMind() +
                    ravenclaws[i].getWisdom() +
                    ravenclaws[i].getWit() +
                    ravenclaws[i].getCreativity();
            int person2 = ravenclaws[j].getPower() +
                    ravenclaws[j].getTransgress() +
                    ravenclaws[j].getMind() +
                    ravenclaws[j].getWisdom() +
                    ravenclaws[j].getWit() +
                    ravenclaws[j].getCreativity();
            if (person1 > person2) System.out.println(ravenclaws[i].getName() + "  лучший из Когтевран, чем " + ravenclaws[j].getName());
            else System.out.println(ravenclaws[j].getName() + "  лучший из Когтевран, чем " + ravenclaws[i].getName());
        } else System.out.println("значения введены неверно");
    }
    public void print(int i, int j, Hogwarts[] students) {
        System.out.println("Дуэль студентов Хогвартс:");
        if (0 <= i && i <= students.length && 0 <= j && j <= students.length){
            int person1 = students[i].getPower();
            int person2 = students[j].getPower();

            if (person1 > person2) System.out.println(students[i].getName() + "  обладает бОльшей мощностью магии, чем " + students[j].getName());
            else System.out.println(students[j].getName() + "  обладает бОльшей мощностью магии, чем  " + students[i].getName());
            person1 = students[i].getTransgress();
            person2 = students[j].getTransgress();

            if (person1 > person2) System.out.println(students[i].getName() + "  обладает бОльшим расстоянием трансгрессии, чем " + students[j].getName());
            else System.out.println(students[j].getName() + "  обладает бОльшим расстоянием трансгрессии, чем  " + students[i].getName());
        } else System.out.println("значения введены неверно");

    }
}

