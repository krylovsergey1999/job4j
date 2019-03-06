package ru.job4j.sortuser;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LengthComparatorTest {
    @Test
    public void whenCompLength() {
        List<User> list = new ArrayList<>();
        list.add(new User(10, "abcd"));
        list.add(new User(20, "abc"));
        list.add(new User(19, "abcdefg"));
        list.add(new User(12, "ab"));
        SortUser.sortNameLength(list);
        assertTrue(list.get(0).getName().equals("ab"));
    }
}
