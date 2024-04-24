package Homework3;

import Homework2.Employee;

public class TeamLead extends Employee {
    private String teamName;

    public String getTeamName() {
        return teamName;
    }

    public TeamLead(String name, int id, double salary, String teamName) {
        super(name, id, salary);
        this.teamName = teamName;
    }

    @Override
    public void work() {
        System.out.println("Teamlead is managing developers job.");
    }

    @Override
    public double calculateBonus() {
        double bonus = 0;
        if (this.getSalary() < 7000) {
            bonus += this.getSalary() * 0.1;
        } else {
            bonus += this.getSalary() * 0.11;
        }
        return bonus;
    }

    public double increaseSalary() {
        double count = 0.1;
        double newSalary = this.getSalary() * count;
        return newSalary;
    }

    public double increaseSalary(double percentage) {
        double newSalary = this.getSalary() * percentage;
        return newSalary;
    }
}
