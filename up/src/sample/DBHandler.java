package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;


public class DBHandler extends Configs {
    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String conectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName + "?useUnicode=true&serverTimezone=UTC&useSSL=true&verifyServerCertificate=false";
        Class.forName("com.mysql.cj.jdbc.Driver");
        dbConnection = DriverManager.getConnection(conectionString, dbUser, dbPass);
        return dbConnection;
    }


    public ObservableList<Driver> getDriver() throws SQLException, ClassNotFoundException {
        String select = "SELECT * FROM " + Const.TABLE;
        ObservableList<Driver> drivers = FXCollections.observableArrayList();
        PreparedStatement prSt = getDbConnection().prepareStatement(select);
        ResultSet set = prSt.executeQuery();

        while (set.next()) {
            Driver driver = new Driver();
            driver.setId(set.getInt(Const.id));
            driver.setName(set.getString(Const.name));
            driver.setMiddlename(set.getString(Const.middlename));
            driver.setPassport_serial(set.getString(Const.passport_serial));
            driver.setPassport_number(set.getString(Const.passport_number));
            driver.setPostcode(set.getInt(Const.postcode));
            driver.setAddress(set.getString(Const.address));
            driver.setAddress_life(set.getString(Const.address_life));
            driver.setCompany(set.getString(Const.company));
            driver.setJobname(set.getString(Const.jobname));
            driver.setPhone(set.getString(Const.phone));
            driver.setEmail(set.getString(Const.email));
            driver.setPhoto(set.getString(Const.photo));
            driver.setDescription(set.getString(Const.description));
            drivers.add(driver);
        }
        return drivers;
    }

    public ResultSet getDriverById(Driver driver) throws SQLException, ClassNotFoundException {
        ResultSet resSet = null;
        String select = "SELECT * FROM " + Const.TABLE + " WHERE " + Const.id + "=?";

        PreparedStatement prSt = getDbConnection().prepareStatement(select);
        prSt.setInt(1, driver.getId());
        resSet = prSt.executeQuery();

        return resSet;
    }

    public void addDriver(int id, String name, String middlename, String passport_serial, String passport_number,
                          String postcode, String address, String address_life, String company,
                          String jobname, String phone, String email, String photo, String description) {
        ClassNotFoundException {
            String insert = "INSERT INTO " + Const.TABLE + "(" + Const.id + ", " + Const.name + ", " + Const.middlename + ", " + Const.passport_serial + ", " + Const.passport_number + ", " + Const.postcode + ", " +
                    Const.address + ", " + Const.address_life + Const.company + ", " + Const.jobname + "," + Const.phone + ", " + Const.email + ", " + Const.photo + ", " + Const.description + ", " + ") " +
                    "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            ObservableList<Driver> drivers = FXCollections.observableArrayList();
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            ResultSet set = prSt.executeQuery();

            while (set.next()) {
                Driver driver = new Driver();
                driver.setId(set.getInt(Const.id));
                driver.setName(set.getString(Const.name));
                driver.setMiddlename(set.getString(Const.middlename));
                driver.setPassport_serial(set.getString(Const.passport_serial));
                driver.setPassport_number(set.getString(Const.passport_number));
                driver.setPostcode(set.getInt(Const.postcode));
                driver.setAddress(set.getString(Const.address));
                driver.setAddress_life(set.getString(Const.address_life));
                driver.setCompany(set.getString(Const.company));
                driver.setJobname(set.getString(Const.jobname));
                driver.setPhone(set.getString(Const.phone));
                driver.setEmail(set.getString(Const.email));
                driver.setPhoto(set.getString(Const.photo));
                driver.setDescription(set.getString(Const.description));
                driver.executeUpdate();
            }
            return drivers;
        }

        }


    public void authorizationDriver(int id, String name, String middlename, String passport_serial, String passport_number,
                                    String postcode, String address, String address_life, String company,
                                    String jobname, String phone, String email, String photo, String description) {
        String insert = "INSERT INTO " + Const.TABLE + "(" + Const.id + ", " + Const.name + ", " + Const.middlename +
                ", " + Const.passport_serial + ", " + Const.passport_number + ", " + Const.postcode + ", " +
                Const.address + ", " + Const.address_life + Const.company + ", " + Const.jobname + "," + Const.phone +
                ", " + Const.email + ", " + Const.photo + ", " + Const.description + ", " + ") " +
                "VALUES(?, ?, ?)";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, String.valueOf(id));
            prSt.setString(2, name);
            prSt.setString(3, middlename);
            prSt.setString(4, passport_serial);
            prSt.setString(5, passport_number);
            prSt.setString(6, postcode);
            prSt.setString(7, address);
            prSt.setString(8, address_life);
            prSt.setString(9, company);
            prSt.setString(10, jobname);
            prSt.setString(11, phone);
            prSt.setString(12, email);
            prSt.setString(13, photo);
            prSt.setString(14, description);

        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }

    public void editDriver(int id, String name, String middlename, String passport_serial, String passport_number,
                           String postcode, String address, String address_life, String company,
                           String jobname, String phone, String email, String photo, String description) throws SQLException, ClassNotFoundException {
        String update = "UPDATE " + Const.TABLE + " SET " + Const.name + " =? AND  " + Const.middlename + " =? AND  " + Const.passport_serial + " =? AND  " +
                Const.passport_number + " =? AND  " + Const.name + " =? AND  " + Const.name + " =? AND  " + Const.name + " =? AND  " + Const.name + " =? AND  " +
                Const.name + " =? AND  " + Const.name + " =? AND  " + Const.name + " =?";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(update);
            prSt.setString(1, String.valueOf(id));
            prSt.setString(2, name);
            prSt.setString(3, middlename);
            prSt.setString(4, passport_serial);
            prSt.setString(5, passport_number);
            prSt.setString(6, postcode);
            prSt.setString(7, address);
            prSt.setString(8, address_life);
            prSt.setString(9, company);
            prSt.setString(10, jobname);
            prSt.setString(11, phone);
            prSt.setString(12, email);
            prSt.setString(13, photo);
            prSt.setString(14, description);
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }
}
