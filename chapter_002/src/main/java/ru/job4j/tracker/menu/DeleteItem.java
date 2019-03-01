package ru.job4j.tracker.menu;

import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.input.Input;

public class DeleteItem implements UserAction {
    @Override
    public int key() {
        return 4;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Delete item --------------");
        String id = input.ask("Please, provide item id:");
        if (tracker.delete(id)) {
            System.out.println("Item delete.");
        } else {
            System.out.println("Item with a given id missing");
        }
        System.out.println("------------ The end. --------------");
    }

    @Override
    public String info() {
        return "Delete item";
    }
}
