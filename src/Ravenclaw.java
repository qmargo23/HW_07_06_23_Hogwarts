public class Ravenclaw extends Hogwarts {
    private int mind;
    private  int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name,String surName,int power,int transgress,int mind,int wisdom, int wit, int creativity) {
        super(name,surName,power,transgress);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }
    @Override
    int calcScoreInClass() {
        return this.mind + this.wisdom + this. wit + this.creativity;
    }
    @Override
    void printCompareOfStudents(Hogwarts best, Hogwarts worst) {
        System.out.println(String.format("%s лучший Когтевран, чем %s", best.getName(), worst.getName()));
    }
    @Override
    public String toString() {
        return  "Когтевран. {" +
                super.toString() +
                ", ум " + mind +
                ", мудрость " + wisdom +
                ", остроумие " + wit +
                ", творчество " + creativity + "}";
    }
    @Override
    void printPerson() {
        System.out.println(this);
    }
}
