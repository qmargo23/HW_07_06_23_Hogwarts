public class Slytherin extends Hogwarts {
    private int theTrick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;
    public Slytherin(String name, String surName, int power, int transgress, int theTrick, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name,surName,power,transgress);
        this.theTrick = theTrick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }
    @Override
    public String toString() {
        return  "Слизерин { " +
                super.toString() +
                ", хитрость " + theTrick +
                ", решительность " + determination +
                ", амбициозность " + ambition +
                ", находчивость " + resourcefulness +
                ", жажда власти " + lustForPower + "}";
    }
    @Override
    void printPerson() {
        System.out.println(this);
    }
    @Override
    int calcScoreInClass() {
        return this.theTrick+this.determination + this.resourcefulness + this.ambition + this.lustForPower;
    }
    @Override
    void printCompareOfStudents(Hogwarts best, Hogwarts worst) {
        System.out.println(String.format("%s лучший из Слизерин, чем %s", best.getName(), worst.getName()));
    }
}
