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

    public void whenDelete() {
        this.whenAdd();
    }
}
