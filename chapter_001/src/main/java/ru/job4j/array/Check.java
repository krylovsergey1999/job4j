package ru.job4j.array;

public class Check {
    /**
     * Массив заполнен true или false - проверка
     *
     * @param data - сам массив
     * @return - ответ
     */
    public boolean mono(boolean[] data) {
        for (int i = 1; i < data.length; i++) {
            if (data[i] != data[0]) {
                return false;
            }
        }
        return true;
    }
}