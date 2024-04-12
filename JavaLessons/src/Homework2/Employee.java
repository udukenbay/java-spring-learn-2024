package Homework2;

import Homework2.Task;

public class Employee {
    private String name;
    private int id;

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

    public static void main(String[] args) {
        Task[] tasks = new Task[100];
        tasks[0] = new Task(2);
        tasks[0].displayInfo();
    }
}
