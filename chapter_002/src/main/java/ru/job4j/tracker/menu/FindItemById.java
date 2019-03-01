package ru.job4j.tracker.menu;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.input.Input;

public class FindItemById implements UserAction {
    @Override
    public int key() {
        return 5;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Find item by Id --------------");
        String id = input.ask("Please, provide item id:");
        Item item = tracker.findById(id);
        if (item == null) {
            System.out.println("Item with a given id missing");
        } else {
            item.showItem();
        }
        System.out.println("------------ The end. --------------");
    }

    @Override
    public String info() {
        return "Find item by Id";
    }
}
