import java.util.Arrays;
import java.util.Scanner;

import java.util.Scanner;
public class Main {
    public class Zadanie_3 import {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        boolean exit = false;
        System.out.println("Укажите размер массива: ");
        while (!exit && scanner.hasNext()) {
            size = scanner.nextInt();
            if (size <= 5 || size > 10) {
                System.out.println("Неверный ввод. Повторите ввод ");
            } else {
                exit = true;

            }
        }
        int [] arrayOne = new int[size];
        int sizeNewArray = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = (int) (Math.random() *100);
            if (arrayOne[i] %2 == 0) {
                sizeNewArray++;
                System.out.println(Arrays.toString(arrayOne));
            }
        }
    }
}{
}
