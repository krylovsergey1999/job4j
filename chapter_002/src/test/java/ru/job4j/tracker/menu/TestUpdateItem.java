package ru.job4j.tracker.menu;

import org.junit.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.StartUI;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.input.StubInput;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestUpdateItem {
    Tracker tracker = new Tracker();

    @Test
    public void whenUpdateItem() {
        Item item = tracker.add(new Item("kiti", "girl"));
        Input input = new StubInput(new String[]{"3", item.getId(), "test", "replace", "y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("test"));
    }
}
