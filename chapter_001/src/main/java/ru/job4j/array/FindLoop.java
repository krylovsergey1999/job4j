package ru.job4j.array;

public class FindLoop {
    /**
     * Проверяет наличие элемента в данном масиве
     * @param data Заданный массив
     * @param el Искомый элемент
     * @return индекс искомого элемента в массиве или -1, если такой элемент отсутствует
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        int index = 0;
        for (int i: data) {
            if (i == el) {
                rst = index;
                break;
            } else {
                index++;
            }
        }
        return rst;
    }
}