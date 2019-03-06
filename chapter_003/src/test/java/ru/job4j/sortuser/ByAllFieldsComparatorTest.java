package ru.job4j.sortuser;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ByAllFieldsComparatorTest {
    @Test
    public void whenComp() {
        List<User> list = new ArrayList<>();
        list.add(new User(25, "Сергей"));
        list.add(new User(30, "Иван"));
        list.add(new User(20, "Сергей"));
        list.add(new User(25, "Иван"));
        SortUser.sortByAllFields(list);
        List<User> res = new ArrayList<>();
        res.add(new User(25, "Иван"));
        res.add(new User(30, "Иван"));
        res.add(new User(20, "Сергей"));
        res.add(new User(25, "Сергей"));
        assertTrue(list.get(0).getAge() == res.get(0).getAge());
    }
}
