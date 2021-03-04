package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Button closeButton;

    @FXML
    private Button addButton;

    @FXML
    private TextField userInput;

    @FXML
    private ListView<String> fruitList;

    @FXML
    private Button clearButton;

    @FXML
    private void clearList(){
        fruitList.getItems().clear();
    }

    @FXML
    private void addItem(){
        if(userInput != null){
            fruitList.getItems().add(userInput.getText());
            userInput.clear();
        }
    }

    @FXML
    private void closeWindow(){
//        Platform.exit();
        closeButton.getScene().getWindow().hide();

    }
}
