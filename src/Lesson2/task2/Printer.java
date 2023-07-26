package Lesson2.task2;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

    public static void sort(int[] mas) {
        log = new File("log.txt");
        try {
            fileWriter = new FileWriter(log, false);

            boolean isSorted = false;
            int temp;

            while(!isSorted) {
                isSorted = true;
                for (int i = 0; i < mas.length - 1; i++) {
                    if (mas[i] > mas[i + 1]) {
                        temp = mas[i];
                        mas[i] = mas[i + 1];
                        mas[i + 1] = temp;
                        isSorted = false;
                    }
                }
                fileWriter.write(LocalDate.now().toString() + " "
                        + LocalTime.now().getHour() + ":"
                        + LocalTime.now().getMinute() + " "
                        + Arrays.toString(mas) + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        int[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new int[]{9, 4, 8, 3, 1};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        BubbleSort ans = new BubbleSort();
        ans.sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}