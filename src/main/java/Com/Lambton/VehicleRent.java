package Com.Lambton;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public  class VehicleRent {

    static LocalDate rentStartDate;
    static LocalDate rentEndDate;
    public static  float TotalAmount;
    static long rentedDays;
    static String vehicleId;
    static String vehicleName;
    static VehicleManagement.VEHICLETYPE vehicleType;
    static float noOfKmDrived;
    static float totalFare;
   static int customerId;
    static String customerName;
    Vehicle vehicle;

    public VehicleRent() {
    }

    public VehicleRent(int customerId, LocalDate rentStartDate, LocalDate rentEndDate, VehicleManagement.VEHICLETYPE vehicleType, String vehicleId, float noOfKmDrived) {
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
            vehicleName = Vehicle.vehicleList.get(String.valueOf(vehicleId));
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
    public static void setVehicleType(VehicleManagement.VEHICLETYPE vehicleType) {
        vehicleType = vehicleType;
    }
    public static LocalDate getRentStartDate() {
        return rentStartDate;
    }
    public static void setRentStartDate(LocalDate rentStartDate) {
        rentStartDate = rentStartDate;
    }
    public static LocalDate getRentEndDate() {
        return rentEndDate;
    }
    public void setRentEndDate(LocalDate rentEndDate) {
        this.rentEndDate = rentEndDate;
    }
    public static long getRentedDays() {
        rentedDays = getRentStartDate().until(getRentEndDate(), ChronoUnit.DAYS);
        return rentedDays;
    }
    public static float getNoOfKmDrived() {
        return noOfKmDrived;
    }
    public void setNoOfKmDrived(float noOfKmDrived) {
        this.noOfKmDrived = noOfKmDrived;
    }
    public static float getTotalFare() {
        switch (vehicleType) {
            case CAR: {
                totalFare = 100 * getRentedDays() + (getNoOfKmDrived() * 5);
                TotalAmount=totalFare;
                break;
            }
            case MOTORCYCLE: {
                totalFare = 50 * getRentedDays() + (getNoOfKmDrived() * 1);
                TotalAmount=totalFare;
                break;
            }
            case BUS: {
                totalFare = 250 * getRentedDays() + (getNoOfKmDrived() * 7);
                TotalAmount=totalFare;
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
public static void TotalAmount(){

}
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
             //   .append("-Vehicle Name: ").append(getVehicleName()).append("\n")
                .append("Vehicle Type: ").append(getVehicleType()).append("\n")
                .append("No. of Km. drived: ").append(getNoOfKmDrived() + "km").append("\n")
                .append("Total bill to pay: $" ).append(getTotalFare());
        return String.valueOf(stringBuilder);
    }


}
