package Com.Lambton;

import java.time.LocalDate;
import java.util.Date;

public class Customer extends  Person
{
    String address;
    String city;
    String[] vehicleRent;

    public Customer(int id, int age, String firstName, String lastName, String mobileNumber, String emailId, String userName,
                    VehicleManagement.GENDER gender, LocalDate birthDate, String password, String address, String city) {
        super(id, age, firstName, lastName, mobileNumber, emailId, userName, gender, birthDate, password);
        this.address = address;
        this.city = city;
    }
    
}
