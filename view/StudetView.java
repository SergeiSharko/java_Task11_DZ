package Task1.view;

import Task1.controller.Controller;
import Task1.data.Student;

public class StudetView {

    private Controller controller = new Controller();

    public void createStudent(Student stud) {

        controller.createUser(stud, stud.getDirection());
        System.out.println("Студент создан успешно!");        
    }

    public void readStudent() {

        System.out.println("Список студентов:");
        controller.read("Студент");
    }    
}
