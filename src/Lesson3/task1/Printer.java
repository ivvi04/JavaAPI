package Lesson3.task1;

import java.util.Arrays;

class MergeSort {
    public static int[] mergeSort(int[] a) {
        // Напишите свое решение ниже
        int n = a.length;
        if (n <= 1) return a;

        int[] left = mergeSort(Arrays.copyOfRange(a, 0, n / 2));
        int[] right = mergeSort(Arrays.copyOfRange(a, n / 2, n));

        return mergeSort2(left, right);
    }

    private static int[] mergeSort2(int[] a1, int[] a2) {
        int n1 = a1.length, n2 = a2.length;
        int n = n1 + n2, i1 = 0, i2 = 0;
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            if (i1 == n1) {
                a[i] = a2[i2++];
            } else if (i2 == n2) {
                a[i] = a1[i1++];
            } else {
                if (a1[i1] < a2[i2]) {
                    a[i] = a1[i1++];
                } else {
                    a[i] = a2[i2++];
                }
            }
        }
        return a;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        int[] a;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}
