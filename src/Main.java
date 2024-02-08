import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Привет, я Арнаут Валерий!");

        System.out.println("С помощью массивов");
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }

        for (int i = 0; i < array.length; i++){
            System.out.println("Элемент " + i + ": " + array[i]);
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Сумма всех элементов: " + sum);

        double average = (double) sum / array.length;
        System.out.println("Среднее значение: " + average);

        System.out.println("С помощью list");
        ArrayList<Integer> myList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100);
            myList.add(randomNumber);
        }

        int sumOfElements = 0;
        for (int number : myList) {
            sumOfElements += number;
        }


        double averageValue = (double) sumOfElements / myList.size();


        System.out.println("Список элементов: " + myList);
        System.out.println("Сумма элементов: " + sumOfElements);
        System.out.println("Среднее значение: " + averageValue);
        }
    }
