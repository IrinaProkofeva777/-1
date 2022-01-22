package sample.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AuthorizationController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private PasswordField passWord;

    @FXML
    private Button signInButton;

    @FXML
    private TextField userName;

    @FXML
    void initialize() {
    }

    int totalAttempts = 3;

    @FXML
    public void onClickAuth() throws IOException {

        if (totalAttempts != 0) {
            if (userName.getText().equals(login_field) && passWord.getText().equals(login_field)) {

                Stage stage = (Stage) signInButton.getScene().getWindow();
                stage.close();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/driver_bd.fxml"));
                Parent root = loader.load();
                stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.setScene(new Scene(root, 600, 412));
                stage.setTitle("Добавление нового водителя");
                stage.setResizable(false);
                stage.show();

            } else {
                System.out.println("пароль и логин нормальный введи");
                totalAttempts--;
            }
        }

    }

    public static final String login_field = "login";
}




