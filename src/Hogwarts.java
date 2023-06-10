abstract class  Hogwarts {
    private String name;
    private String surName;
    private int power;
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
    @Override
    public String toString() {
        return "Ученик: " + name + " " + surName
                + " - сила магии " + power
                + ", расстояние трансгрессии " + transgress;
    }
    //абстрактный метод, который выводит на экран описание студента
    abstract void printPerson();
    //абстрактный метод, который считает "внутренние" силы студента по факультету
    abstract int calcScoreInClass();
    //абстарктный метод, который сравнивает студентов
    abstract void printCompareOfStudents(Hogwarts best, Hogwarts worst);
    //"закрытый" метод, который считает основные (общие для всех) "силы" студента
    private int calcScore() {
        return this.power + this.transgress;
    }
    //приватный метод, сравнивает "силы" студентов на факультете
    private void compareFaculty(Hogwarts hogwarts) {
        int thisScore = this.calcScore() + this.calcScoreInClass();
        int otherScore = hogwarts.calcScore() + hogwarts.calcScoreInClass();
        if (thisScore > otherScore) {
             printCompareOfStudents(this, hogwarts);
        } else if (thisScore < otherScore) {
            printCompareOfStudents(hogwarts, this);
        } else {
            System.out.println("Ученики  факультета равны по силе");
        }
    }
    //приватный метод, сравнивает студентов Хогвартс
    private void compareHogwarts(Hogwarts hogwarts) {
        int thisScore = this.calcScore();
        int otherScore = hogwarts.calcScore();
        if (thisScore > otherScore) {
            System.out.println(String.format("Ученик %s сильнее ученика %s", this.name, hogwarts.name));
        } else if (thisScore < otherScore) {
            System.out.println(String.format("Ученик %s сильнее ученика %s", hogwarts.name, this.name));
        } else {
            System.out.println("Ученики равны по силе");
        }
    }
    // "универсальный" метод для сравнения учеников, по выбору (Хогвартс или по Факультету)
    public void compare(Hogwarts hogwarts) {
        if (this.getClass().equals(hogwarts.getClass())) {
            this.compareFaculty(hogwarts);
        } else {
            this.compareHogwarts(hogwarts);
        }
    }
}
