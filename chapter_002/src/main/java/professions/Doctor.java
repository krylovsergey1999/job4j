package professions;

public class Doctor extends Profession {
    public Doctor(String name) {
        super(name, "Доктор");
    }

    public void heal(Patient patient) {
        // лечит пациента
    }
}
