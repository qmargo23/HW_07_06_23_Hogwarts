public class Hogwarts {
    private String name;
    private String surName;
    private  int power;
    private int transgress;

    public Hogwarts(String name, String surName, int power, int transgress) {
        this.name = name;
        this.surName = surName;
        this.power = power;
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }
    public String getSurName() {
        return surName;
    }
    public int getPower() {
        return power;
    }
    public int getTransgress() {
        return transgress;
    }

    public void setPower(int power) {
        this.power = power;
    }
    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }
}
