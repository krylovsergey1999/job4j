package ru.job4j.sortuser;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortUserTest {
    @Test
    public void when7ElementsThen9() {
        List<User> list = new ArrayList<>();
        list.add(new User(10, "koli1"));
        list.add(new User(11, "koli2"));
        list.add(new User(9, "koli3"));
        list.add(new User(5, "koli4"));
        list.add(new User(7, "koli5"));
        Set<User> set = SortUser.sort(list);
        for (User el : set) {
            assertThat(el.getAge(), is(5));
            break;
        }
    }
}
