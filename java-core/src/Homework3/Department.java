package Homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Department {
    private List<Division> divisionList;
    private Director director;

    public Department() {
        this.divisionList = new ArrayList<>();
    }

    public List<Division> getDivisionList() {
        return divisionList;
    }

    public void setDivisionList(List<Division> divisionList) {
        this.divisionList = divisionList;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public void addDivision(Division division) {
        this.divisionList.add(division);
    }

    public void showDivisionList() {
        System.out.println("Divisions list " + this.director.getName() + " department");
        for (Division division: divisionList) {
            System.out.println(division.getHeadOfDivision().getDivisionName() + " ");
        }
        System.out.println();
    }

    public void goToTeamBuildingWithDivision() {
        Random random = new Random();
        System.out.println("let's go to team building with division -> " + divisionList.get(random.nextInt(divisionList.size())).getHeadOfDivision().getDivisionName());
    }
}
