package ru.job4j.tracker.menu;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.input.Input;

public class FindItemsByName extends BaseAction {
    public FindItemsByName() {
        super(6, "Find items by name");
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Find items by name --------------");
        String name = input.ask("Please, provide item name:");
        for (Item el : tracker.findByName(name)) {
            el.showItem();
        }
        System.out.println("------------ The end. --------------");
    }
}
