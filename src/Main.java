import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        checkLeapYear(2024);
        System.out.println("Задача 2");

        recommendAppVersion(0, 2014);
        recommendAppVersion(1, 2020);
        System.out.println("Задача 3");

        int distance = 95;
        int deliveryDays = calculateDeliveryDays(distance);
        if (deliveryDays == -1) {
            System.out.println("Доставка недоступна");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }

    public static void checkLeapYear(int year) {
        if (year <= 1584) {
            System.out.println("Год должен быть больше 1584");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void recommendAppVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        switch (clientOS) {
            case 0:
                if (clientDeviceYear < currentYear) {
                    System.out.println("Установите облегченную версию приложения для IOS по ссылке.");
                } else {
                    System.out.println("Установите  версию приложения для IOS по ссылке.");
                }
                break;
            case 1:
                if (clientDeviceYear < currentYear) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке.");
                } else {
                    System.out.println("Установите  версию приложения для Android по ссылке.");
                }
                break;
            default:
                System.out.println("Неизвестная операционная система");
                break;
        }
    }

    public static int calculateDeliveryDays(int distance) {

        if (distance > 100) {
            return -1;

        } else if (distance > 60) {
            return 3;

        } else if (distance > 20){
            return 2;
    } else{

        return 1;
    }
}

}



