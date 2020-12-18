//package S13_JavaFX.UIThread;
//
//import javafx.application.Platform;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.scene.control.Button;
//import javafx.scene.control.CheckBox;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//
//public class Controller {
//    @FXML
//    private TextField nameField;
//    @FXML
//    private Button helloButton;
//    @FXML
//    private Button byeButton;
//    @FXML
//    private CheckBox clearField;
//    @FXML
//    private Label ourLabel;
//
//    public void initialize() {
//        helloButton.setDisable(true);
//        byeButton.setDisable(true);
//    }
//
//    @FXML
//    public void onButtonClicked(ActionEvent e) {
//        /*System.out.println("Hello " + nameField.getText());
//        System.out.println("The following button was pressed" + e.getSource());*/
//
//        if (e.getSource().equals(helloButton)) {
//            System.out.println("Hello, " + nameField.getText());
//        } else if (e.getSource().equals(byeButton)) {
//            System.out.println("Bye, " + nameField.getText());
//        }
//
//        Runnable task = new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(10000);
//                    Platform.runLater(new Runnable() {
//                        @Override
//                        public void run() {
//                            ourLabel.setText("We did something");
//                        }
//                    });
//                } catch (InterruptedException event) {
////                    event.printStackTrace();
//                }
//            }
//        };
//
//        new Thread(task).start();
//
//        /*try {
//            Thread.sleep(10000);
//        } catch (InterruptedException event) {
//            event.printStackTrace();
//        }*/
//        if (clearField.isSelected()) {
//            nameField.clear();
//            helloButton.setDisable(true);
//            byeButton.setDisable(true);
//        }
//    }
//
//    public void handleKeyReleased() {
//        String text = nameField.getText();
//        boolean disableButtons = text.isEmpty() || text.trim().isEmpty();
//        helloButton.setDisable(disableButtons);
//        byeButton.setDisable(disableButtons);
//    }
//
//    public void handleChange() {
//        System.out.println("The checkbox is " + (clearField.isSelected() ? "checked" : "not checked"));
//    }
//}
