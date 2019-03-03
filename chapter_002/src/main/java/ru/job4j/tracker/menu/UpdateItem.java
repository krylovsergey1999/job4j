package ru.job4j.tracker.menu;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.input.Input;

public class UpdateItem extends BaseAction {
    public UpdateItem() {
        super(3, "Edit item");
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Edit item --------------");
        String id = input.ask("Enter id item:");
        if (tracker.findById(id) == null) {
            System.out.println("Item with a given id missing");
        } else {
            String name = input.ask("Please, provide NEW item name:");
            String desc = input.ask("Please, provide NEW item description:");
            Item item = new Item(name, desc);
            tracker.replace(id, item);
            System.out.println("Item edit.");
        }
        System.out.println("------------ The end. --------------");
    }
}
