public class Main {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 5};
        boolean result = false;
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        for (int temp : array) {
            if (temp == number) {
                result = true;
                break;
            }
        }
        if (result) {
            System.out.print("Число A входит в массив", number);
    } else {
        System.out.print("Число A не входит в массив", number);
    }
    }
}