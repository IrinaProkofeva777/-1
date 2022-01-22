package sample.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.Const;
import sample.DBHandler;
import sample.Driver;

import java.sql.SQLException;

public class DriverDBController {

    private ObservableList<Driver> DriverData = FXCollections.observableArrayList();

    @FXML
    private TableView<Driver> driverTable;

    @FXML
    private TableColumn<Driver, String> addressColumn;

    @FXML
    private TableColumn<Driver, String> address_lifeColumn;

    @FXML
    private TableColumn<Driver, String> companyColumn;

    @FXML
    private TableColumn<Driver, String> descriptionColumn;

    @FXML
    private TableColumn<Driver, String> emailColumn;

    @FXML
    private TableColumn<Driver, String> phoneColumn;

    @FXML
    private TableColumn<Driver, Integer> idColumn;

    @FXML
    private TableColumn<Driver, String> jobnameColumn;

    @FXML
    private TableColumn<Driver, String> middlenameColumn;

    @FXML
    private TableColumn<Driver, String> nameColumn;

    @FXML
    private TableColumn<Driver, String> passport_numberColumn;

    @FXML
    private TableColumn<Driver, String> passport_serialColumn;

    @FXML
    private TableColumn<Driver, String> photoColumn;

    @FXML
    private TableColumn<Driver, Integer> postcodeColumn;

    @FXML
    private void initialize() throws SQLException, ClassNotFoundException {
        // устанавливаем тип и значение которое должно хранится в колонке
        idColumn.setCellValueFactory(new PropertyValueFactory<>(Const.id));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>(Const.name));
        middlenameColumn.setCellValueFactory(new PropertyValueFactory<>(Const.middlename));
        passport_serialColumn.setCellValueFactory(new PropertyValueFactory<>(Const.passport_serial));
        passport_numberColumn.setCellValueFactory(new PropertyValueFactory<>(Const.passport_number));
        postcodeColumn.setCellValueFactory(new PropertyValueFactory<>(Const.postcode));
        addressColumn.setCellValueFactory(new PropertyValueFactory<>(Const.address));
        address_lifeColumn.setCellValueFactory(new PropertyValueFactory<>(Const.address_life));
        companyColumn.setCellValueFactory(new PropertyValueFactory<>(Const.company));
        jobnameColumn.setCellValueFactory(new PropertyValueFactory<>(Const.jobname));
        phoneColumn.setCellValueFactory(new PropertyValueFactory<>(Const.phone));
        emailColumn.setCellValueFactory(new PropertyValueFactory<>(Const.email));
        photoColumn.setCellValueFactory(new PropertyValueFactory<>(Const.photo));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>(Const.description));

        initData();
    }

    private void initData() throws SQLException, ClassNotFoundException {
        DBHandler dbHandler = new DBHandler();
        DriverData = dbHandler.getDriver();
        driverTable.setItems(DriverData);
    }

}
