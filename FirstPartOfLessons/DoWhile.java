package FirstPartOfLessons;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do { // цикл ду вайл сначала выполняет интрукции,а потом условия()
            System.out.println("Введи 5");
            value = scanner.nextInt();
        } while (value != 5);
        System.out.println("Вы ввели 5");
    }
}
