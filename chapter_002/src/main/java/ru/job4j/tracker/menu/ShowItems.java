package ru.job4j.tracker.menu;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.input.Input;

public class ShowItems implements UserAction {
    @Override
    public int key() {
        return 2;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Show all items --------------");
        for (Item el : tracker.findAll()) {
            el.showItem();
        }
        System.out.println("------------ The end. --------------");
    }

    @Override
    public String info() {
        return "Show all items";
    }
}
