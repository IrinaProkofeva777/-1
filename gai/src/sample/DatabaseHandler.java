package sample;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;


public class DatabaseHandler extends Config {
    Connection dbConnection;

    public Connection getDbConnection(String dbName) throws ClassNotFoundException, SQLException {
        String conectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName + "?useUnicode=true&serverTimezone=UTC&useSSL=true&verifyServerCertificate=false";
        Class.forName("com.mysql.cj.jdbc.Driver");
        dbConnection = DriverManager.getConnection(conectionString, dbUser, dbPass);
        return dbConnection;
    }

    public void authorizationDriver(String name, String middlename, String passport_serial, String passport_number, String postcode, String address, String address_life, String company,
                                    String jobname, String phone, String email, String photo, String description) {
        String insert = "INSERT INTO " + Const.GAI_TABLE + "(" + Const.name + ", " + Const.middlename + ", " + Const.passport_serial + ", " + Const.passport_number + ", " + Const.postcode + ", " +
                Const.address + ", " + Const.address_life + Const.company + ", " + Const.jobname + "," + Const.phone + ", " + Const.email + ", " + Const.photo + ", " + Const.description + ", " + ") " +
                "VALUES(?, ?, ?)";

        try {
            PreparedStatement prSt = getDbConnection(dbName).prepareStatement(insert);

            prSt.setString(1, name);
            prSt.setString(2, middlename);
            prSt.setString(3, passport_serial);
            prSt.setString(4, passport_number);
            prSt.setString(5, postcode);
            prSt.setString(6, address);
            prSt.setString(7, address_life);
            prSt.setString(8, company);
            prSt.setString(9, jobname);
            prSt.setString(10, phone);
            prSt.setString(11, email);
            prSt.setString(12, photo);
            prSt.setString(13, description);

            prSt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void authorizationUser(int id, String login, String password) throws SQLException, ClassNotFoundException {

        String insert = "INSERT INTO " + Const.PERSONS_TABLE + "(" + Const.PERSONS_LOGIN + ", " +
                Const.PERSONS_PASSWORD + ") " +
                "VALUES(?, ?)";

        try {
            PreparedStatement prSt = getDbConnection(dbNamePersons).prepareStatement(insert);
            prSt.setString(1, String.valueOf(id));
            prSt.setString(2, login);
            prSt.setString(3, password);

            prSt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}