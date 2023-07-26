package Lesson3.task3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Answer {
    public static List<Integer> getList(Integer[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int item : arr) {
            list.add(item);
        }
        return list;
    }

    public static void analyzeNumbers(Integer[] arr) {
        // Введите свое решение ниже
        List<Integer> list = getList(arr);
        int min = Collections.min(list);
        int max = Collections.max(list);
        int count = list.size();
        int sum = 0;

        for (Integer i : list) {
            sum += i;
        }

        int result = sum / count;
        list.sort(null);
        System.out.println(list.toString());
        System.out.println("Minimum is " + min);
        System.out.println("Maximum is " + max);
        System.out.println("Average is = " + result);
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer ans = new Answer();
        ans.analyzeNumbers(arr);
    }
}