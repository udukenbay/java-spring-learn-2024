//import Homework2.Task;
//import Homework3.*;
//import Homework6.*;
//import Homework7.Bank;
//import Homework7.Account;
//import Homework7.Transaction;
//import Homework8.ContactsList;
//import Homework8.LogAnalyzer;
import Homework10.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        Task task1 = new Task(0, "Create file upload service", LocalDate.of(2024, 04, 20), "NEW");
//        Task task2 = new Task(1, "Check keycloak for tm-clients", LocalDate.of(2024, 04, 10), "NEW");
//        Task task3 = new Task(2, "Send java home tasks", LocalDate.of(2024, 04, 12), "NEW");
//        Task task4 = new Task(3, "Convert time-zone for all projects", LocalDate.of(2024, 04, 10), "NEW");
//
//        Developer developer1 = new Developer("Urzi", 49777, 5000, "Middle Software Developer");
//        Developer developer2 = new Developer("John", 49778, 5500, "Junior Vue Developer");
//
//        Developer developer3 = new Developer("Ara", 49779, 4500, "Junior JavaScript Developer");
//        Developer developer4 = new Developer("Mia", 49780, 5000, "Middle Java Developer");
//
//        Developer developer5 = new Developer("Aiya", 49781, 5000, "Junior Flutter Developer");
//        Developer developer6 = new Developer("Vilaya", 49782, 4800, "React Developer");
//
//        Developer developer7 = new Developer("Asya", 49783, 5000, "Software Developer");
//        Developer developer8 = new Developer("Rus", 49784, 4800, "React Developer");
//
//        Developer developer9 = new Developer("Deli", 49785, 5000, "Vue Developer");
//        Developer developer10 = new Developer("Ray", 49786, 4800, "React Developer");
//
//        TeamLead teamLead1 = new TeamLead("Aman", 49700, 7000, "Telemarketing");
//        TeamLead teamLead2 = new TeamLead("Esa", 49701, 7500, "Business");
//        TeamLead teamLead3 = new TeamLead("Sara", 49702, 6500, "Soft Collection");
//
//        TeamLead teamLead4 = new TeamLead("Dave", 49703, 7000, "Call Center");
//        TeamLead teamLead5 = new TeamLead("Dosa", 49704, 8000, "Chat Center");
//
//        // set team
//        Team team1 = new Team();
//        team1.setTeamLead(teamLead1);
//
//        team1.addDeveloper(developer3);
//        team1.addDeveloper(developer4);
//        team1.showDeveloperList();
//
//        // set team
//        Team team2 = new Team();
//        team2.setTeamLead(teamLead2);
//
//        team2.addDeveloper(developer1);
//        team2.addDeveloper(developer2);
//        team2.showDeveloperList();
//
//        // set team
//        Team team3 = new Team();
//        team3.setTeamLead(teamLead3);
//
//        team3.addDeveloper(developer5);
//        team3.addDeveloper(developer6);
//        team3.showDeveloperList();
//
//        // set team
//        Team team4 = new Team();
//        team4.setTeamLead(teamLead4);
//
//        team4.addDeveloper(developer7);
//        team4.addDeveloper(developer8);
//        team4.showDeveloperList();
//
//        // set team
//        Team team5 = new Team();
//        team5.setTeamLead(teamLead5);
//
//        team5.addDeveloper(developer9);
//        team5.addDeveloper(developer10);
//        team5.showDeveloperList();
//
//        HeadOfDivision head1 = new HeadOfDivision("Ama", 49100, 10000, "Outbound Channels");
//        HeadOfDivision head2 = new HeadOfDivision("Mak", 49300, 10000, "Contact Center");
//        HeadOfDivision head3 = new HeadOfDivision("Sola", 49500, 9000, "Business");
//
//
//        // set division
//        Division division1 = new Division();
//        division1.setHeadOfDivision(head1);
//
//        division1.addTeam(team1);
//        division1.addTeam(team3);
//        division1.showTeamList();
//
//        // set division
//        Division division2 = new Division();
//        division2.setHeadOfDivision(head2);
//
//        division2.addTeam(team2);
//        division2.showTeamList();
//
//        // set division
//        Division division3 = new Division();
//        division3.setHeadOfDivision(head3);
//
//        division3.addTeam(team4);
//        division3.addTeam(team5);
//        division3.showTeamList();
//
//        // set department
//        Director director = new Director("Anton", 49000, 15000);
//
//        Department department = new Department();
//        department.setDirector(director);
//
//        department.addDivision(division1);
//        department.addDivision(division2);
//        department.addDivision(division3);
//        department.showDivisionList();
//
//        // Team own method ex.
//        team1.goToFaceToFace(); // Team свой собственный функционал
//        team2.goToFaceToFace(); // Team свой собственный функционал
//        team5.goToFaceToFace();
//        division1.goToTeamBuilding(); // Division свой собственный функционал
//        division3.goToTeamBuilding(); // Division свой собственный функционал
//        department.goToTeamBuildingWithDivision(); // Department свой собственный функционал
//
//        System.out.println("Developer bonus         : " + developer1.calculateBonus() + " and salary with bonus is " + developer1.getSalary() * developer1.calculateBonus());
//        System.out.println("Teamlead bonus          : " + teamLead4.calculateBonus() + " and salary with bonus is " + teamLead4.getSalary() + teamLead4.calculateBonus());
//        System.out.println("Head of division bonus  : " + head1.calculateBonus() + " and salary with bonus is " + head1.getSalary() * head1.calculateBonus());
//        System.out.println("Director bonus          : " + director.calculateBonus() + " and salary with bonus is " + director.getSalary() * director.calculateBonus());
//
//        // overload ex.
//        developer1.addTask(task1);
//        developer1.addTask(task2);
//        developer1.addTask(task3);
//        developer1.addTask(task4);
//
//        developer1.setStatus(2, "DONE");
//        developer1.setStatus(LocalDate.of(2024, 04, 12), "EXPIRED");
//
//        for (Task t : developer1.getTasks()) {
//            t.displayInfo();
//        }
//
//        // overload for setPosition for Developer
//        System.out.println();
//        developer2.setPosition();
//        System.out.println(developer2.getPosition());
//
//        developer1.setPosition("Senior developer");
//        System.out.println(developer1.getPosition());
//
//        // overload for increase salary for TeamLead
//        teamLead4.increaseSalary();
//        System.out.println(teamLead4.getName() + " new salary is " + teamLead4.getSalary());
//
//        teamLead5.increaseSalary(0.4);
//        System.out.println(teamLead5.getName() + " new salary is " + teamLead5.getSalary());
//
//        // overload for divisionReconstruction for HeadOfDivision
//        System.out.println();
//        head1.divisionReconstruction(9000, "New Commers Division");
//        System.out.println(head1.getSalary() + " " + head1.getDivisionName());
//
//        head2.divisionReconstruction("Volo", 8000, "Auto");
//        System.out.println(head2.getName() + " " + head2.getSalary() + " " + head2.getDivisionName());
//
//        head3.divisionReconstruction("Colm", "DevKids", 8500);
//        System.out.println(head3.getName() + " " + head3.getDivisionName() + " " + head3.getSalary());
//
//        // System.out.println("Please try to put cv with texting some text message ");
//        // developer1.setCV();
//
//        // let's try to increase salary
//        // teamLead1.increaseSalary(-0.2);
//
//        // homework-6-collections --- 18.05.2024
//        System.out.println("Collections");
//        Store store = new Store();
//
//        PayOperation payOp1 = new PayOperation("123", 50.0);
//        PayOperation payOp2 = new PayOperation("456", 100.0);
//        PayOperation payOp3 = new PayOperation("789", 199.99);
//        store.addPayOperation(payOp1);
//        store.addPayOperation(payOp2);
//        store.addPayOperation(payOp3);
//
//        List<Product> electronics = Arrays.asList(new Product("Laptop", 999.99), new Product("Phone", 599.99));
//        List<Product> courses = Arrays.asList(new Product("JavaCourse-1", 50.0), new Product("SpringBoot-2", 40.0));
//        List<Product> groceries = Arrays.asList(new Product("Apple", 2.99), new Product("Milk", 1.99));
//        store.addProductList("Electronics", electronics);
//        store.addProductList("Courses", courses);
//        store.addProductList("Groceries", groceries);
//
//        System.out.println("Pay Operations:");
//        List<PayOperation> payOps = store.getPayOperationsAsList();
//        store.showPayOperations(payOps);
//
//        System.out.println("\nProducts in Courses");
//        store.showProductListsByCategory("Courses");
//        // call method which inside call method with HashMap
//        System.out.println("Let's call method with HashMap");
//        store.showAllProductsList();

        // homework-7-generics
