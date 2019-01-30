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

    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            switch (answer) {
                case ADD: {
                    this.createItem();
                    break;
                }
                case SHOW: {
                    this.showAllItems();
                    break;
                }
                case EDIT: {
                    this.editItem();
                    break;
                }
                case DEL: {
                    this.deleteItem();
                    break;
                }
                case ID: {
                    this.findById();
                    break;
                }
                case NAME: {
                    this.findByNAME();
                    break;
                }
                case EXIT: {
                    exit = true;
                }
            }
        }
    }

    private void findByNAME() {
        System.out.println("______________________________");
        System.out.println("Поиск заявок по имени");
        String name = this.input.ask("Введите имя заявки :");
        for (Item el : this.tracker.findByName(name)) {
            System.out.println(el.getName() + " " + el.getDesc() + " " + el.getId());
        }
        System.out.println("______________________________");
    }

    private void findById() {
        System.out.println("______________________________");
        System.out.println("Поиск заявки по id");
        String id = this.input.ask("Введите id заявки :");
        if (this.tracker.findById(id) == null) {
            System.out.println("Заявки с заданным id не существует");
        } else {
            showItem(this.tracker.findById(id));
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
        if (this.tracker.findById(id) == null) {
            System.out.println("Заявки с заданным id нет");
        } else {
            this.tracker.delete(id);
            System.out.println("Заявка удалена!!!");
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
        if (this.tracker.getPosition() != 0) {
            System.out.println("Ниже показаны будут все заявки.");
        } else {
            System.out.println("Заявок нет");
        }
        for (Item el : this.tracker.findAll()) {
            System.out.println(el.getName() + " " + el.getDesc());
        }
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
}