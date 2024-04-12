package Homework2;

//1) Реализовать класс Task
//    a) добавить необходимые поля
//    b) добавить поле deadLine
//    c) ограничить доступ к полям и методам через модификаторы доступа
//    d) getter/setter для полей
//    e) метод для отображения данных Task displayInfo())

import java.time.LocalDate;

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
}
