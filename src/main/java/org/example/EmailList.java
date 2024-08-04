package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class EmailList {
    private final TreeSet<String> emails = new TreeSet<>();

    public void add(String email) {
        // TODO: валидный формат email добавляется, email это строка, она быть может любой
        // принять решение добавлять аргумент email или нет должен этот метод
        if (email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            emails.add(email.toLowerCase());
        } else {
            System.out.println(Main.WRONG_EMAIL_ANSWER);
        }
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается сортированный список электронных адресов в алфавитном порядке
        return new ArrayList<>(emails);
    }
}
