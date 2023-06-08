public class Main {
    public static void main(String[] args) {
        System.out.println("2.2 ООП часть 1. Инкапсуляция и наследование");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        Hogwarts[] students = {
                new Hogwarts("Harry", "Potter", 15, 14),
                new Hogwarts("Hermione", "Granger", 10, 9),
                new Hogwarts("Ron", "Weasley", 5, 4),
                new Hogwarts("Draco", "Malfoy", 3, 4),
                new Hogwarts("Graham", "Montague", 2, 1),
                new Hogwarts("Gregory", "Goyle", 1, 2),
                new Hogwarts("Zachariah", "Smith", 15, 14),
                new Hogwarts("Cedric", "Diggory", 10, 9),
                new Hogwarts("Justin", "Finch-Fletchley", 5, 4),
                new Hogwarts("Zhou", "Chang", 18, 17),
                new Hogwarts("Padma", "Patil", 12, 11),
                new Hogwarts("Marcus", "Belby", 6, 5),
        };
        Gryffindor[] gryffindors = {
                new Gryffindor("Harry", "Potter", 15, 14, 13,12,11),
                new Gryffindor("Hermione", "Granger", 10, 9,8,7,6),
                new Gryffindor("Ron", "Weasley", 5, 4,3,2,1),
        };
        Slytherin[] slytherins = {
                new Slytherin("Draco", "Malfoy", 3, 4,3,3,3,4,3),
                new Slytherin("Graham", "Montague", 2, 1, 2,3,2,3,2),
                new Slytherin("Gregory", "Goyle", 1, 2,1,2,1,2,1),
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Zachariah", "Smith", 15, 14,13,12,11),
                new Hufflepuff("Cedric", "Diggory", 10, 9,8,7,6),
                new Hufflepuff("Justin", "Finch-Fletchley", 5, 4,3,2,1),
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Zhou", "Chang", 18, 17, 16, 15, 14, 13),
                new Ravenclaw("Padma", "Patil", 12, 11, 10, 9, 8, 7),
                new Ravenclaw("Marcus", "Belby", 6, 5, 4, 3, 2, 1),
        };

        PrintPerson printPerson = new PrintPerson();
        printPerson.print();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        printPerson.print(gryffindors);
        printPerson.print(slytherins);
        printPerson.print(hufflepuffs);
        printPerson.print(ravenclaws);
        System.out.println("+++++++++++++++++++++++++++");
        printPerson.print(0, 1, gryffindors);// сравнение Гриффиндор
        System.out.println("+++++++++++++++++++++++++++");
        printPerson.print(0, 1, slytherins);// сравнение  Слизерин
        System.out.println("+++++++++++++++++++++++++++");
        printPerson.print(2, 0, hufflepuffs);// сравнение Пуффендуй
        System.out.println("+++++++++++++++++++++++++++");
        printPerson.print(2, 0, ravenclaws);// сравнение Пуффендуй
        System.out.println("+++++++++++++++++++++++++++");
        printPerson.print(4, 5, students);// сравнение учеников Хогвартса по силе магии и расстоянию трансгрессии
    }
}