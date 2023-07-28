package Lesson6.notebook.criteria;

import java.util.*;

public class Criteria {
    public static Map<String, ArrayList<String>> addCriteria() {
        Map<String, ArrayList<String>> criteria = new HashMap();

        System.out.println("Критерии фильтрации:");
        System.out.println("1 - Модель");
        System.out.println("2 - Процессор");
        System.out.println("3 - Объем оперативной памяти");
        System.out.println("4 - Объем жесткого диска");
        System.out.println("5 - Объем видеопамяти");
        System.out.println("6 - Размер дисплея");
        System.out.println("7 - Операционная система");
        System.out.println("8 - Цвет");
        System.out.println("9 - Цена");
        System.out.println();

        Boolean endOfEntryCriteria = false;
        Scanner scanner = new Scanner(System.in);

        while (!endOfEntryCriteria) {
            System.out.print("Выберите критерий от 1 до 9 или 0 для выхода: ");
            try {
                int filterNumber = scanner.nextInt();
                scanner.nextLine();

                if (filterNumber != 0) {
                    String typeCriteria = getTypeCriteria(filterNumber);

                    if (typeCriteria != "") {
                        if (!criteria.containsKey(typeCriteria)) {
                            criteria.put(typeCriteria, new ArrayList<>());
                        }
                        criteria.get(typeCriteria).add(scanner.nextLine());
                    }
                } else endOfEntryCriteria = true;
            } catch (InputMismatchException e) {
                System.out.println("Необходимо ввести цифру!");
                scanner.nextLine();
            }
        }
        return criteria;
    }

    public static String getTypeCriteria (Integer numberCriteria) {
        switch (numberCriteria) {
            case 1:
                System.out.print("Модель: ");
                return "model";
            case 2:
                System.out.print("Процессор: ");
                return "cpu";
            case 3:
                System.out.print("Объем оперативной памяти: ");
                return "ram";
            case 4:
                System.out.print("Объем жесткого диска: ");
                return "hdd";
            case 5:
                System.out.print("Объем видеопамяти: ");
                return "gpu";
            case 6:
                System.out.print("Размер дисплея: ");
                return "display";
            case 7:
                System.out.print("Операционная система: ");
                return "os";
            case 8:
                System.out.print("Цвет: ");
                return "color";
            case 9:
                System.out.print("Цена: ");
                return "price";
            default:
                System.out.println("Выбран неизвестный критерий!");
                return "";
        }
    }
}
