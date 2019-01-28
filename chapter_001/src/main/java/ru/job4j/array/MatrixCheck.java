package ru.job4j.array;

public class MatrixCheck {
    /**
     * Квадратный массив заполнен true или false по диагоналям. Надо определить.
     *
     * @param data - данный массив
     * @return - ответ заполнен/или нет
     */
    public boolean mono(boolean[][] data) {
        int l = data.length;
        for (int i = 0; i < l; i++) {
            if (data[i][i] != data[0][0]) {
                return false;
            }
            if (data[i][l - 1 - i] != data[0][l - 1]) {
                return false;
            }
        }
        return true;
    }
}