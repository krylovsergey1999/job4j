package ru.job4j.loop;

public class Counter {
    /**
     * Считает сумму четных чисел в диапазоне.
     * @param start - начальный эл-т
     * @param finish - конечный эл-т
     * @return - кол-во четных
     */
    public int add(int start, int finish) {
        int check = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                check += i;
            }
        }
        return check;
    }

}
