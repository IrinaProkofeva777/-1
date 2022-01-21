package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthorizationController {

    @FXML
    private TextField login;

    @FXML
    private TextField password;

    @FXML
    private Button signInButton;


   public static final String login_field = "login";

    int totalAttempts= 3;
    private void executeLogin() {
        DatabaseHandler databaseHandler = new DatabaseHandler();
        User user = new User();
        user.setLogin(login);
        user.setPassword(password);
        String userNameStr = login.getText();
        String passWordStr = password.getText();

        if (totalAttempts != 0) {
            if (userNameStr == "login_field" && passWordStr == "login_field") {
                System.out.println("Правильный!");
            } else {
                System.out.println("Неправильный");
                totalAttempts--;
            }
        }
    }

            @FXML
            public void onClickAuth () throws IOException {
                executeLogin();
                Stage stage = (Stage) signInButton.getScene().getWindow();
                stage.close();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/driver.fxml"));
                Parent root = loader.load();
                stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.setScene(new Scene(root, 600, 443));
                stage.setTitle("Добавление нового водителя");
                stage.setResizable(false);
                stage.show();
            }
        }
