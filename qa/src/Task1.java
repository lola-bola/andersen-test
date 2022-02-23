// Составить алгоритм: если введенное число больше 7, то вывести “Привет”

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.print("Please, enter a number ");

        Scanner terminalInput = new Scanner(System.in);
        String input = terminalInput.nextLine();

        int num = Integer.parseInt(input);

        if (num > 7) {
            System.out.print("Привет");
        }
    }
}
