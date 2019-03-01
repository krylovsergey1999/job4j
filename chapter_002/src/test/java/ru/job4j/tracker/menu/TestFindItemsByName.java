package ru.job4j.tracker.menu;

import org.junit.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.StartUI;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.input.StubInput;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertTrue;

import org.junit.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.StartUI;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.input.StubInput;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

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

public class TestFindItemsByName {
    Tracker tracker = new Tracker();
    static final String s = "1) Add new Item.\r\n2) Show all items\r\n3) Edit item\r\n4) Delete item\r\n5) Find item by Id\r\n6) Find items by name\r\n7) Exit Program\r\n";

    @Test
    public void whenFindItemsByName() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Item item = new Item("kiti", "girl");
        tracker.add(item);
        Input input = new StubInput(new String[]{"6", item.getName(), "y"});
        new StartUI(input, tracker).init();
        String result = out.toString();
        String sItem = item.getName() + " Description:" + " " + item.getDesc() + " id: " + item.getId();
        String expected = s + "------------ Find items by name --------------\r\n" + sItem + "\r\n------------ The end. --------------\r\n";
        assertTrue(result.equals(expected));
    }
}