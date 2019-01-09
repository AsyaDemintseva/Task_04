import java.util.Scanner;

public class Task_04 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите X: ");
        float X = in.nextInt();
        System.out.print("Введите Y: ");
        float Y = in.nextInt();
        System.out.print("Введите Z: ");
        float Z = in.nextInt();

        float A = (X + Y + Z) / 3;
        System.out.printf("Среднее арифметическое: " + A + "\n");

        A = A / 2;
        if (A > 3) {
            System.out.printf("Программа выполнена корректно");
        }
    }
}
