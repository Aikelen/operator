public class Main {
    public static void main(String[] args) {
        int age = 21;
        if (age >= 18) {
            System.out.println("он совершеннолетний");
        }
        else {
            System.out.println("он не достиг совершеннолетия нужно немного подождать");
        }



        int weather = 6;
        if (weather > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        else {
            System.out.println("Сегодня холодно, нужно надеть шапку");
        }



        int speed = 55;
        if (speed < 60) {
            System.out.println("можно ездить спокойно");
        }
        else {
            System.out.println("заплатить штраф");

        }


        int manAge = 22;
        if (2 < manAge && manAge < 6) {
            System.out.println("пойти в детский сад");
        }
        if (7 < manAge && manAge < 17) {
            System.out.println("Пойти в школу");
        }
        if (18 <= manAge && manAge < 24) {
            System.out.println("идти в универ");
        }
        if (24 < manAge) {
            System.out.println("пойти на работу");
        }

        int ageChild = 7;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе.");
        } else if (ageChild >= 5 && ageChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        int place = 55;
        if (place < 60) {
            System.out.println("есть сидячие места");
        }
        else {
            System.out.println("К сожалению, сидячих мест нет");
        }

        int one = 1;
        int two = 2;
        int three = 3;
        if (two < one && three < one) {
            System.out.println(one);
        }
        if (one < two && three < two){
            System.out.println(two);
        }
        if (one < three && two < three) {
            System.out.println(three);
        }


    }
}