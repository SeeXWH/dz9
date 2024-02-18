public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println(sum);
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int minn = 100_000_0;
        int maxx = -1;
        for (int element : arr) {
            if (element > maxx) {
                maxx = element;
            }
            if (element < minn) {
                minn = element;
            }
        }
        System.out.print(maxx);
        System.out.println(minn);
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        int sum = 0;
        float sred;
        for (int element : arr) {
            sum += element;
        }
        sred = (float) sum / arr.length;
        System.out.println(sred);
    }

    public static void task4() {
        char [] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        boolean isSpace = false;

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            if (reverseFullName[i] == ' ') {
                isSpace = true;
                continue;
            }

            if (isSpace) {
                System.out.print(" ");
                isSpace = false;
            }
            System.out.print(reverseFullName[i]);
        }

    }
}