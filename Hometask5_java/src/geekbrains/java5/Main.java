package geekbrains.java5;

import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
            employee[] empArray = new employee[5];
            empArray[0] = new employee("Василий", "Повар", "vaspov@gmail.com","89645502360", 40000, 26);
            empArray[1] = new employee("Никита", "Сантехник", "niksan@mail.ru", "88005553535", 30000, 42);
            empArray[2] = new employee("Екатерина", "Флорист", "katflor@yandex.ru", "89313548090", 35000, 34);
            empArray[3] = new employee("Федор", "Юрист", "fedur@rambler.com", "89701223224", 60000, 44);
            empArray[4] = new employee("Анна", "Художник", "anhud@inbox.com", "89214885675", 50000, 27);
            System.out.println(Arrays.toString(empArray));
        }
    }
