public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private  int loyalty;
    private int honesty;

    public Hufflepuff(String name, String surName, int power, int transgress, int industriousness, int loyalty, int honesty) {
        super(name,surName,power,transgress);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }
    public int getLoyalty() {
        return loyalty;
    }
    public int getHonesty() {
        return honesty;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }
    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }
    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
