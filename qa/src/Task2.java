// если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        System.out.print("Please, enter a name ");

        Scanner terminalInput = new Scanner(System.in);
        String input = terminalInput.nextLine();

        if (input.equals("Вячеслав")) {
            System.out.print("Привет, Вячеслав");
        } else {
            System.out.print("Нет такого имени");
        }


    }

}
