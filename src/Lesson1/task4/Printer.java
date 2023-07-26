package Lesson1.task4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class Equation {
    public static String getSolution(String str) {
        // Введите свое решение ниже
        try {
            Path path = Paths.get(str);
            String content = Files.readString(path);
            System.out.println("Given the equation: " + content);
            String[] parts = content.split("=");
            String left = parts[0];
            String right = parts[1];
            String l = "";
            String r = "";
            int i = 0;
            Boolean found = false;

            while (i < 10 && !found) {
                int j = 0;
                while (j < 10 && !found) {
                    l = left.replaceAll("\\?", String.valueOf(i));
                    r = right.replaceAll("\\?", String.valueOf(j));

                    int q = Integer.parseInt(l.substring(0, l.indexOf("+")).replaceAll(" ", ""));
                    int w = Integer.parseInt(l.substring(l.indexOf("+") + 1).replaceAll(" ", ""));
                    int e = Integer.parseInt(r.replaceAll(" ", ""));

                    if (q + w == e) found = true;
                    j += 1;
                }
                i += 1;
            }
            if (found) {
                return "Result: " + l + "=" + r;
            } else {
                return "No solution";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;

    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        String file = "";

        if (args.length == 0) {
            file = "input.txt";
        }
        else{
            file = args[0];
        }

        Equation eq = new Equation();
        String result = eq.getSolution(file);
        System.out.println(result);
    }
}