package ru.job4j.tracker;

public class StubInput implements Input {
    private final String[] value;

    private boolean happened = true;


    private int position;

    public StubInput(final String[] value) {
        this.value = value;
    }

    public boolean getHappened() {
        return this.happened;
    }

    public void setHappened(boolean x) {
        this.happened = x;
    }

    @Override
    public String ask(String question) {
        return this.value[this.position++];
    }
}
