package Lesson6;

import Lesson6.notebook.NoteBook;
import Lesson6.notebook.criteria.Criteria;
import Lesson6.notebook.filter.Filter;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<NoteBook> noteBooks = new HashSet();

        addNoteBooks(noteBooks);

        Map<String, ArrayList<String>> criteria = Criteria.addCriteria();

        if (criteria.size() == 0) {
            for (NoteBook noteBook : noteBooks) {
                System.out.println(noteBook.toString());
            }
        } else {
            Set<NoteBook> filteredNoteBook = Filter.getNoteBooksByCriteria(criteria, noteBooks);
            if (filteredNoteBook.size() == 0) {
                System.out.println("Нет ноутбуков, удовлетворяющих критерию фильтрации");
            } else {
                for (NoteBook noteBook : filteredNoteBook) {
                    System.out.println(noteBook.toString());
                }
            }
        }
    }

    static void addNoteBooks(Set<NoteBook> notebook){
        notebook.add(new NoteBook(
                "ASUS",
                "Intel i5",
                16,
                512,
                "RTX 3050",
                null,
                15,
                "black",
                70490.00));
        notebook.add(new NoteBook(
                "HUAWEI",
                "Intel i7",
                16,
                256,
                "Intel",
                "Windows 10",
                14,
                "blue",
                74999.00));
        notebook.add(new NoteBook(
                "MSI Bravo 15",
                "AMD Ryzen 5",
                16,
                512,
                "RTX 4060",
                "Linux",
                15,
                "red",
                95999.00));
        notebook.add(new NoteBook(
                "Maibenben",
                "AMD Ryzen 7",
                16,
                512,
                "RTX 3060",
                "Linux",
                15,
                "white",
                94999.00));
        notebook.add(new NoteBook(
                "Colorful",
                "Intel i5",
                32,
                1024,
                "RTX 3060",
                "Windows 11",
                15,
                "red",
                96999.00));
        notebook.add(new NoteBook(
                "Apple MacBook",
                "Apple M1",
                8,
                512,
                "Apple M1 8-core",
                "macOS",
                13,
                "silver",
                107599.00));
    }
}