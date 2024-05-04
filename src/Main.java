import Homework2.Task;
import Homework3.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task(0, "Create file upload service", LocalDate.of(2024, 04, 20), "NEW");
        Task task2 = new Task(1, "Check keycloak for tm-clients", LocalDate.of(2024, 04, 10), "NEW");
        Task task3 = new Task(2, "Send java home tasks", LocalDate.of(2024, 04, 12), "NEW");
        Task task4 = new Task(3, "Convert time-zone for all projects", LocalDate.of(2024, 04, 10), "NEW");

        Developer developer1 = new Developer("Urzi", 49777, 5000, "Middle Software Developer");
        Developer developer2 = new Developer("John", 49778, 5500, "Junior Vue Developer");

        Developer developer3 = new Developer("Ara", 49779, 4500, "Junior JavaScript Developer");
        Developer developer4 = new Developer("Mia", 49780, 5000, "Middle Java Developer");

        Developer developer5 = new Developer("Aiya", 49781, 5000, "Junior Flutter Developer");
        Developer developer6 = new Developer("Vilaya", 49782, 4800, "React Developer");

        Developer developer7 = new Developer("Asya", 49783, 5000, "Software Developer");
        Developer developer8 = new Developer("Rus", 49784, 4800, "React Developer");

        Developer developer9 = new Developer("Deli", 49785, 5000, "Vue Developer");
        Developer developer10 = new Developer("Ray", 49786, 4800, "React Developer");

        TeamLead teamLead1 = new TeamLead("Aman", 49700, 7000, "Telemarketing");
        TeamLead teamLead2 = new TeamLead("Esa", 49701, 7500, "Business");
        TeamLead teamLead3 = new TeamLead("Sara", 49702, 6500, "Soft Collection");

        TeamLead teamLead4 = new TeamLead("Dave", 49703, 7000, "Call Center");
        TeamLead teamLead5 = new TeamLead("Dosa", 49704, 8000, "Chat Center");

        // set team
        Team team1 = new Team();
        team1.setTeamLead(teamLead1);

        team1.addDeveloper(developer3);
        team1.addDeveloper(developer4);
        team1.showDeveloperList();

        // set team
        Team team2 = new Team();
        team2.setTeamLead(teamLead2);

        team2.addDeveloper(developer1);
        team2.addDeveloper(developer2);
        team2.showDeveloperList();

        // set team
        Team team3 = new Team();
        team3.setTeamLead(teamLead3);

        team3.addDeveloper(developer5);
        team3.addDeveloper(developer6);
        team3.showDeveloperList();

        // set team
        Team team4 = new Team();
        team4.setTeamLead(teamLead4);

        team4.addDeveloper(developer7);
        team4.addDeveloper(developer8);
        team4.showDeveloperList();

        // set team
        Team team5 = new Team();
        team5.setTeamLead(teamLead5);

        team5.addDeveloper(developer9);
        team5.addDeveloper(developer10);
        team5.showDeveloperList();

        HeadOfDivision head1 = new HeadOfDivision("Ama", 49100, 10000, "Outbound Channels");
        HeadOfDivision head2 = new HeadOfDivision("Mak", 49300, 10000, "Contact Center");
        HeadOfDivision head3 = new HeadOfDivision("Sola", 49500, 9000, "Business");


        // set division
        Division division1 = new Division();
        division1.setHeadOfDivision(head1);

        division1.addTeam(team1);
        division1.addTeam(team3);
        division1.showTeamList();

        // set division
        Division division2 = new Division();
        division2.setHeadOfDivision(head2);

        division2.addTeam(team2);
        division2.showTeamList();

        // set division
        Division division3 = new Division();
        division3.setHeadOfDivision(head3);

        division3.addTeam(team4);
        division3.addTeam(team5);
        division3.showTeamList();

        // set department
        Director director = new Director("Anton", 49000, 15000);

        Department department = new Department();
        department.setDirector(director);

        department.addDivision(division1);
        department.addDivision(division2);
        department.addDivision(division3);
        department.showDivisionList();

        // Team own method ex.
        team1.goToFaceToFace(); // Team свой собственный функционал
        team2.goToFaceToFace(); // Team свой собственный функционал
        team5.goToFaceToFace();
        division1.goToTeamBuilding(); // Division свой собственный функционал
        division3.goToTeamBuilding(); // Division свой собственный функционал
        department.goToTeamBuildingWithDivision(); // Department свой собственный функционал

        System.out.println("Developer bonus         : " + developer1.calculateBonus() + " and salary with bonus is " + developer1.getSalary() * developer1.calculateBonus());
        System.out.println("Teamlead bonus          : " + teamLead4.calculateBonus() + " and salary with bonus is " + teamLead4.getSalary() + teamLead4.calculateBonus());
        System.out.println("Head of division bonus  : " + head1.calculateBonus() + " and salary with bonus is " + head1.getSalary() * head1.calculateBonus());
        System.out.println("Director bonus          : " + director.calculateBonus() + " and salary with bonus is " + director.getSalary() * director.calculateBonus());

        // overload ex.
        developer1.addTask(task1);
        developer1.addTask(task2);
        developer1.addTask(task3);
        developer1.addTask(task4);

        developer1.setStatus(2, "DONE");
        developer1.setStatus(LocalDate.of(2024, 04, 12), "EXPIRED");

        for (Task t : developer1.getTasks()) {
            t.displayInfo();
        }

        // overload for setPosition for Developer
        System.out.println();
        developer2.setPosition();
        System.out.println(developer2.getPosition());

        developer1.setPosition("Senior developer");
        System.out.println(developer1.getPosition());

        // overload for increase salary for TeamLead
        teamLead4.increaseSalary();
        System.out.println(teamLead4.getName() + " new salary is " + teamLead4.getSalary());

        teamLead5.increaseSalary(0.4);
        System.out.println(teamLead5.getName() + " new salary is " + teamLead5.getSalary());

        // overload for divisionReconstruction for HeadOfDivision
        System.out.println();
        head1.divisionReconstruction(9000, "New Commers Division");
        System.out.println(head1.getSalary() + " " + head1.getDivisionName());

        head2.divisionReconstruction("Volo", 8000, "Auto");
        System.out.println(head2.getName() + " " + head2.getSalary() + " " + head2.getDivisionName());

        head3.divisionReconstruction("Colm", "DevKids", 8500);
        System.out.println(head3.getName() + " " + head3.getDivisionName() + " " + head3.getSalary());

        developer1.setCV();
    }
}