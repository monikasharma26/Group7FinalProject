package Com.Lambton;

import java.time.LocalDate;
import java.util.Date;

public class Customer extends  Person
{
    String address;
    String city;
    String[] vehicleRent;

    public Customer(int id, String firstName, String lastName, String mobileNumber, String emailId, String userName,
                    VehicleManagement.GENDER gender, LocalDate birthDate, String password, String address, String city) {
        super(id, firstName, lastName, mobileNumber, emailId, userName, gender, birthDate, password);
        this.address = address;
        this.city = city;
    }

    public String prefixPlacing() {
        str = new String(String.valueOf(VehicleManagement.PERSONPREFIX.CU) + "_");
        str = str.concat(String.valueOf(id));
        return str;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public void display() {
        System.out.println("Id: " + prefixPlacing());
        super.display();
        System.out.println("Address: " + getAddress());
        System.out.println("City: " + getCity());
        System.out.println();

    }

}
