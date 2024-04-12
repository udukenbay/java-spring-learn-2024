package Homework2;

public class Task {
    private int id;
//    private String title;
//    private LocalDateTime deadline;
//    private String status;

    public Task(int id) { // , String title, LocalDateTime deadline, String status
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id1) {
        this.id = id1;
    }

    public void displayInfo() {
        System.out.println("Task id: " + this.id);
//                + "title='" + this.title + '\'' +
//                ", deadline=" + this.deadline + '\'' +
//                ", status=" + this.status +
//                '}'
    }

    public static void main(String[] args) {
        Task task = new Task(1);
        task.displayInfo();
    }
}
