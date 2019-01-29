package professions;

public class Teacher extends Profession {
    public Teacher(String name) {
        super(name, "Учитель");
    }

    /**
     * Учит студента
     * @param student студент
     */
    public void teach(Student student) {
    }
}
