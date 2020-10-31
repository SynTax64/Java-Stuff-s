package S13_JavaFX.ToDoListApp;

import S13_JavaFX.ToDoListApp.datamodel.ToDoItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<ToDoItem> toDoItems;

    public void initialize() {
        ToDoItem item1 = new ToDoItem("Mail birthday card", "Buy a 31th birthday card for Jozica", LocalDate.of(2020, 3, 12));
        ToDoItem item2 = new ToDoItem("Mail birthday card", "Buy a 59th birthday card for Dusica", LocalDate.of(2021, 6, 17));
        ToDoItem item3 = new ToDoItem("Mail birthday card", "Buy a 3th birthday card for Nika", LocalDate.of(2020, 12, 15));
        ToDoItem item4 = new ToDoItem("Mail birthday card", "Buy a 13th birthday card for Eva", LocalDate.of(2021, 8, 4));

        toDoItems = new ArrayList<ToDoItem>();
        toDoItems.add(item1);
        toDoItems.add(item2);
        toDoItems.add(item3);
        toDoItems.add(item4);
    }

}
