package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    Tracker tracker = new Tracker();

    @Test
    public void whenAdd() {
        Input input = new StubInput(new String[]{"0", "katy", "girl", "6"});
        new StartUI(input, this.tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("katy"));
        assertThat(tracker.findAll()[0].getDesc(), is("girl"));
    }

    @Test
    public void whenEdit() {
        this.whenAdd();
        System.out.println(this.tracker.getItems()[0].getId());
        Input input = new StubInput(new String[]{"2", (this.tracker.getItems()[0].getId()), "petr", "boy", "6"});
        new StartUI(input, this.tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("petr"));
    }

    @Test
    public void whenDelete() {
        Item item = tracker.add(new Item("vika", "girl"));
        Input input = new StubInput(new String[]{"3", item.getId(), "6"});
        new StartUI(input, tracker).init();
        assertNull(tracker.findById(item.getId()));
    }

    @Test
    public void whenIDNotHave() {
        String id = "123";
        Input input = new StubInput(new String[]{"4", id, "6"});
        StartUI el = new StartUI(input, tracker);
        el.init();
        assertFalse(el.getSuccess());
    }

    @Test
    public void whenIDHave() {
        Item item = tracker.add(new Item("tany", "girl"));
        String id = item.getId();
        Input input = new StubInput(new String[]{"4", id, "6"});
        StartUI el = new StartUI(input, tracker);
        el.init();
        assertTrue(el.getSuccess());
    }

    @Test
    public void whenNameHave() {
        Item item = tracker.add(new Item("kolobok", "bread"));
        Input input = new StubInput(new String[]{"5", item.getName(), "6"});
        StartUI el = new StartUI(input, tracker);
        el.init();
        assertTrue(el.getSuccess());
    }

    @Test
    public void whenNameNotHave() {
        Item item = tracker.add(new Item("kolobok", "bread"));
        Input input = new StubInput(new String[]{"5", "cat", "6"});
        StartUI el = new StartUI(input, tracker);
        el.init();
        assertFalse(el.getSuccess());
    }
}
