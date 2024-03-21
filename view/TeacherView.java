package Task1.view;

import Task1.controller.Controller;
import Task1.data.Teacher;

public class TeacherView {

    private Controller controller = new Controller();

    public void createTeacher(Teacher techer) {

        controller.createUser(techer, techer.getDiscipline());
        System.out.println("Учитель создан успешно!");        
    }

    public void readTeacher() {

        System.out.println("Список учителей:");
        controller.read("Учитель");
    }    
}