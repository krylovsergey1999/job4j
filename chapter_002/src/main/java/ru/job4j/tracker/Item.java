package ru.job4j.tracker;

public class Item {
    // Id заявки
    private String id;

    // Имя заявки
    private String name;

    // Описание
    private String desc;

    // Дата создания
    private long create;

    // Список комментариев
    private String[] comments;



    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() { return this.desc;}

    public Item() {
        this.name = "Error";
        this.id = "xxx";
    }

    public Item(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public Item(String name, String desc, long create) {
        this(name, desc);
        this.create = create;
    }
}
