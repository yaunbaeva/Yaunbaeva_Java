import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String a = str.nextLine();
        System.out.print("Введите вторую строку: ");
        String b = str.nextLine();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        }
        else {
            System.out.println("Строки неидентичны");
        }
    }
}