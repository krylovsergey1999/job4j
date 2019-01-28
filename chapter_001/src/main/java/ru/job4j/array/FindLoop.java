package ru.job4j.array;

public class FindLoop {
    /**
     * Проверяет наличие элемента в данном масиве
     *
     * @param data Заданный массив
     * @param el   Искомый элемент
     * @return индекс искомого элемента в массиве или -1, если такой элемент отсутствует
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}