//        Bank<Double> bank = new Bank<>();
//
//        Account<Double> account1 = new Account<>("acc-1", 1000.0);
//        Account<Double> account2 = new Account<>("acc-2", 2000.0);
//
//        bank.addNewAccountBalance(account1);
//        bank.addNewAccountBalance(account2);
//
//        Transaction<Account<Double>> transaction = new Transaction<>("1", account1, account2, 500.0);
//        bank.executeTransaction(transaction);
//
//        List<Account<Double>> balances = bank.getInfoAboutAccountBalances();
//        for (Account<Double> account: balances) {
//            System.out.println("Account " + account.getId() + " Balance: " + account.getBalance());
//        }
//
//        transaction.deposit(55.0);
//        transaction.withdraw(35.0);
//
//        Account<Double> account3 = new Account<>("acc-3", 1500.0);
//        Account<Double> account4 = new Account<>("acc-4", 2500.0);
//
//        Transaction<Account<Double>> transaction1 = new Transaction<>("2", account4, account3, 5000);
//        bank.executeTransaction(transaction1);

        Logger logger = Logger.getLogger(com.sun.tools.javac.Main.class.getName());

        // homework-8-file-IO-steam
//        LogAnalyzer analyzer = new LogAnalyzer("src/files/logFile.txt");
//        try {
//            List<String> allErrors = analyzer.getAllErrors();
//            for (String errs: allErrors) {
//                logger.log(Level.INFO, errs);
//            }
//
//            System.out.println("With date errors");
//            List<String> errorsByDate = analyzer.getErrorsByDate("2024-05-31");
//            for (String errsByDate: errorsByDate) {
//                logger.log(Level.SEVERE, errsByDate);
//            }
//
//            analyzer.writeErrorStatisticsToFile("src/files/output.txt");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // contacts-app-implementation :)
//        ContactsList contactsList = new ContactsList();
//        contactsList.loadContactsFromFile("src/files/contacts.txt");
//        contactsList.addContact("Rin Evans");
//        contactsList.deleteContact("JhnD Doe");
//        contactsList.deleteContact("Jane Smith");
//        contactsList.editContact("Rin Evans", "Rin Smith");
//        contactsList.saveContactsToFile("/contacts_updated.txt");
//        contactsList.showContacts();

        // homework-9-threads
