package ru.job4j.tracker;

import org.junit.Test;

import static junit.framework.TestCase.assertNull;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("kiti","girl");
        tracker.add(item);
        assertThat(tracker.findAll()[0],is(item));
    }

    @Test
    public void whenAddItems() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("kiti", "girl");
        Item item2 = new Item("tate", "xz");
        Item item3 = new Item("max", "man");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        Item[] expected = {item1, item2, item3};
        assertThat(tracker.findAll(), is(expected));
    }

    @Test
    public void whenFindByName() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("kiti", "girl");
        Item item2 = new Item("tate", "xz");
        Item item3 = new Item("max", "man");
        Item item4 = new Item("max", "man/girl");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        Item[] expected = {item3, item4};
        assertThat(tracker.findByName("max"), is(expected));
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("kiti", "girl");
        tracker.add(item1);
        Item item2 = new Item("tate", "xz");
        tracker.replace(item1.getId(), item2);
        assertThat(tracker.findById(item1.getId()).getName(),is("tate"));
    }

    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item item = new Item("kiti", "girl");
        tracker.add(item);
        assertThat(tracker.delete(item.getId()), is(true));
    }

    @Test
    public void whenDoesNotDelete() {
        Tracker tracker = new Tracker();
        Item item = new Item("kiti", "girl");
        tracker.add(item);
        assertThat(tracker.delete("123"), is(false));
    }

    @Test
    public void whenFindById() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("kiti", "girl");
        tracker.add(item1);
        assertThat(tracker.findById(item1.getId()), is(item1));
    }

    @Test
    public void whenFindByIdDoesNotFind() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("kiti", "girl");
        tracker.add(item1);
        assertNull(tracker.findById("123"));
    }
}
