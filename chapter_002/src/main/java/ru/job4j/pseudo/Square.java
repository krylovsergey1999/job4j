package ru.job4j.pseudo;

public class Square implements Shape {
        @Override
        public String draw() {
            StringBuilder pic = new StringBuilder();
            pic.append("++++");
            pic.append("+  +");
            pic.append("+  +");
            pic.append("++++");
            return pic.toString();
        }
}
