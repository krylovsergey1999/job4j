package ru.job4j.tracker;

public class Item {
    // Id заявки
    private String id;

    // Имя заявки
    private String name;

    // Описание
    private String desc;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public void showItem() {
        System.out.println(this.getName() + " Description:" + " " + this.getDesc() + " id: " + this.getId());
    }

    public Item(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
}
