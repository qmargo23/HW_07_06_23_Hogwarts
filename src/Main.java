public class Main {
    public static void main(String[] args) {
        System.out.println("2.2 ООП часть 1. Инкапсуляция и наследование");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        Hogwarts[] hogwarts = {
                new Gryffindor("Harry", "Potter", 15, 14, 13, 12, 11),
                new Gryffindor("Hermione", "Granger", 10, 9, 8, 7, 6),
                new Gryffindor("Ron", "Weasley", 5, 4, 3, 2, 1),

                new Slytherin("Draco", "Malfoy", 3, 4, 3, 3, 3, 4, 3),
                new Slytherin("Graham", "Montague", 2, 1, 2, 3, 2, 3, 2),
                new Slytherin("Gregory", "Goyle", 1, 2, 1, 2, 1, 2, 1),

                new Hufflepuff("Zachariah", "Smith", 15, 14, 13, 12, 11),
                new Hufflepuff("Cedric", "Diggory", 10, 9, 8, 7, 6),
                new Hufflepuff("Justin", "Finch-Fletchley", 5, 4, 3, 2, 1),

                new Ravenclaw("Zhou", "Chang", 18, 17, 16, 15, 14, 13),
                new Ravenclaw("Padma", "Patil", 12, 11, 10, 9, 8, 7),
                new Ravenclaw("Marcus", "Belby", 6, 5, 4, 3, 2, 1),
        };

        Hogwarts person1 = hogwarts[0];
        Hogwarts person2 = hogwarts[1];
        Hogwarts person3 = hogwarts[3];

        System.out.println("1       Выводим на экран описание студента: " + person1.getName());
        person1.printPerson();

        System.out.println(String.format("2     Сравниваем между собой %s и %s (учеников одного факультета) по свойствам: ",person1.getName(),person2.getName()));
        person1.compare(person2);

        System.out.println(String.format("3     Сравниваем двух учеников  Хогвартса %s и %s по силе магии и расстоянию трансгрессии ",person1.getName(),person3.getName()));
        person1.compare(person3);
    }
}