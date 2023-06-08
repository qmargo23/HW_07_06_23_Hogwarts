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
    public int getNobility() {
        return nobility;
    }
    public int getHonor() {
        return honor;
    }
    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }
    public void setHonor(int honor) {
        this.honor = honor;
    }
    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}
