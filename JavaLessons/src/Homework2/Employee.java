package Homework2;

//2) Реализовать класс Employee
//    a) добавить необходимые поля
//    b) добавить поле для списка/массива Task
//    c) добавить методы добавления Task в список, закрытия Task, продление deadLine у Task
//    d) ограничить доступ к полям и методам через модификаторы доступа
//    e) getter/setter для полей
//    f) метод для отображения просроченных задач работника countExpiredTasks() - сравнивать с текущем временем
//
//Добавил в домашнее задание пункт с подсчётом просроченных

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private int id;
    List<Task> tasks = new ArrayList<>();

    public Employee(String name, int id) { // , String department, double salary
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    void addTask(int id, String title, LocalDate deadline, String status) {
        Task task = new Task(id, title, deadline, status);
        tasks.add(task);
    }

    void setStatus(int id, String newStatus) {
        for (Task t : tasks) {
            if (id == t.getId()) {
                t.setStatus(newStatus);
            }
        }
    }

    void deadlineExpression(int id, LocalDate newDate) {
        for (Task t : tasks) {
            if (id == t.getId()) {
                t.setDeadline(newDate);
            }
        }
    }

    void countExpiredTasks() {
        // метод для отображения просроченных задач работника countExpiredTasks() - сравнивать с текущем временем
        LocalDate currentDate = LocalDate.now();

        for (Task t : tasks) {
            if (t.getDeadline().isBefore(currentDate) && t.getStatus().equals("NEW")) {
                System.out.println("'" + t.getTitle() + "' is expired!");
            }
        }
    }

    public static void main(String[] args) {
//        tasks[0] = new Task(2, "Second task", LocalDate.of(2024, 04, 15), "NEW");
//        tasks[0].displayInfo();

        Employee emp1 = new Employee("Urziya", 1);
        emp1.addTask(0, "Create file upload service", LocalDate.of(2024, 04, 20), "NEW");
        emp1.addTask(1, "Check keycloak for tm-clients", LocalDate.of(2024, 04, 10), "NEW");
        emp1.addTask(2, "Send java home tasks", LocalDate.of(2024, 04, 12), "NEW");
        emp1.addTask(3, "Convert time-zone for all projects", LocalDate.of(2024, 04, 10), "NEW");

        for (Task t : emp1.tasks) {
            t.displayInfo();
        }

        emp1.setStatus(1, "DONE");
        System.out.println("The new status = " + emp1.tasks.get(1).getStatus() + " for '" + emp1.tasks.get(1).getTitle() + "'");
//        System.out.println("The new status = " + emp1.tasks[1].getStatus() + " for '" + emp1.tasks[1].getTitle() + "'");

        emp1.deadlineExpression(2, LocalDate.of(2024, 04, 15));
        System.out.println("The new deadline = " + emp1.tasks.get(2).getDeadline() + " for '" + emp1.tasks.get(2).getTitle() + "'");
//        System.out.println("The new deadline = " + emp1.tasks[2].getDeadline() + " for '" + emp1.tasks[1].getTitle() + "'");

        emp1.countExpiredTasks();
    }
}
