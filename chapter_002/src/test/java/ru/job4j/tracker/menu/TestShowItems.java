package ru.job4j.tracker.menu;

import org.junit.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.StartUI;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.input.StubInput;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertTrue;

public class TestShowItems {
    Tracker tracker = new Tracker();
    static String sep = System.lineSeparator();
    static final String MENU = "1) Add new Item." + sep + "2) Show all items" + sep + "3) Edit item" + sep + "4) Delete item" + sep + "5) Find item by Id" + sep + "6) Find items by name" + sep + "7) Exit Program" + sep;

    @Test
    public void whenShowItems() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Item item = tracker.add(new Item("kiti", "girl"));
        Input input = new StubInput(new String[]{"2", "y"});
        new StartUI(input, tracker).init();
        String sItem = item.getName() + " Description:" + " " + item.getDesc() + " id: " + item.getId();
        String result = out.toString();
        String expected = MENU + "------------ Show all items --------------" + sep + sItem + sep + "------------ The end. --------------" + sep;
        assertTrue(result.equals(expected));
    }

}
