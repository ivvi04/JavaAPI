package Lesson5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap <String, ArrayList<Integer>> phoneBook = new HashMap<>();
//        phoneBook = fillPhoneBook();
        Scanner scanner = new Scanner(System.in);
        int choice = 1;
        while (choice != 0){
            System.out.println("�������: 1 - �������� �����, 2 - ������� ��� ������, 0 - ���������");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addContact(phoneBook,scanner);
                    break;
                case 2:
                    printAll(phoneBook);
                    break;
                default:
                    System.out.println("������� ����������� ��������. ��������� ����!");
                    break;
            }
        }
        scanner.close();
    }

    public static void addContact(HashMap <String, ArrayList<Integer>> phoneBook, Scanner scanner){
        System.out.println("������� �������: ");
        String name = scanner.nextLine();
        System.out.println("������� �����: ");
        int phone = scanner.nextInt();
        if(!phoneBook.containsKey(name)){
            phoneBook.put(name, new ArrayList<>());
        }
        phoneBook.get(name).add(phone);
    }
    public static void printAll(HashMap <String, ArrayList<Integer>> phoneBook){
        phoneBook.entrySet()
                .stream()
                .sorted(Comparator.comparing(e -> -e.getValue().size()))
                .forEach(entry -> {
                    System.out.println(
                            entry.getKey() + ": " + entry.getValue()
                                    .toString()
                                    .replaceAll("\\[", "")
                                    .replaceAll("\\]",""));
                });
    }
    public static HashMap <String, ArrayList<Integer>> fillPhoneBook(){
        HashMap <String, ArrayList<Integer>> phoneBook = new HashMap<>() {
            {
                put("������", new ArrayList<Integer>() {
                    {
                        add(67567545);
                    }
                });
                put("�������", new ArrayList<Integer>() {
                    {
                        add(546456);
                        add(2324332);
                        add(123656);
                        add(12343);
                    }
                });
                put("�������", new ArrayList<Integer>() {
                    {
                        add(76544554);
                        add(124257655);

                    }
                });
                put("�������", new ArrayList<Integer>() {
                    {
                        add(14532545);
                        add(3546456);
                        add(2345876);
                    }
                });
            }
        };
        return phoneBook;
    }
}