package ru.job4j.tracker.input;

import java.util.Scanner;

public class ConsoleInput implements Input {
    private Scanner sc = new Scanner(System.in);

    @Override
    public String ask(String question) {
        System.out.print(question);
        return sc.nextLine();
    }

    @Override
    public int ask(String question, int[] range) {
        while (true) {
            try {
                System.out.print(question);
                int unknown = Integer.valueOf(sc.nextLine()) - 1;
                for (int el : range) {
                    if (el == unknown)
                        return unknown;
                }
                System.out.println("select a value from the menu range!!!");
            } catch (Exception e) {
                System.out.println("enter the number!!!");
            }
        }
    }
}
