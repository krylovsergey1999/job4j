package ru.job4j.sortuser;

public class User implements Comparable<User> {
    private int age;
    private String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" + "age=" + age + ", name='" + name + '\'' + '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(User o) {
        return Integer.compare(this.age, o.age);
    }

    @Override
    public boolean equals(Object otherObject) {
        // проверка ссылок
        if (this == otherObject) {
            return true;
        }

        if (otherObject == null) {
            return false;
        }

        if (getClass() != otherObject.getClass()) {
            return false;
        }

        User other = (User) otherObject;

        return name.equals(other.name) && (age == other.age);
    }

    @Override
    public int hashCode() {
        return name.hashCode() * 11 * 13 * 37 * age;
    }
}
