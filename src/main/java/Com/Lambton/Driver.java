package Com.Lambton;

import java.time.LocalDate;
import java.util.Date;

public class Driver extends Person  {

    long licenceNumber;
    boolean isDrivingHistoryCleared;
    Double salary;

    public Driver(int id, String firstName, String lastName, String mobileNumber, String emailId, String userName, VehicleManagement.GENDER gender,
                  LocalDate birthDate, String password, long licenceNumber, boolean isDrivingHistoryCleared, Double salary) {
        super(id, firstName, lastName, mobileNumber, emailId, userName, gender, birthDate, password);
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
        if (salary<0){
            this.salary=0.0;
        }else {
            this.salary = salary;
        }
    }

    @Override
    public String  display() {
        System.out.println("Id: " + prefixPlacing());
        super.display();
        System.out.println("Licence Number: " + getLicenceNumber());
        System.out.println("Driving History: " + isDrivingHistoryCleared());
        System.out.println("Salary: $" + getSalary());
        System.out.println();
    return toString();
    }

    public String prefixPlacing() {
        str = new String(String.valueOf(VehicleManagement.PERSONPREFIX.DR) + "_");
        str = str.concat(String.valueOf(id));
        return str;
    }

}


