

/* 4.Сделать класс Cat с полями: age, weigth и name. Добавить конструктор для инициализации полей,
сделать методы акссессоры(геттеры и сеттеры) и метод out для вывода на консоль всех значений объекта.
 */

public class Cat {

    // Сделать класс Cat с полями: age, weigth и name
    private int age;
    private double weight;
    private String name;


    // Добавить конструктор для инициализации полей,
    public Cat(int age, double weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    // сделать методы акссессоры(геттеры и сеттеры)

    public int getAge() {
        return  age;
    }

    public void setAge(int  age) {
        this.age =  age;
    }

    public double  getWeight() {
        return weight;
    }

    public void setWeight(double  weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    // метод out для вывода на консоль всех значений объекта

    public void out() {
        System.out.println("Cat name: " +name);
        System.out.println("Cat age: " + age);
        System.out.println("Cat weight: " + weight);
    }
}
