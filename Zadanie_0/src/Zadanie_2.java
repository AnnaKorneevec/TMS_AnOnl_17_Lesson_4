
import java.util.Arrays;
import java.util.Scanner;

public class Min {
    public class Zadanie_2 {
    }
        Scanner scan = new Scanner(System.in);

        System.out.print("Укажите размер массива");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int sum = 0;
        int maxValue = Integer.Min_Value;
        int minValue = Integer.Max_Value;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            if (array[i] < minValue) {
                minValue = array[i];
            }
            if (array[i] < maxValue) {
                maxValue = array[i];
            }
            sum += array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Минимальное значение в массиве: A \n", minValue);
        System.out.println("Максимальное значение в массиве: A \n", maxValue);
        System.out.println("Среднее значение в массиве: A \n", sum / array.length);
    }
}