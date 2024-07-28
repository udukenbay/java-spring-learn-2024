package Homework3;

import Homework2.Employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Developer extends Employee {
    private String position;

    public Developer(String name, int id, double salary, String position) {
        super(name, id, salary);
        this.position = position;
    }

    @Override
    public void work() {
        System.out.println("Developer is working on a project.");
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition() {
        this.position = "Intern";
    }

    @Override
    public double calculateBonus() {
        double bonus = 0;
        if (position.contains("Senior")) {
            bonus = 0.32;
        } else {
            bonus = 0.3;
        }
        return bonus;
    }

    public String setCV() {
        String s = null;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)))) {
            s = reader.readLine();
         } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return s;
    }
}
