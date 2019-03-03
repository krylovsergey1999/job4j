package ru.job4j.tracker.menu;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.input.Input;

public class FindItemById extends BaseAction {
    public FindItemById() {
        super(5, "Find item by Id");
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
}
