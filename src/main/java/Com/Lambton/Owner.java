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
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCompanyTitle() {
        return companyTitle;
    }

    public void setCompanyTitle(String companyTitle) {
        this.companyTitle = companyTitle;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String prefixPlacing() {
        str = new String(String.valueOf(VehicleManagement.PERSONPREFIX.OW) + "_");
        str = str.concat(String.valueOf(id));
        return str;
    }

    @Override
    public void display() {
        System.out.println("Id: " + prefixPlacing());
        super.display();
        System.out.println("Company Title: " + getCompanyTitle());
        System.out.println("Business Landline Number: " + getOfficeNumber());
        System.out.println("Website: " + getWebsite());
        System.out.println();
    }
}
