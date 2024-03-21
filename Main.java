// 1. Создать package – data. Работу продолжаем в нем
// 2. Реализовать абстрактный класс User и его наследники Student и Teacher.
// Родитель имеет в себе общие данные (пример: фио, год рождения и тд), а наследники собственные параметры
// (какие, по выбору преподавателя – Пример: studentId для Student, disciplesTaught для Teacher).
// 3. После этого проговорить со студентами важность снижения дублирования кода и легкость управления 
// структурой данных (в том числе, создание необходимого числа корректных конструкторов) и добавления новых сущностей
// путем наследования от абстрактного класса

// 1. Создать package – service. Работу продолжаем в нем
// 2. Создать класс DataService с методами в по управлению сущностями User (create, read) и агрегирующий всех 
// пользователей заведенных в системе
// 3. StudentId должны быть созданы по алгоритму – максимальный id в коллекции + 1. Аналогично и для TeacherId.
// Здесь решение через перебор элементов и instanceOf

// � Создать package – controller. Работу продолжаем в нем
// � Создать класс Controller агрегирующий в себе необходимые классы в виде полей, а инициализируем прям в поле.
// � Создаем метод созданиеСтудента – реализующий логику, путем вызова соответствующих методов интерфейсов:
// � Создания Студента в сервисе
// � Возвращение всех студентов в сервисе
// � Вызов view и передача списка найденных студентов

// � Создать package – view. Работу продолжаем в нем
// � Создать класс StudentView, содержащий в себе метод вывода в консоль данных студента поданных на вход


// ДЗ: Создать класс TeacherView с функцией создание и возвращения всех учителей

package Task1;

import Task1.data.Student;
import Task1.data.Teacher;
import Task1.view.StudetView;
import Task1.view.TeacherView;

public class Main {
    public static void main(String[] args) {
        Student stud1 = new Student("Иван", 18, "Информатика");
        Student stud2 = new Student("Петр", 19, "Разработчик");

        Teacher teacher1 = new Teacher("Ирина Николаевна", 45, "Математика");
        Teacher teacher2 = new Teacher("Кирилл Кириллович", 48, "Статистика");

        StudetView stView = new StudetView();
        TeacherView teachView = new TeacherView();
        stView.createStudent(stud1);
        stView.createStudent(stud2);
        stView.readStudent();

        teachView.createTeacher(teacher1);
        teachView.createTeacher(teacher2);
        teachView.readTeacher();
    }
}
