package Homework2;

//1) Реализовать класс Task
//    a) добавить необходимые поля
//    b) добавить поле deadLine
//    c) ограничить доступ к полям и методам через модификаторы доступа
//    d) getter/setter для полей
//    e) метод для отображения данных Task displayInfo())

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Task {
    private int id;
    private String title;
    private LocalDate deadline;
    private String status;

    public Task(int id, String title, LocalDate deadline, String status) {
        this.id = id;
        this.title = title;
        this.deadline = deadline;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id1) {
        this.id = id1;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void displayInfo() {
        System.out.println("Task {id: " + this.id +
                ", title='" + this.title + '\'' +
                ", deadline=" + this.deadline + '\'' +
                ", status=" + this.status +
                '}');
    }

//    public static void main(String[] args) {
//        Task task = new Task(1, "First task", LocalDate.of(2024, 04, 12), "NEW");
//        task.displayInfo();
//    }

    public static class Employee {
        private String name;
        private int id;
        private List<Task> tasks = new ArrayList<>();

        public List<Task> getTasks() {
            return tasks;
        }

        public void setTasks(List<Task> tasks) {
            this.tasks = tasks;
        }

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

        public void addTask(Task task) {
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
}
