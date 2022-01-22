package sample;

public class Driver {
    private int id;
    private String name;
    private String middlename;
    private String passport_serial;
    private String passport_number;
    private int postcode;
    private String address;
    private String address_life;
    private String company;
    private String jobname;
    private String phone;
    private String email;
    private String photo;
    private String description;

    public Driver() {
    }

    public Driver(int id, String name, String middlename, String passport_serial,
                  String passport_number, int postcode, String address, String address_life,
                  String company, String jobname, String phone, String email, String photo, String description) {
        this.id = id;
        this.name = name;
        this.middlename = middlename;
        this.passport_serial = passport_serial;
        this.passport_number = passport_number;
        this.postcode = postcode;
        this.address = address;
        this.address_life = address_life;
        this.company = company;
        this.jobname = jobname;
        this.phone = phone;
        this.email = email;
        this.photo = photo;
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public void setPassport_serial(String passport_serial) {
        this.passport_serial = passport_serial;
    }

    public void setPassport_number(String passport_number) {
        this.passport_number = passport_number;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAddress_life(String address_life) {
        this.address_life = address_life;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getPassport_serial() {
        return passport_serial;
    }

    public String getPassport_number() {
        return passport_number;
    }

    public int getPostcode() {
        return postcode;
    }

    public String getAddress() {
        return address;
    }

    public String getAddress_life() {
        return address_life;
    }

    public String getCompany() {
        return company;
    }

    public String getJobname() {
        return jobname;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoto() {
        return photo;
    }

    public String getDescription() {
        return description;
    }
}
