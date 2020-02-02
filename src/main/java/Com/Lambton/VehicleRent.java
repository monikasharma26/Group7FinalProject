package Com.Lambton;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class VehicleRent extends Vehicle{

    LocalDate rentStartDate;
    LocalDate rentEndDate;
    long rentedDays;
    String vehicleId;
    String vehicleName;
    VehicleManagement.VEHICLETYPE vehicleType;
    float noOfKmDrived;
    float totalFare;
    int customerId;
    String customerName;
    public VehicleRent(String vehicleIdentificationNumber, String vehicleDescription, String manufacturerName, boolean isSelfDrive, boolean isInsured, int noOfSeat, VehicleManagement.FUEL fuelType, LocalDate rentStartDate, LocalDate rentEndDate, long rentedDays, String vehicleId, String vehicleName,
                       VehicleManagement.VEHICLETYPE vehicleType, float noOfKmDrived, float totalFare, int customerId, String customerName) {
        super(vehicleIdentificationNumber, vehicleDescription, manufacturerName, isSelfDrive, isInsured, noOfSeat, fuelType);
        this.rentStartDate = rentStartDate;
        this.rentEndDate = rentEndDate;
        this.rentedDays = rentedDays;
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.vehicleType = vehicleType;
        this.noOfKmDrived = noOfKmDrived;

    }

    public String getVehicleName() {
        if (Vehicle.vehicleList.containsKey(vehicleId)) {
            vehicleName = Vehicle.vehicleList.get(String.valueOf(vehicleId));
        } else {
            vehicleName = "Invalid Vehicle Entry";
        }
        return vehicleName;
    }
    public String getCustomerName(){
        if (Customer.customerList.containsKey(String.valueOf(customerId))) {
            customerName = Customer.customerList.get(String.valueOf(customerId));
        } else {
            customerName = "Invalid Entry";
        }
        return customerName;
    }
    public VehicleManagement.VEHICLETYPE getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(VehicleManagement.VEHICLETYPE vehicleType) {
        this.vehicleType = vehicleType;
    }
    public LocalDate getRentStartDate() {
        return rentStartDate;
    }
    public void setRentStartDate(LocalDate rentStartDate) {
        this.rentStartDate = rentStartDate;
    }
    public LocalDate getRentEndDate() {
        return rentEndDate;
    }
    public void setRentEndDate(LocalDate rentEndDate) {
        this.rentEndDate = rentEndDate;
    }
    public long getRentedDays() {
        rentedDays = getRentStartDate().until(getRentEndDate(), ChronoUnit.DAYS);
        return rentedDays;
    }
    public float getNoOfKmDrived() {
        return noOfKmDrived;
    }
    public void setNoOfKmDrived(float noOfKmDrived) {
        this.noOfKmDrived = noOfKmDrived;
    }
    public float getTotalFare() {
        switch (vehicleType) {
            case CAR: {
                totalFare = 100 * getRentedDays() + (getNoOfKmDrived() * 5);
                break;
            }
            case MOTORCYCLE: {
                totalFare = 50 * getRentedDays() + (getNoOfKmDrived() * 1);
                break;
            }
            case BUS: {
                totalFare = 250 * getRentedDays() + (getNoOfKmDrived() * 7);
                break;
            }
            default:
                totalFare = 0;
                break;
        }
        return totalFare;
    }
/*    public void setTotalFare(float totalFare) {
        this.totalFare = totalFare;
    }*/

    @Override
    public String display() {


        System.out.println("Rent Start Date: " + getRentStartDate());
        System.out.println("Rent End Date: " + getRentEndDate());
        System.out.println("Rented No. of days: " + getRentedDays());
        System.out.println("Vehicle: " + getVehicleName());
        System.out.println("Vehicle Type: " + getVehicleType());
        System.out.println("No. of Km. drived: " + getNoOfKmDrived() + "km");
        System.out.println("Total bill to pay: $" + getTotalFare());

        return toString();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Rent Start Date: ").append(getRentStartDate()).append("\n")
                .append("Rent End Date: ").append(getRentEndDate()).append("\n")
                .append("-Vehicle Name: ").append(getVehicleName()).append("\n")
                .append("-Vehicle Type: ").append(getVehicleType()).append("\n")
                .append("No. of Km. drived: ").append(getNoOfKmDrived() + "km").append("\n")
                .append("Total bill to pay: $" ).append(getTotalFare());
        return String.valueOf(stringBuilder);
    }


}
