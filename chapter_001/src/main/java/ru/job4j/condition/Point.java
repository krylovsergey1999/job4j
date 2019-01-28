package ru.job4j.condition;

/**
 * Класс точка.
 * @author Крылов Сергей
 * @version $Id$
 * @since 0.1
 */

public class Point {
    private int x;
    private int y;

    /**
     * Конструктор точки.
     * @param x - ось X
     * @param y - ось Y
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Метод находит расстояние между точками, той от который мы метод вызываем и той которую передаем.
     * Используем просто теорему пифагора.
     * @param that - точка
     * @return - расстояние
     */
    public double distanceTo(Point that) {
        return Math.sqrt(
                Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
        );
    }
}
