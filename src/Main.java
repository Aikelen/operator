public class Main {
    public static void main(String[] args) {
        int age = 21;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }


        int weather = 6;
        if (weather > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("Сегодня холодно, нужно надеть шапку");
        }


        int currentSpeed = 55;
        if (currentSpeed < 60) {
            System.out.println("можно ездить спокойно");
        } else {
            System.out.println("заплатить штраф");

        }


        int manAge = 22;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то возраст не соответствует ни одному из известных диапазонов.");
        }

        int ageChild = 7;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе.");
        } else if (ageChild >= 5 && ageChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        int all_place = 102;
        int seat_place = 60;
        int stand_place = all_place - seat_place;
        int occupied = 55;
        if (occupied < seat_place) {
            System.out.println("Есть свободные сидячие места");
        } else if (occupied < all_place) {
            System.out.println("Нет сидячих мест, но остались только стоячие");
        } else {
            System.out.println("нет мест");
        }

        int one = 1;
        int two = 2;
        int three = 3;

        if (one >= two && one >= three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }


    }
}