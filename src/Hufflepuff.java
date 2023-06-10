public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private  int loyalty;
    private int honesty;

    public Hufflepuff(String name, String surName, int power, int transgress, int industriousness, int loyalty, int honesty) {
        super(name, surName, power, transgress);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    int calcScoreInClass() {
        return this.industriousness + this.loyalty + this.honesty;
    }
    @Override
    void printCompareOfStudents(Hogwarts best, Hogwarts worst) {
        System.out.println(String.format("%s лучший Пуффендуец, чем %s", best.getName(), worst.getName()));
    }
    @Override
    public String toString() {
        return "Пуффендуй. {"+
                super.toString() +
                ", трудолюбие " + industriousness +
                ", верность " + loyalty +
                ", честность " + honesty + "}";
    }
    @Override
    void printPerson() {
        System.out.println(this);
    }
}
