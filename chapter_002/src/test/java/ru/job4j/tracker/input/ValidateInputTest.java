package ru.job4j.tracker.input;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.job4j.tracker.StartUI;
import ru.job4j.tracker.Tracker;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ValidateInputTest {
    private final ByteArrayOutputStream mem = new ByteArrayOutputStream();
    private final PrintStream out = System.out;
    Tracker tracker = new Tracker();
    static String sep = System.lineSeparator();
    static final String MENU = "1) Add new Item." + sep + "2) Show all items" + sep + "3) Edit item" + sep + "4) Delete item" + sep + "5) Find item by Id" + sep + "6) Find items by name" + sep + "7) Exit Program" + sep;

    @Before
    public void loadMem() {
        System.setOut(new PrintStream(this.mem));
    }

    @After
    public void loadSys() {
        System.setOut(this.out);
    }

    @Test
    public void whenInvalidInput() {
        ValidateInput input = new ValidateInput(
                new StubInput(new String[]{"invalid", "7", "y"})
        );
        new StartUI(input, tracker).init();
        System.setOut(this.out);
        String result = mem.toString();
        String expected = MENU + "Please enter validate data again." + sep;
        assertTrue(expected.equals(result));
    }

    @Test
    public void whenIncorrectInput() {
        ValidateInput input = new ValidateInput(
                new StubInput(new String[]{"10", "7", "y"})
        );
        new StartUI(input, tracker).init();
        System.setOut(this.out);
        String result = mem.toString();
        String expected = MENU + "Please select key from menu." + sep;
        assertTrue(expected.equals(result));
    }
}
