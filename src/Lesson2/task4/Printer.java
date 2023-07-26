package Lesson2.task4;

import java.io.*;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

class Calculator {
    private static final String LOG_FILE_PATH = "log.txt";
    private static Logger logger = Logger.getLogger(Calculator.class.getName());

    public int calculate(char op, int a, int b) {
        // Введите свое решение ниже
        int result = 0;
        FileHandler fileHandler = null;

        try {
            fileHandler = new FileHandler(LOG_FILE_PATH);
            logger.addHandler(fileHandler);

            System.setProperty("java.util.logging.SimpleFormatter.format", "%1$tY-%1$tm-%1$td %1$tH:%1$tM %5$s%6$s%n");
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            logger.setLevel(Level.FINEST);

            switch (op) {
                case '-' :
                    result = a - b;
                    break;
                case '+' :
                    result = a + b;
                    break;
                case '/' :
                    if (b != 0) result = a / b;
                    break;
                case '*' :
                    result = a * b;
                    break;
                default:
                    throw new IllegalArgumentException("Некорректный оператор: " + op);
            }

            logger.log(Level.FINE,"User entered the first operand = " + a);
            logger.log(Level.FINE,"User entered the operation = " + op);
            logger.log(Level.FINE,"User entered the second operand = " + b);
            logger.log(Level.FINE,"Result is " + result);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {

    private static final String LOG_FILE_PATH = "log.txt";

    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        clearLogFile();
        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);

        try (BufferedReader br = new BufferedReader(new FileReader(LOG_FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void clearLogFile() {
        File logFile = new File(LOG_FILE_PATH);
        if (logFile.exists()) {
            try {
                FileWriter fileWriter = new FileWriter(logFile, false);
                fileWriter.write("");
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}