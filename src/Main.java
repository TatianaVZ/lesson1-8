import java.time.LocalDate;

public class Main {
    { System.out.println("Задание 1-8 ");}


    private static int nowYear = LocalDate.now().getYear();
    private static int currentYear = LocalDate.now().getYear();

    public static void main(String[] args) {
        isYear(2001);
        isYear(nowYear);
        isClientOs(1);
        isClientOs(currentYear);
        isDistance(95);
    }


    public static void isYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является высокосным ");
            return;
        } else {
            System.out.println(year + " не является высокосным ");
        }


    }

    public static int isClientOs(int client) {
        if (client == 0 && client < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            return client;
        } else if (client == 1 && client < 2015) {
            System.out.println("Установите облегченную версию приложения для  Android по ссылке");
            return client;
        } else if (client == 0 && client >= 2015) {
            System.out.println("Установите приложение для iOS по ссылке");
            return client;
        } else if (client == 1 && client >= 2015) {
            System.out.println("Установите приложение для Android по ссылке");
        }
        return client;
    }


    public static int isDistance(int distance) {
        if (distance <= 20) {
            System.out.println("Потребуется 1 день доставки ");
            if (distance > 20 && distance <= 60) {
                System.out.println("Потребуется 2 дня доставки ");
            }
        } else {
            System.out.println("Потребуется 3 дня доставки ");

            return distance;
        }
        return distance;
    }
}






