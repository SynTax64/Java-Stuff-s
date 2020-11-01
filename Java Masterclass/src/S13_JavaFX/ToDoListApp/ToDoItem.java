package S13_JavaFX.ToDoListApp;

import java.time.LocalDate;

public class ToDoItem {
    private String shortDescription;
    private String description;
    private LocalDate deadLine;

    public ToDoItem(String shortDescription, String description, LocalDate deadLine) {
        this.shortDescription = shortDescription;
        this.description = description;
        this.deadLine = deadLine;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

    @Override
    public String toString() {
        return shortDescription;
    }
}
