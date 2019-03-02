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
    static final String MENU = "1) Add new Item.\r\n2) Show all items\r\n3) Edit item\r\n4) Delete item\r\n5) Find item by Id\r\n6) Find items by name\r\n7) Exit Program\r\n";


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
        String expected = MENU + "Please enter validate data again.\r\n";
        assertTrue(expected.equals(result));
    }
}
