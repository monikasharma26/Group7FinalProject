package Com.Lambton;

import java.util.Date;

public class Driver extends Person implements IDisplay {

    long licenceNumber;
    boolean isDrivingHistoryCleared;
    Double salary;

    public Driver(int id, String firstName, String lastName, VehicleManagement.GENDER gender, Date birthDate, String mobileNumber,
                  String emailId, String userName, String password,
                  long licenceNumber, boolean isDrivingHistoryCleared, double salary) {
        super(id, firstName, lastName, gender, birthDate, mobileNumber, emailId, userName, password);
        this.licenceNumber = licenceNumber;
        this.isDrivingHistoryCleared = isDrivingHistoryCleared;
        this.salary = salary;
    }

    public long getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(long licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public String isDrivingHistoryCleared() {
        String status;
        if (isDrivingHistoryCleared == true) {
            status = "Clear";
        } else {
            status = "Unclear";
        }
        return status;
    }

    public void setDrivingHistoryCleared(boolean drivingHistoryCleared) {
        isDrivingHistoryCleared = drivingHistoryCleared;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void display() {
        System.out.println("Id: " + prefixPlacing());
        super.display();
        System.out.println("Licence Number: " + getLicenceNumber());
        System.out.println("Driving History: " + isDrivingHistoryCleared());
        System.out.println("Salary: $" + getSalary());
        System.out.println();

    }

    public String prefixPlacing() {
        str = new String(String.valueOf(prefix.DRI) + "_");
        str = str.concat(String.valueOf(id));
        return str;
    }

}


