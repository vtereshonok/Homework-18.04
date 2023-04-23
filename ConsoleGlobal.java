import java.util.Scanner;

/* 3) Сделать процедуру для чтения с консоли значения в глобальную переменную */
    public class ConsoleGlobal {
    // Создаем глобальную переменную и кладем туда значение из консоли
    private static String input;
    }

// Статический метод
    public static void readFromConsole() {
// берем scanner для чтения из консоли
    Scanner scanner = new Scanner (System.in);
    input = scanner.nextLine ();

}

    public static void main(String[] args) {
        ConsoleGlobal.readFromConsole();
        System.out.println(ConsoleGlobal.input);
    }
}