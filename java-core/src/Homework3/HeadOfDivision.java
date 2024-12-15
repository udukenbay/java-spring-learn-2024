package Homework3;

import Homework2.Employee;

public class HeadOfDivision extends Employee {
    private String divisionName;

    public HeadOfDivision(String name, int id, double salary, String divisionName) {
        super(name, id, salary);
        this.divisionName = divisionName;
    }

    public String getDivisionName() {
        return divisionName;
    }

    @Override
    public void work() {
        System.out.println("Head of division manage teamlead's job as well as developers job.");
    }

    @Override
    public double calculateBonus() {
        double bonus = 0;
        if (this.getId() < 49300) {
            bonus = 0.1;
        } else {
            bonus = 0.05;
        }
        return bonus;
    }

    public void divisionReconstruction(String name, double salary, String divisionName) {
        super.setName(name);
        super.setSalary(salary);
        this.divisionName = divisionName;
    }

    public void divisionReconstruction(String name, String divisionName, double salary) {
        super.setName(name);
        super.setSalary(salary + 500);
        this.divisionName = divisionName;
    }

    public void divisionReconstruction(double salary, String divisionName) {
        super.setSalary(salary + 700);
        this.divisionName = divisionName;
    }
}
