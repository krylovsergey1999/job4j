package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;

public class PhoneDictionary {
    private List<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public List<Person> find(String key) {
        List<Person> result = new ArrayList<Person>();
        for (Person el : persons) {
            boolean one = el.getAddress().contains(key);
            boolean two = el.getName().contains(key);
            boolean three = el.getPhone().contains(key);
            boolean four = el.getSurname().contains(key);
            if (one || two || three || four) {
                result.add(el);
            }
        }
        return result;
    }
}
