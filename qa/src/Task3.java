//на входе есть числовой массив, необходимо вывести элементы массива кратные 3

public class Task3 {

    public static void main(String[] args) {

        int[] numbers = new int[]{25, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x = 0; x < numbers.length; x++) {

            if (numbers[x] % 3 == 0) {
                System.out.println("numbers[" + x + "] = " + numbers[x]);
            }

        }

    }


}
