//package S13_JavaFX.ToDoListApp;
//
//import S13_JavaFX.ToDoListApp.datamodel.ToDoData;
//import javafx.beans.value.ChangeListener;
//import javafx.beans.value.ObservableValue;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.control.*;
//import javafx.scene.layout.BorderPane;
//
//import java.io.IOException;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//public class Controller {
//
//    private List<ToDoItem> toDoItems;
//    @FXML
//    private ListView<ToDoItem> toDoListView;
//    @FXML
//    private TextArea itemDetailsTextArea;
//    @FXML
//    private Label deadLineLabel;
//    @FXML
//    private BorderPane mainBorderPane;
//
//    public void initialize() {
////        ToDoItem item1 = new ToDoItem("Mail birthday card Jozica", "Buy a 31th birthday card for Jozica", LocalDate.of(2020, 3, 12));
////        ToDoItem item2 = new ToDoItem("Mail birthday card Dusica", "Buy a 59th birthday card for Dusica", LocalDate.of(2021, 6, 17));
////        ToDoItem item3 = new ToDoItem("Mail birthday card Nika", "Buy a 3th birthday card for Nika", LocalDate.of(2020, 12, 15));
////        ToDoItem item4 = new ToDoItem("Mail birthday card Eva", "Buy a 13th birthday card for Eva", LocalDate.of(2021, 8, 4));
//
////        toDoItems = new ArrayList<ToDoItem>();
////        toDoItems.add(item1);
////        toDoItems.add(item2);
////        toDoItems.add(item3);
////        toDoItems.add(item4);
////        ToDoData.getInstance().setTodoItems(toDoItems);
//
//        toDoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<ToDoItem>() {
//            @Override
//            public void changed(ObservableValue<? extends ToDoItem> observableValue, ToDoItem oldValue, ToDoItem newValue) {
//                if (newValue != null) {
//                    ToDoItem item = toDoListView.getSelectionModel().getSelectedItem();
//                    itemDetailsTextArea.setText(item.getDetails());
//                    DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM d, yyyy");
//                    deadLineLabel.setText(df.format(item.getDeadLine()));
//                }
//            }
//        });
//
//        toDoListView.getItems().setAll((ToDoItem) ToDoData.getInstance().getTodoItems());
//        toDoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
//        toDoListView.getSelectionModel().selectFirst();
//    }
//
//    @FXML
//    public void handleClickListView() {
//        ToDoItem item = toDoListView.getSelectionModel().getSelectedItem();
////        System.out.println("Selected item is: " + item);
//        itemDetailsTextArea.setText(item.getDetails());
//        deadLineLabel.setText(item.getDeadLine().toString());
//        StringBuilder sb = new StringBuilder(item.getDescription());
////        sb.append("\n\n\n\n");
////        sb.append("Due: ");
////        sb.append(item.getDeadLine().toString());
//        itemDetailsTextArea.setText(sb.toString());
//    }
//
//    public void showNewItemDialog() {
//        Dialog<ButtonType> dialog = new Dialog<>();
//        dialog.initOwner(mainBorderPane.getScene().getWindow());
//
//        try {
//            Parent root = FXMLLoader.load(getClass().getResource("todoItemDialog.fxml"));
//            dialog.getDialogPane().setContent(root);
//        } catch (IOException e) {
//            System.out.println("Couldn't load the dialog");
//            e.printStackTrace();
//            return;
//        }
//
//        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
//        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
//
//        Optional<ButtonType> result = dialog.showAndWait();
//        if (result.isPresent() && result.get() == ButtonType.OK) {
//            System.out.println("OK pressed");
//        } else {
//            System.out.println("Cancel pressed");
//        }
//    }
//
//}
