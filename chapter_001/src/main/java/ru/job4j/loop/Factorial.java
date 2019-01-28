package ru.job4j.loop;

/**
 * Находит факториал числа.
 */
public class Factorial {
    /**
     * Находит файкториал.
     * @param n - число
     * @return факториал
     */
    public int calc(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
