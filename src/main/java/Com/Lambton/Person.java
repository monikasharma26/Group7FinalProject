package Com.Lambton;

import java.time.LocalDate;

public abstract class Person implements  IDisplay{

    public int id,age;
    public String firstName,lastName,mobileNumber,emailId,userName;
    public VehicleManagement.GENDER gender;
    LocalDate birthDate;
    public String password;
    String providedPassword;
    String mySecurePassword;
    String salt;
    public String prefixDetails;
    String str;
    public Person(int id, int age, String firstName, String lastName,
                  String mobileNumber, String emailId, String userName, VehicleManagement.GENDER gender,
                  LocalDate birthDate, String password) {
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
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public VehicleManagement.GENDER getGender() {
        return gender;
    }
    public void setLastName(String lName) {
        this.lastName= lName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private int getAge() {
        LocalDate today = LocalDate.now();
        this.age = today.getYear() - birthDate.getYear();
        return age;
    }
    public void display() {
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Gender: " + getGender());
        System.out.println("Birth Date: " + getBirthDate());
        System.out.println("Email: " + getEmailId());
        System.out.println("Mobile Number: " + getMobileNumber());
        System.out.println("Age: " + getAge() + " years");
        System.out.println("User name: " + getUserName());
      //  System.out.println("Password: " + getPassword());
      //  System.out.println("Original password: " +getOriginalPassword());
    }
}













