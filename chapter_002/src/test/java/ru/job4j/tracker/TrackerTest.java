package ru.job4j.tracker;

import org.junit.Test;

import java.io.*;
import java.util.Scanner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TrackerTest {
    @Test
    public void whenAdd() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        tracker.add(previous);
        Item next = new Item("test2", "testDescription2", 1234L);
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    public void whenDeleteYes() {
        Tracker tracker = new Tracker();
        Item item = new Item("one", "parampam", 10);
        tracker.add(item);
        boolean res = tracker.delete(item.getId());
        assertThat(res, is(true));
    }

    @Test
    public void whenDeleteNo() {
        Tracker tracker = new Tracker();
        Item item = new Item("one", "parampam", 10);
        tracker.add(item);
        boolean res = tracker.delete(item.getId());
        res = tracker.delete(item.getId());
        assertThat(res, is(false));
    }

    @Test
    public void whenFindAll() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("one", "parampam", 1);
        Item item2 = new Item("two", "parampam", 2);
        Item item3 = new Item("three", "parampam", 3);
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        Item[] expected = {item1, item2, item3};
        assertThat(tracker.findAll(), is(expected));
    }

    @Test
    public void whenFindById() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("one", "parampam", 1);
        Item item2 = new Item("two", "parampam", 2);
        Item item3 = new Item("three", "parampam", 3);
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        assertThat(tracker.findById(item3.getId()), is(item3));
    }

    @Test
    public void whenFindByName() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("one", "parampam", 1);
        Item item2 = new Item("two", "parampam", 2);
        Item item3 = new Item("three", "parampam", 3);
        Item item4 = new Item("three", "tr tr mity", 10);
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        Item[] expected = {item3, item4};
        assertThat(tracker.findByName("three"), is(expected));
    }
}
