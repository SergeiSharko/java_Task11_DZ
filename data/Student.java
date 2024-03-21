package Task1.data;

public class Student extends User {

    private String direction;

    public Student() {
    }

    public Student(String name, int age, String direction) {
        super(name, age);
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    @Override
    public String toString() {
        return String.format("Студент: Имя -> %s| Возраст -> %d| Направление -> %s|", name, age, direction);
    }
}