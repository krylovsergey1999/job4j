package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import java.util.Random;

public class Tracker {
    private final Item[] items = new Item[100];
    private static final Random RN = new Random();
    private int position = 0;
    private Date date = new Date();

    public Item[] getItems() {
        return items;
    }

    public Item add(Item item) {
        item.setId(generateId());
        this.items[this.position++] = item;
        return item;
    }

    private String generateId() {
        long id = date.getTime() * RN.nextInt();
        String s = Objects.toString(id, null);
        return s;
    }

    public boolean replace(String id, Item item) {
        boolean res = false;
        for (int i = 0; i < position; i++) {
            if ((this.items[i].getId()).equals(id)) {
                String s = this.items[i].getId();
                this.items[i] = item;
                this.items[i].setId(s);
                res = true;
                break;
            }
        }
        return res;
    }

    public Item[] findAll() {
        return Arrays.copyOf(this.items, this.position);
    }

    public Item findById(String id) {
        Item result = null;
        for (int i = 0; i < this.position; i++) {
            if (this.items[i].getId().equals(id)) {
                result = this.items[i];
                break;
            }
        }
        return result;
    }

    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < this.position; i++) {
            if (this.items[i].getId().equals(id)) {
                System.arraycopy(this.items, i + 1, this.items, i, this.position - 1 - i);
                result = true;
                this.position--;
                break;
            }
        }
        return result;
    }

    public Item[] findByName(String key) {
        int kol = 0;
        for (int i = 0; i < this.position; i++) {
            if (this.items[i].getName().equals(key)) {
                kol++;
            }
        }
        Item[] result = new Item[kol];
        int counter = 0;
        for (int i = 0; i < this.position; i++) {
            if (this.items[i].getName().equals(key)) {
                result[counter] = this.items[i];
                counter++;
            }
        }
        return result;
    }

    public int getPosition() {
        return this.position;
    }
}
