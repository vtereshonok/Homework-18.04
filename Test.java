import java.util.Scanner;

/* 1 Вывести числа от одного до десяти при помощи каждого цикла. Объяснить в чем удобство каждого цикла */

public class CheckCycle {
    public static void main(String[] args) {

        // for - будет выполнчять действие конкретное количество раз
        for (int i = 1; i <= 10; i++) {
            System.out.println (i);
        }

        // while - выполняет одно и то же действие столько раз, пока работает условие
        int j = 1;
        while (j <= 10) {
            System.out.println (j);
            j++;
        }

        // do-while - даже если ни одно условие не работает, все равно один раз должен выполнить условие
        int k = 1;
        do {
            System.out.println (k);
            k++;
        } while (k <= 10);
    }
}


/* 3) Сделать процедуру для чтения с консоли значения в глобальную переменную */

      // Выводим на консоль
    public static void main (String[]  args) {
        ConsoleGlobal.readFromConsole();
        System.out.println (ConsoleGlobal.input);
    }
}

 /* 4.Сделать класс Cat с полями: age, weigth и name. Добавить конструктор для инициализации полей,
 сделать методы акссессоры(геттеры и сеттеры) и метод out для вывода на консоль всех значений объекта.
  */

 public class Test {
    public class Cat {
        private int age;
        private double weight;
        private String name;

        public Cat(int age, double weight, String name) {
            this.age = age;
            this.weight = weight;
            this.name = name;
        }

    }

        /* 5) Создать объект класса Cat и показать работу всех его методов. */

        public static void main(String[] args) {
            Cat cat = new Cat(33, 61, "Vika");
            cat.out();
            cat.setAge();
            cat.out();
        }

