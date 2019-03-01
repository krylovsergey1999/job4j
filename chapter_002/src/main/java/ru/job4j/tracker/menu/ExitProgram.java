package ru.job4j.tracker.menu;

import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.input.Input;

public class ExitProgram implements UserAction {
    @Override
    public int key() {
        return 7;
    }

    @Override
    public void execute(Input input, Tracker tracker) {

    }

    @Override
    public String info() {
        return "Exit Program";
    }
}
