class Task {

    private int id;
    private String title;
    private LocalDateTime deadline;

    public Task(int id, String title, LocalDateTime deadline) {
        this.id = id;
        this.title = title;
        this.deadline = deadline;
    }

    public int getId() {
        return id;
    }

    public void setId(int id1) {
        this.id = id1;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public void displayInfo() {
        System.out.println("Task id: " + this.id +
                "title='" + this.title + '\'' +
                ", deadline=" + this.deadline +
                '}';);
    }

    public static void main(String[] args) {
        Task task = new Task("Complete assignment", LocalDateTime.of(2022, 12, 31, 23, 59));
        System.out.println(task);
    }
}