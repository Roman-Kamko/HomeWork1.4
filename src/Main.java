public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("Задание 1");
        int age = 32;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетния.");
        }

        // task 2
        System.out.println("Задание 2");
        int temperature = 10;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }

        // task 3
        System.out.println("Задание 3");
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }

        // task 4
        System.out.println("Задание 4");
        int personAge = 11;
        if (personAge >= 2 && personAge <= 6) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в детский сад.");
        } else if (personAge >= 7 && personAge <= 18) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в школу.");
        } else if (personAge > 18 && personAge <= 24) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в университет.");
        } else if (personAge > 24) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить на работу.");
        }

        // task 5
        System.out.println("Задание 5");
        int childAge = 14;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе.");
        } else if (childAge >= 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (childAge >= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься без сопровождения взрослого.");
        }

        // task 6
        System.out.println("Задание 6");
        int totalPassengerCapacity = 102;
        int totalSittingPlace = 60;
        int totalStandingPlace = totalPassengerCapacity - totalSittingPlace; // => 42

        int takenSittingPlace = 60;
        int freeSittingPlace = totalSittingPlace - takenSittingPlace;
        int takenStandingPlace = 41;
        int freeStandingPlace = totalStandingPlace - takenStandingPlace;
        int totalTakenPlace = takenSittingPlace + takenStandingPlace;
        int totalFreePlace = totalPassengerCapacity - totalTakenPlace;

        if (totalTakenPlace == totalPassengerCapacity) {
            System.out.println("В вагоне больше нет мест!");
        } else if (totalTakenPlace > totalPassengerCapacity) {
            System.out.println("Ошибка! Пассажиров в вагоне больше допустимого значения");
        } else if (takenStandingPlace > totalStandingPlace) {                                           // Предупреждает об отсутствие стоячих мест, но выведет имеющиеся свободные сидячие места в случае отсутствия перегруза
            System.out.println("Ошибка! В вагоне больше нет сточих мест!");
        } else if (takenSittingPlace > totalSittingPlace) {                                             // Предупреждает об отсутствие сидячих мест, но выведет имеющиеся свободные стоячие места в случае отсутствия перегруза
            System.out.println("Ошибка! В вагоне больше нет сидячих мест!");
        } else {
            System.out.println("Всего свободных мест в вагоне " + totalFreePlace);
        }

        if (takenSittingPlace < totalSittingPlace && totalTakenPlace < totalPassengerCapacity) {        // Чтобы в консоль не выводилась инфа в случае имеющихся свободных сидячих мест если будет перегруз
            System.out.println("Сидячих мест осталось " + freeSittingPlace);
        } else if (takenSittingPlace == totalSittingPlace) {
            System.out.println("В вагоне больше нет сидячих мест!");
        }

        if (takenStandingPlace < totalStandingPlace && totalTakenPlace < totalPassengerCapacity) {
            System.out.println("Стоячих мест осталось " + freeStandingPlace);
        } else if (takenStandingPlace == totalStandingPlace) {
            System.out.println("В вагоне больше нет стоячих мест!");
        }

        // task 7
        System.out.println("Задание 7");
        int one = 221;
        int two = 22;
        int three = 221;

        if (one > two && one > three) {
            System.out.println("Наибольшее из трех чисел " + one);
        } else if (two > one && two > three) {
            System.out.println("Наибольшее из трех чисел " + two);
        } else if (three > one && three > two) {
            System.out.println("Наибольшее из трех чисел " + three);
        } else if (one == two || one == three) {
            System.out.println("Наибольшее из трех чисел " + one);
        } else if (two == one || two == three) {
            System.out.println("Наибольшее из трех чисел " + two);
        } else if (three == one || three == two) {
            System.out.println("Наибольшее из трех чисел " + three);
        }
    }
}
