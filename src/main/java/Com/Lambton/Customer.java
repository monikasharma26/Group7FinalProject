package Com.Lambton;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Customer extends  Person

{
    String address;
    String city;
    String[] vehicleRent;
    public Vehicle vehicle;
    public static HashMap<String,String> customerList= new HashMap<>();

    public Customer(int id, String firstName, String lastName, String mobileNumber, String emailId, String userName,
                    VehicleManagement.GENDER gender, LocalDate birthDate, String password, String address, String city) {
        super(id, firstName, lastName, mobileNumber, emailId, userName, gender, birthDate, password);
        this.address = address;
        this.city = city;
        this.customerList.put(String.valueOf(id),
                firstName);
    }

    public Customer(int id, String firstName, String lastName, String mobileNumber, String emailId, String userName,
                    VehicleManagement.GENDER gender, LocalDate birthDate, String password, String address, String city,Vehicle vehicle) {
        super(id, firstName, lastName, mobileNumber, emailId, userName, gender, birthDate, password,vehicle);
        this.address = address;
        this.city = city;
        this.customerList.put(String.valueOf(id),
                firstName);
        this.vehicle=vehicle;
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

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: ").append(getFullName()).append("\n")
                .append("Year of Birth: ");
        if (getAge() <= 0) {
            stringBuilder.append("Invalid Age").append("\n");
        } else {
            stringBuilder.append(getAge()).append("\n");
        }
        checkTypeOfVehicle(stringBuilder);
        stringBuilder.append("-Person  is a  Customer").append("\n")
                .append("-mobileNumber: ")
                .append(getMobileNumber()).append("\n")
                .append(" -emailId: ")
                .append(getEmailId()).append("\n")
                .append(" -userName ")
                .append(getUserName())
                .append("\n -gender ")
                .append(getGender()).append("\n");
        return String.valueOf(stringBuilder);
    }
    private void checkTypeOfVehicle(StringBuilder stringBuilder) {
        if (vehicle == null) {
            stringBuilder.append("Person has no vehicle Registerd");
        } else if (vehicle instanceof Car) {
            stringBuilder.append("Person has a Car\n")
                    .append(" -Type of Car: ").append(((Car) vehicle).getCarType())
                    .append("\n -Color: ").append(((Car) vehicle).getCarColor()).append("\n");
        } else if (vehicle instanceof Motorcycle) {
            stringBuilder.append("Person has a MotorCycle\n")
                    .append(" -Top Speed:: ").append(((Motorcycle) vehicle).getTopSpeed()+"km/hr").append("\n")
                    .append("\n -Mileage: ").append(((Motorcycle) vehicle).getMilage()+" mpg").append("\n");
        }else if (vehicle instanceof Bus) {
            stringBuilder.append("Person has a Bus\n")
                    .append(" -Bus Type:: ").append(((Bus) vehicle).getTypeOfBus()).append("\n");
                   // .append("\n -Accessibility Service Avavilable: ").append(vehicle..isAccessibilityServiceAvailable())
                   // .append("\n -Wifi Available: ").append(getVehicle().isWifiAvailable()+);
        }
    }
    public static HashMap<String, String> getCustomerList() {
        System.out.println("Customer List: ");
        for (Map.Entry<String, String> entry : customerList.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        return null;
//        return customerList;
    }

    @Override
    public String display() {
        StringBuilder stringBuilder = new StringBuilder();
        return String.valueOf(stringBuilder);
    }

}
