package tracker;

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

    public Item() {
        this.name = "Default";
        this.id = "";
    }

    public void setId(String id) {
        this.id = id;
    }

    public Item(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
}
