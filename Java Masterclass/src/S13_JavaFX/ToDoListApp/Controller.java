package S13_JavaFX.ToDoListApp;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<ToDoItem> toDoItems;
    @FXML
    private ListView<ToDoItem> toDoListView;
    @FXML
    private TextArea itemDetailsTextArea;

    @FXML
    private Label deadLineLabel;

    public void initialize() {
        ToDoItem item1 = new ToDoItem("Mail birthday card Jozica", "Buy a 31th birthday card for Jozica", LocalDate.of(2020, 3, 12));
        ToDoItem item2 = new ToDoItem("Mail birthday card Dusica", "Buy a 59th birthday card for Dusica", LocalDate.of(2021, 6, 17));
        ToDoItem item3 = new ToDoItem("Mail birthday card Nika", "Buy a 3th birthday card for Nika", LocalDate.of(2020, 12, 15));
        ToDoItem item4 = new ToDoItem("Mail birthday card Eva", "Buy a 13th birthday card for Eva", LocalDate.of(2021, 8, 4));

        toDoItems = new ArrayList<ToDoItem>();
        toDoItems.add(item1);
        toDoItems.add(item2);
        toDoItems.add(item3);
        toDoItems.add(item4);
        toDoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<ToDoItem>() {
            @Override
            public void changed(ObservableValue<? extends ToDoItem> observableValue, ToDoItem oldValue, ToDoItem newValue) {
                if (newValue != null) {
                    ToDoItem item = toDoListView.getSelectionModel().getSelectedItem();
                    itemDetailsTextArea.setText(item.getDetails());
                }
            }
        });

        toDoListView.getItems().setAll(toDoItems);
        toDoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        toDoListView.getSelectionModel().selectFirst();
    }

    @FXML
    public void handleClickListView() {
        ToDoItem item = toDoListView.getSelectionModel().getSelectedItem();
//        System.out.println("Selected item is: " + item);
        itemDetailsTextArea.setText(item.getDetails());
        deadLineLabel.setText(item.getDeadLine().toString());
        StringBuilder sb = new StringBuilder(item.getDescription());
//        sb.append("\n\n\n\n");
//        sb.append("Due: ");
//        sb.append(item.getDeadLine().toString());
        itemDetailsTextArea.setText(sb.toString());
    }

}
