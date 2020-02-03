package Com.Lambton;

import java.time.LocalDate;

public class Person {

    public int id,age;
    public String firstName,lastName,mobileNumber,emailId,userName;
    public VehicleManagement.GENDER gender;
    LocalDate birthDate;
    public String password;
    String providedPassword;
    String mySecurePassword;
    String salt;
    public String prefixDetails;

    public Person(int id, int age, String firstName, String lastName, String mobileNumber, String emailId, String userName, VehicleManagement.GENDER gender, LocalDate birthDate, String password) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.userName = userName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String fName) {
        this.firstName = fName;
    }
    public String getLastName() {
        return lastName;
    }
    










}
