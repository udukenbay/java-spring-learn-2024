package Homework2.Test;

import java.time.LocalDate;

import Homework2.Employee;
import Homework2.Task;

public class Test {

    public static void main(String[] args) {
//        tasks[0] = new Task(2, "Second task", LocalDate.of(2024, 04, 15), "NEW");
//        tasks[0].displayInfo();

        Employee emp1 = new Employee("Urziya", 1);
        emp1.addTask(0, "Create file upload service", LocalDate.of(2024, 04, 20), "NEW");
        emp1.addTask(1, "Check keycloak for tm-clients", LocalDate.of(2024, 04, 10), "NEW");
        emp1.addTask(2, "Send java home tasks", LocalDate.of(2024, 04, 12), "NEW");
        emp1.addTask(3, "Convert time-zone for all projects", LocalDate.of(2024, 04, 10), "NEW");

        for (Task t : emp1.getTasks()) {
            t.displayInfo();
        }

        emp1.setStatus(1, "DONE");
        System.out.println("The new status = " + emp1.getTasks().get(1).getStatus() + " for '" + emp1.getTasks().get(1).getTitle() + "'");

        emp1.deadlineExpression(2, LocalDate.of(2024, 04, 15));
        System.out.println("The new deadline = " + emp1.getTasks().get(2).getDeadline() + " for '" + emp1.getTasks().get(2).getTitle() + "'");

        emp1.countExpiredTasks();
    }
}
