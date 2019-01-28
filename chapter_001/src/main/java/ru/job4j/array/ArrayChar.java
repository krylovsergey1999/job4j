package ru.job4j.array;

/**
 * Обертка над строкой.
 */
public class ArrayChar {
    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Проверяет. что слово начинается с префикса.
     * @param prefix префикс.
     * @return если слово начинается с префикса
     */
    public boolean startWith(String prefix) {
        int index = 0;
        char[] value = prefix.toCharArray();
        for(char el: value){
            if (el == this.data[index]){
                index++;
            } else {
                return false;
            }
        }
        // проверить. что массив data имеет первые элементы одинаковые с value
        return true;
    }
}