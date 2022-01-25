package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sample.DBHandler;
import sample.Driver;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class EditController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField address;

    @FXML
    private TextField address_life;

    @FXML
    private Button buttonOK;

    @FXML
    private TextField company;

    @FXML
    private TextField description;

    @FXML
    private Button editButton;

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
    void onButtonOK() throws SQLException, ClassNotFoundException {
        DBHandler dbHandler = new DBHandler();
        Driver driver = new Driver();
        driver.setId(Integer.parseInt(id.getText()));
        if (!id.getText().equals("")) {
            ResultSet resultSet = dbHandler.getDriverById(driver);

            setAllDisable(false);
        } else {
            //вывод сообщения
            setAllDisable(true);
        }

    }

    @FXML
    void onEditButtonn() throws IOException {

        Stage stage = (Stage) editButton.getScene().getWindow();
        stage.close();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/fxml/driver_bd.fxml"));
        Parent root = loader.load();
        stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(new Scene(root, 600, 412));
        stage.setTitle("даные о водителях");
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void initialize() {

    }

    @FXML
    public void onClickAuth() throws IOException {


    }

    public void enter(javafx.event.ActionEvent actionEvent) {

    }

    private void setAllDisable(Boolean value) {
        id.setDisable(value);
        name.setDisable(value);
        middlename.setDisable(value);
        company.setDisable(value);
        jobname.setDisable(value);
        passport_number.setDisable(value);
        passport_serial.setDisable(value);
        address.setDisable(value);
        address_life.setDisable(value);
        phone.setDisable(value);
        postcode.setDisable(value);
        email.setDisable(value);
    }
}

