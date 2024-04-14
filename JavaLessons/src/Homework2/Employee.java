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

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    private List<Task> tasks = new ArrayList<>();

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

    public void addTask(int id, String title, LocalDate deadline, String status) {
        Task task = new Task(id, title, deadline, status);
        tasks.add(task);
    }

    public void setStatus(int id, String newStatus) {
        for (Task t : tasks) {
            if (id == t.getId()) {
                t.setStatus(newStatus);
            }
        }
    }

    public void deadlineExpression(int id, LocalDate newDate) {
        for (Task t : tasks) {
            if (id == t.getId()) {
                t.setDeadline(newDate);
            }
        }
    }

    public void countExpiredTasks() {
        // метод для отображения просроченных задач работника countExpiredTasks() - сравнивать с текущем временем
        LocalDate currentDate = LocalDate.now();

        for (Task t : tasks) {
            if (t.getDeadline().isBefore(currentDate) && t.getStatus().equals("NEW")) {
                System.out.println("'" + t.getTitle() + "' is expired!");
            }
        }
    }
}
