import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] expenses = generateRandomArray();
        System.out.println(Arrays.toString(expenses));
        int sum = 0;
        int sum2 = Arrays.stream(expenses).sum();
        for (int expense : expenses) {
            sum += expense;
            System.out.println(" Сумма трат за месяц составила" + sum);
        }


        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int expense : expenses) {
            if (expense > max) {
                max = expense;
            }
            if (expense < min) {
                min = expense;
            }
        }
        System.out.println("Минимальная сумма трат за день составила" + min + "рублей");
        System.out.println("Максимальная сумма трат за день составила" + max + "рублей");
        double averageExpence = (double) sum / expenses.length;
        System.out.println(" Средняя сумма трат за месяц составила" + averageExpence);
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.println(reverseFullName[i]);
        }
    }
        int[] arr = generateRandomArray();
        public static int[] generateRandomArray() {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }
    }






