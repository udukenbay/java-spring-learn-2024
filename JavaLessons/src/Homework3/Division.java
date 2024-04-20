package Homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Division {
    List<Team> teamList;
    private HeadOfDivision headOfDivision;

    public Division() {
        this.teamList = new ArrayList<>();
    }

    public List<Team> getTeamList() {
        return teamList;
    }

    public void setTeamList(List<Team> teamList) {
        this.teamList = teamList;
    }

    public HeadOfDivision getHeadOfDivision() {
        return headOfDivision;
    }

    public void setHeadOfDivision(HeadOfDivision headOfDivision) {
        this.headOfDivision = headOfDivision;
    }

//    public abstract void manageDivision();

    public void addTeam(Team team) {
        this.teamList.add(team);
    }

    public void showTeamList() {
        System.out.println("Teams list " + this.headOfDivision.getName() + " divisions");
        for (Team team: teamList) {
            System.out.print(team.getTeamLead().getName() + " ");
        }
        System.out.println();
    }

    public void goToTeamBuilding() {
        Random random = new Random();
        System.out.println("let's go to team building with team -> " + teamList.get(random.nextInt(teamList.size())).getTeamLead().getTeamName());
    }
}
