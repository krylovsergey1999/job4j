package ru.job4j.pseudo;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Paint {
    /**
     * Метод draw() должен печатать псевдокартинку на консоль через метод System.out.println(shape.draw())
     * @param shape
     */
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }
}
