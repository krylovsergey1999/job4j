package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.SQLOutput;

import static junit.framework.TestCase.assertTrue;

public class OutputTest {
    Tracker tracker = new Tracker();

    @Test
    public void whenOutputItem() {
        ByteArrayOutputStream out = new ByteArrayOutputStream(); // буфер для результата
        System.setOut(new PrintStream(out));
        Input input = new StubInput(new String[]{"1", "6"});
        new StartUI(input, this.tracker).init();
        assertTrue(out.toString().contains("Показаны все имеющиеся заявки!"));
    }

    @Test
    public void whenOutputFindAllItemsByName() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream(); // буфер для результата
        System.setOut(new PrintStream(out));
        Input input = new StubInput(new String[]{"0","123","qwerty","5","123","6"});
        new StartUI(input, this.tracker).init();
        System.setOut(stdout);
        //System.out.println(out);
        assertTrue(out.toString().contains("123 qwerty"));
    }
}
