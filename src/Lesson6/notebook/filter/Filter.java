package Lesson6.notebook.filter;

import Lesson6.notebook.NoteBook;

import java.util.*;

public class Filter {
    public static Set<NoteBook> getNoteBooksByCriteria(Map<String, ArrayList<String>> params, Set<NoteBook> noteBooks) {
        List<NoteBook> sortedNoteBooks = new ArrayList<>();
        Set<NoteBook> filteredNoteBooks = new HashSet<>();
        Set<String> keys = params.keySet();
        for (NoteBook noteBook : noteBooks) {
            for (String key : keys) {
                if (noteBook.toString().contains(key)) {
                    for (String value : params.get(key)) {
                        if (noteBook.toString().contains(value) &&
                                !sortedNoteBooks.toString().contains(noteBook.toString())) {
                            sortedNoteBooks.add(noteBook.getNoteBook());
                        }
                    }
                }
            }
        }
        for (NoteBook noteBook : sortedNoteBooks) filteredNoteBooks.add(noteBook.getNoteBook());
        return filteredNoteBooks;
    }
}
