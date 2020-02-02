package Com.Lambton;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class VehicleRent {

    LocalDate rentStartDate;
    LocalDate rentEndDate;
    long rentedDays;
    String vehicleId;
    String vehicleName;
    VehicleManagement.VEHICLETYPE vehicleType;
    float noOfKmDrived;
    float totalFare;
   static int customerId;
    static String customerName;
    Vehicle vehicle;
    public VehicleRent(int customerId,LocalDate rentStartDate, LocalDate rentEndDate, VehicleManagement.VEHICLETYPE vehicleType, String vehicleId, float noOfKmDrived) {
        this.customerId=customerId;
        this.rentStartDate = rentStartDate;
        this.rentEndDate = rentEndDate;
        this.vehicleType = vehicleType;
        this.vehicleId = vehicleId;
        this.noOfKmDrived = noOfKmDrived;
        getCustomerName();
    }

    public VehicleRent(int customerId,LocalDate rentStartDate, LocalDate rentEndDate,
                       VehicleManagement.VEHICLETYPE vehicleType,String vehicleId, float noOfKmDrived,
                        Vehicle vehicle) {
        getCustomerName();
        getVehicleName();
        this.rentStartDate = rentStartDate;
        this.rentEndDate = rentEndDate;
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
        this.noOfKmDrived = noOfKmDrived;
        this.customerId = customerId;
        this.vehicle = vehicle;
    }

    public String getVehicleName() {
        if (Vehicle.vehicleList.containsKey(vehicleId)) {
            vehicleName = Vehicle.vehicleList.get(String.valueOf(vehicleId));
        } else {
            vehicleName = "Invalid Vehicle Entry";
        }
        return vehicleName;
    }
    public static String getCustomerName(){
        if (Customer.customerList.containsKey(String.valueOf(customerId))) {
            customerName = Customer.customerList.get(String.valueOf(customerId));
        } else {
            customerName = "Invalid Entry";
        }
        return customerName;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
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

    public String display() {

        StringBuilder stringBuilder = new StringBuilder();
        return String.valueOf(stringBuilder);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Rent Start Date: ").append(getRentStartDate()).append("\n")
                .append("Rent End Date: ").append(getRentEndDate()).append("\n")
                .append("Customer Name: ").append(getCustomerName()).append("\n")
                .append("No. of Km. drived: ").append(getNoOfKmDrived() + "km").append("\n")
                .append("Total bill to pay: $" ).append(getTotalFare());
        return String.valueOf(stringBuilder);
    }


}
