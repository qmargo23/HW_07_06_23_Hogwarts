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

    public int getTheTrick() {
        return theTrick;
    }
    public int getDetermination() {
        return determination;
    }
    public int getAmbition() {
        return ambition;
    }
    public int getResourcefulness() {
        return resourcefulness;
    }
    public int getLustForPower() {
        return lustForPower;
    }

    public void setTheTrick(int theTrick) {
        this.theTrick = theTrick;
    }
    public void setDetermination(int determination) {
        this.determination = determination;
    }
    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }
    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }
    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
}
