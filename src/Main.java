import java.time.LocalDate;

public class Main {
    public static char main(String[] args) {

        System.out.println(" Урок 1.8.");
        System.out.println(" Задача 1.");

        int year = LocalDate.now().getYear();
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ;
            {
                System.out.println(year + " является высокосным ");
            } else
            {
                System.out.println(year + " не является высокосным ");
            }

            //       String osName = “iOS”;
            //       int clientOS = getClientOS(osName);


            //      public static int getClientOS(String name) {
            //          if (name.equals(“iOS”)) {
            //             return 0;
            //          } else {
            //              return 1;
        }
    }

