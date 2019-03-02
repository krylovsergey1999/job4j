package ru.job4j.tracker.input;

import ru.job4j.tracker.menu.MenuOutException;

public class StubInput implements Input {
    private final String[] value;
    private int position;

    public StubInput(final String[] value) {
        this.value = value;
    }

    public String ask(String question) {
        return this.value[this.position++];
    }

    @Override
    public int ask(String question, int[] range) {
        boolean ckeck = false;
        try {
            int unknown = Integer.valueOf(this.value[this.position++]) - 1;
            for (int el : range) {
                if (el == unknown) {
                    return unknown;
                }
            }
        } catch (Exception e) {
            throw new NumberFormatException();
        }
        throw new MenuOutException("Out of range");
    }
}