//        BankAccount bA = new BankAccount(1000);
//
//        Runnable depositTask = () -> {
//            for (int i = 0; i < 5; i++) {
//                bA.deposit(100);
//            }
//        };
//
//        Runnable withdrawTask = () -> {
//            for (int i = 0; i < 3; i++) {
//                bA.withdraw(500);
//            }
//        };
//
//        Thread t1 = new Thread(depositTask);
//        Thread t2 = new Thread(withdrawTask);
//
//        t1.start();
//        t2.start();
//
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        logger.log(Level.INFO, "Final Balance: " + bA.getBalance());
//
//        // second task
//        ProducerConsumerSample pc = new ProducerConsumerSample();
//
//        // Creating multiple producer and consumer threads
//        for (int i = 0; i < 2; i++) {
//            new Thread(pc.producer).start();
//        }
//
//        for (int i = 0; i < 3; i++) {
//            new Thread(pc.consumer).start();
//        }
        // homework-10-lambda
        StringOperation<String> stringOperation = x -> x.toUpperCase();
        String upperResult = stringOperation.operate("tabulation");
        logger.log(Level.INFO, "The result of string operation is " + upperResult);

        MathOperation<Integer> mathOperation = (x, y) -> x + y;
        int result = mathOperation.operate(10, 20);
        logger.log(Level.INFO, "The result of math operation is " + result);

        String cast = "olympiad";
        PredicateOperation<Boolean, String> predicateOperation = x -> {
            if (x.length() < 5) {
                return true;
            }
            return false;
        };

        logger.log(Level.INFO, "The result of predicate operation is " + predicateOperation.operate(cast));

        // Stream API
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Chicken", 45.0));
        products.add(new Product(2, "Pizza", 55.0));
        products.add(new Product(3, "Steak", 60.0));
        products.add(new Product(4, "Cheese", 40.0));

        // Filter products with price more than 50 dollars
        List<Product> expensiveProducts = products.stream()
                .filter(p -> p.getPrice() > 50)
                .collect(Collectors.toList());

        expensiveProducts.forEach(s-> System.out.println("Expensive products (more than 50 dollars):" + s.getName() + " $" + s.getPrice()));

        // Filter products by name
        List<Product> filteredByName = products.stream()
                .filter(p -> p.getName().contains("A"))
                .collect(Collectors.toList());

        filteredByName.forEach(s -> System.out.println("Filtered by name: " + s.getName()));

        // Filter products by price range
        List<Product> priceRangeProducts = products.stream()
                .filter(p -> p.getPrice() >= 40 && p.getPrice() <= 50)
                .collect(Collectors.toList());

        priceRangeProducts.forEach(s -> System.out.println("Products in price range from 40 to 50: " + s.getName() + " $" + s.getPrice()));

        // Sort by price increase
        List<Product> sortedByPriceIncrease = products.stream()
                .sorted((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
                .collect(Collectors.toList());

        logger.log(Level.INFO, "sortedByPriceIncrease");
        sortedByPriceIncrease.forEach(s -> System.out.println("Sorted products list (increase): " + s.getName() + " $" + s.getPrice()));

        // Sort by price decrease
        List<Product> sortedByPriceDecrease = products.stream()
                .sorted((p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()))
                .collect(Collectors.toList());

        logger.log(Level.INFO, "sortedByPriceDecrease");
        sortedByPriceDecrease.forEach(s -> System.out.println("Sorted products list (decrease): " + s.getName() + " $" + s.getPrice()));

        // Sort by name alphabetically
        List<Product> sortedByName = products.stream()
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .collect(Collectors.toList());

        logger.log(Level.INFO, "sortedByName");
        sortedByName.forEach(s -> System.out.println("Sort by name: " + s.getName()));

        // Parallel stream for filtering and sorting
        List<Product> expensiveProductsParallel = products.parallelStream()
                .filter(p -> p.getPrice() > 50)
                .collect(Collectors.toList());

        logger.log(Level.INFO, "expensiveProductsParallel");
        expensiveProductsParallel.forEach(s -> System.out.println("Parallel: " + s.getName()));


        List<Product> sortedByPriceIncreaseParallel = products.parallelStream()
                .sorted((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
                .collect(Collectors.toList());

        logger.log(Level.INFO, "sortedByPriceIncreaseParallel");
        sortedByPriceIncreaseParallel.forEach(s -> System.out.println("Parallel: " + s.getName()));


        // Annotations
        logger.log(Level.INFO, "Annotations");
        try {
            TestCustomAnnotations testCustomAnnotations = new TestCustomAnnotations();
            testCustomAnnotations.validate();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}