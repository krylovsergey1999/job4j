package ru.job4j.calculator;

public class Calculator {
    private double result;

    /** Метод считающий сумму.
     *
     * @param first - первое значение
     * @param second - второе значение
     */
    void add(double first, double second) {
        this.result = first + second;
    }

    /** Метод считающий разность
     *
     * @param first - первое значение
     * @param second - второе значение
     */
    void subtract(double first, double second) {
        this.result = first - second;
    }

    /** Метод считающий деление
     *
     * @param first - первое значение
     * @param second - второе значение
     */
    void div(double first, double second) {
        this.result = first / second;
    }

    /** Метод считающий произведение
     *
     * @param first - первое значение
     * @param second - второе значение
     */
    void multiple(double first, double second) {
        this.result = first * second;
    }

    public double getResult() {
        return this.result;
    }

}
