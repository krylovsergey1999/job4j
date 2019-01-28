package ru.job4j.max;

public class Max {
    /**
     * Максимум из двух элементов использовал тернарный оператор.
     *
     * @param first  - число
     * @param second - число
     * @return - максимум из 2 чисел
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }

    /**
     * Максимум из 3 чисел.
     *
     * @param first  - первое число
     * @param second - второе число
     * @param third  - третье число
     * @return - максимальное число
     */
    public int max(int first, int second, int third) {
        return max(max(first, second), third);
    }
}
