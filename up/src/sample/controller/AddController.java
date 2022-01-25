package sample.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AddController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField address;

    @FXML
    private TextField address_life;

    @FXML
    private TextField company;

    @FXML
    private TextField description;

    @FXML
    private TextField email;

    @FXML
    private TextField id;

    @FXML
    private TextField jobname;

    @FXML
    private TextField middlename;

    @FXML
    private TextField name;

    @FXML
    private TextField passport_number;

    @FXML
    private TextField passport_serial;

    @FXML
    private TextField phone;

    @FXML
    private TextField postcode;


    @FXML
    private Button addDriver;

    @FXML
    void onAddDriver() {

    }

    void onClickAddDriver() throws IOException {

        Stage stage = (Stage) addDriver.getScene().getWindow();
        stage.close();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/add.fxml"));
        Parent root = loader.load();
        stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(new Scene(root, 600, 412));
        stage.setTitle("Добавление нового водителя");
        stage.setResizable(false);
        stage.show();
    }
}
