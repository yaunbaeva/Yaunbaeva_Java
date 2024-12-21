import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("a>b");
        }

        if ( a< b) {
            System.out.println("a<b");
        }

        if (a == b){
            System.out.println("a=b");
        }

        int summa = a + b;
        int minus = a - b;
        int umnoj = a * b;

        System.out.println("сумма= " + summa);
        System.out.println("вычитание= " + minus);
        System.out.println("умножение= " + umnoj);

        if (b != 0){
            float del =(float) a / b;

            System.out.println("деление = " + del);
        }
        else {
            System.out.println("Деление на ноль невозможно");

        }

    }
}

