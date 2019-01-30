package ru.job4j.tracker;

public class StartUI {
    private static final String ADD = "0";

    private static final String SHOW = "1";

    private static final String EDIT = "2";

    private static final String DEL = "3";

    private static final String ID = "4";

    private static final String NAME = "5";

    private static final String EXIT = "6";

    private final Input input;

    private final Tracker tracker;

    private boolean success = false;

    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (answer.equals(ADD)) {
                this.createItem();
            } else if (answer.equals(SHOW)) {
                this.showAllItems();
            } else if (answer.equals(EDIT)) {
                this.editItem();
            } else if (answer.equals(DEL)) {
                this.deleteItem();
            } else if (answer.equals(ID)) {
                this.findById();
            } else if (answer.equals(NAME)) {
                this.findByNAME();
            } else if (answer.equals(EXIT)) {
                exit = true;
            }
        }
    }


    private void findByNAME() {
        System.out.println("______________________________");
        System.out.println("Поиск заявок по имени");
        String name = this.input.ask("Введите имя заявки :");
        for (Item el : this.tracker.findByName(name)) {
            this.success = true;
            System.out.println(el.getName() + " " + el.getDesc() + " " + el.getId());
        }
        System.out.println("______________________________");
    }

    private void findById() {
        System.out.println("______________________________");
        System.out.println("Поиск заявки по id");
        String id = this.input.ask("Введите id заявки :");
        Item item = this.tracker.findById(id);
        if (item == null) {
            System.out.println("Заявки с заданным id не существует");
            this.success = false;
        } else {
            showItem(item);
            this.success = true;
        }
        System.out.println("______________________________");
    }

    private void showItem(Item item) {
        System.out.println(item.getName() + " Description:" + " '" + item.getDesc() + " id: " + item.getId());
    }

    private void deleteItem() {
        System.out.println("______________________________");
        System.out.println("Удаление заявки");
        String id = this.input.ask("Введите id заявки :");
        if (this.tracker.delete(id)) {
            System.out.println("Заявка удалена!!!");
        } else {
            System.out.println("Заявки с заданным id нет");
        }
        System.out.println("______________________________");
    }

    private void editItem() {
        System.out.println("______________________________");
        String id = this.input.ask("Введите id заявки :");
        if (this.tracker.findById(id) == null) {
            System.out.println("Заявки с заданным id нет");
        } else {
            String name = this.input.ask("Введите НОВОЕ имя заявки :");
            String desc = this.input.ask("Введите НОВОЕ описание заявки :");
            Item item = new Item(name, desc);
            this.tracker.replace(id, item);
            System.out.println("Заявка изменена!!!");
        }
        System.out.println("______________________________");
    }

    private void showAllItems() {
        System.out.println("______________________________");
        for (Item el : this.tracker.findAll()) {
            System.out.println(el.getName() + " " + el.getDesc());
        }
        System.out.println("Показаны все имеющиеся заявки!");
        System.out.println("______________________________");
    }

    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }

    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("0. Добавить новый товар");
        System.out.println("1. Показать все предметы");
        System.out.println("2. Изменить элемент");
        System.out.println("3. Удалить элемент");
        System.out.println("4. Найти товар по идентификатору");
        System.out.println("5. Найти предметы по имени");
        System.out.println("6. Выход из программы");
        System.out.println("Выбрать => ");
    }

    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }

    public boolean getSuccess() {
        return this.success;
    }
}