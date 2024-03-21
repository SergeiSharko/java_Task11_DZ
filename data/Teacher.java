package Task1.data;

public class Teacher extends User {

    private String discipline;

    public Teacher() {
    }

    public Teacher(String name, int age, String discipline) {
        super(name, age);
        this.discipline = discipline;
    }

    public String getDiscipline() {
        return discipline;
    }

    @Override
    public String toString() {
        return String.format("Учитель: Имя -> %s| Возраст -> %d| Предмет -> %s|", name, age, discipline);
    }
}