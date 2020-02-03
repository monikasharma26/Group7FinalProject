package Com.Lambton;

import java.time.LocalDate;

public abstract class Person implements IDisplay{

    public int id;
    private int age;
    private String firstName,lastName,mobileNumber,emailId,userName;
    private VehicleManagement.GENDER gender;
    private LocalDate birthDate;
    private String password;
    private String providedPassword;
    private String mySecurePassword;
    private String salt;
    public String prefixDetails;
    public String str;
    private String fullName;
    private Vehicle vehicle;
   // abstract Double calcEarnings();
    public Person(int id, String firstName, String lastName,
                  String mobileNumber, String emailId, String userName, VehicleManagement.GENDER gender,
                  LocalDate birthDate, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.userName = userName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.password = password;
    }

    public Person(int id, String firstName, String lastName, String mobileNumber, String emailId, String userName,
                  VehicleManagement.GENDER gender, LocalDate birthDate, String password, Vehicle vehicle) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.userName = userName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.password = password;
        this.providedPassword = providedPassword;
        this.vehicle = vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
    public int getId() {
        return id;
    }

    public String getFullName()
    {
        fullName=getFirstName().concat(getLastName());
        return fullName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String fName) {
        if (firstName == null || firstName.equalsIgnoreCase("")) {
            this.firstName = "No Name";
        } else {
            this.firstName = fName;
        }

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
        if (lastName == null || firstName.equalsIgnoreCase("")) {
            this.lastName = "No Name";
        } else {
            this.lastName = lName;
        }

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

    public int getAge() {
        LocalDate today = LocalDate.now();
        this.age = today.getYear() - birthDate.getYear();
        return age;
    }
    public String getPassword() {
        providedPassword = password;
        salt = PasswordUtils.getSalt(30);
        mySecurePassword = PasswordUtils.generateSecurePassword(providedPassword, salt);
        return mySecurePassword;
    }

    public String getOriginalPassword(){
        getPassword();
        VerifyProvidedPassword(providedPassword,mySecurePassword,salt);
        return password;
    }

    //Interface Implementation
    public String display() {
        System.out.println("Full Name: " + getFirstName().concat(getLastName()) + "");
     //   System.out.println("Last Name: " + getLastName());
        System.out.println("Gender: " + getGender() +"");
        System.out.println("Year of Birth: " + getAge() +"");
        System.out.println("Email: " + getEmailId()+"");
        System.out.println("Mobile Number: " + getMobileNumber()+"");
     //   System.out.println("Age: " + getAge() + " years");
        System.out.println("User name: " + getUserName()+"");
       // System.out.println("Password: " + getPassword());
      System.out.println("Original password: " +getOriginalPassword() +"");
      return toString();
    }
    private static void VerifyProvidedPassword(String providedPassword,String securePassword,String salt)
    {
        boolean passwordMatch = PasswordUtils.verifyUserPassword(providedPassword, securePassword, salt);
        if(passwordMatch)
        {
            passwordMatch=true;
          //  System.out.println("Provided User password " + providedPassword + " is correct.");
        } else {
           // System.out.println("Provided password is incorrect");
            passwordMatch=false;
        }
    }
}













