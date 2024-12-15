package Homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team {
    private List<Developer> developerList;
    private TeamLead teamLead;

    public Team() {
        this.developerList = new ArrayList<>();
    }

    public List<Developer> getDeveloperList() {
        return developerList;
    }

    public void setDeveloperList(List<Developer> developerList) {
        this.developerList = developerList;
    }

    public TeamLead getTeamLead() {
        return teamLead;
    }

    public void setTeamLead(TeamLead teamLead) {
        this.teamLead = teamLead;
    }

    public void addDeveloper(Developer developer) {
        this.developerList.add(developer);
    }

    public void showDeveloperList() {
        System.out.println("Developers list " + this.teamLead.getName() + " teams");
        for (Developer d : developerList) {
            System.out.print(d.getName() + " ");
        }
        System.out.println();
    }

    public void goToFaceToFace() {
        Random random = new Random();
        System.out.println("Face to face meet with -> " + developerList.get(random.nextInt(developerList.size())).getName());
    }
}
