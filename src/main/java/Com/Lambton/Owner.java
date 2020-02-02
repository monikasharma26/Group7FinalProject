package Com.Lambton;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Owner extends Person {

    String companyTitle;
    String officeNumber;
    String website;
    int count;
    int vehicleId;
    String valueFromMap = null;
    HashMap<Integer, HashMap<String,String>>ownedVehicle=new HashMap<>();

    public Owner(int id, int age, String firstName, String lastName, String mobileNumber, String emailId, String userName, VehicleManagement.GENDER gender, LocalDate birthDate, String password,
                 String companyTitle, String officeNumber, String website, int count) {
        super(id,firstName, lastName, mobileNumber, emailId, userName, gender, birthDate, password);
        this.companyTitle = companyTitle;
        this.officeNumber = officeNumber;
        this.website = website;
        this.count = count;
    }
}
