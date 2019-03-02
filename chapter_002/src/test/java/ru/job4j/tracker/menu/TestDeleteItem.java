package ru.job4j.tracker.menu;

import org.junit.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.StartUI;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.input.StubInput;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestDeleteItem {
    Tracker tracker = new Tracker();

    @Test
    public void whenDeleteItem() {
        Item item1 = new Item("kiti", "girl");
        tracker.add(item1);
        Input input = new StubInput(new String[]{"4", item1.getId(), "y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll().length, is(0));
    }
}
