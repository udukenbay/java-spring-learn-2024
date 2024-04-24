package Homework3;

import Homework2.Employee;

public class Director extends Employee {

    public Director(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("Director set budjet for the whole year");
    }

    @Override
    public double calculateBonus() {
        double bonus = 0.2;
        return bonus;
    }
}
