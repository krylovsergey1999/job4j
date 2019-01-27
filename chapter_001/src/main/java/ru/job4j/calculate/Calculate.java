package ru.job4j.calculate;

/**
 *Calculate.
 *
 *@author Krylov Sergey (krylov.sergey.1999@yandex.ru)
 */


public class Calculate {
    	/**
	 * Main.
	 * @param args - args.
	*/
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
	/**
	 * Method echo.
	 * @param value
	 * @return value = ...
	 */
	public final String echo(final String value) {
		if (value != null) {
			value = String.format("%s value = ", value);
		} else {
			value = "value = null";
		}
		return String.format("%s %s %s", value, value, value);
	}
}