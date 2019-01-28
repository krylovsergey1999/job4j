package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    /**
     *  Рубли в доллары конвертит и проверяет.
     */
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }

    /**
     *  Рубли в евро конвертит и проверяет.
     */
    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }

    /**
     *  Евро в рубли конвертит и проверяет.
     */
    @Test
    public void whenEuro70ToRuble() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(70);
        assertThat(result, is(4900));
    }

    /**
     *  Доллары в рубли конвертит и проверяет.
     */
    @Test
    public void whenDollar60ToRuble() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(50);
        assertThat(result, is(3000));
    }
}