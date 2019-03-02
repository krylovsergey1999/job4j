package ru.job4j.tracker.menu;

import org.junit.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.StartUI;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.input.StubInput;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestAddItem {
    Tracker tracker = new Tracker();

    @Test
    public void whenAddItem() {
        Input input = new StubInput(new String[]{"1", "kiti", "girl", "y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("kiti"));
    }
}
