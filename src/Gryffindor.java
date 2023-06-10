
public class Gryffindor extends Hogwarts {
    private int nobility;
    private  int honor;
    private int bravery;

    public Gryffindor(String name, String surName, int power, int transgress, int nobility, int honor, int bravery) {
        super( name, surName, power, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    @Override
    public String toString() {
        return  "Гриффиндор. {" +
                super.toString()+
                ", благородство " + nobility +
                ", честь " + honor +
                ", храбрость " + bravery + "}";
    }
    @Override
    void printPerson() {
        System.out.println(this);
    }
    @Override
    int calcScoreInClass() {
        return this.nobility + this.bravery + this.honor;
    }
    @Override
    void printCompareOfStudents(Hogwarts best, Hogwarts worst) {
        System.out.println(String.format("%s лучший Гриффиндорец, чем %s", best.getName(), worst.getName()));
    }
}
