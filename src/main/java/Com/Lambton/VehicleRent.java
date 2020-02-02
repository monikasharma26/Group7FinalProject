package Com.Lambton;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class VehicleRent {

    LocalDate rentStartDate;
    LocalDate rentEndDate;
    long rentedDays;
    long vehicleId;
    String vehicleName;
    VehicleManagement.VEHICLETYPE vehicleType;
    float noOfKmDrived;
    float totalFare;
    public VehicleRent(LocalDate rentStartDate, LocalDate rentEndDate, VehicleManagement.VEHICLETYPE vehicleType,long vehicleId, float noOfKmDrived) {
        this.rentStartDate = rentStartDate;
        this.rentEndDate = rentEndDate;
        this.vehicleType=vehicleType;
        this.vehicleId = vehicleId;
        this.noOfKmDrived = noOfKmDrived;
    }
    public String getVehicleName() {
        if (Vehicle.vehicleList.containsKey(String.valueOf(vehicleId))) {
//            System.out.println("if block");
            vehicleName = Vehicle.vehicleList.get(String.valueOf(vehicleId));
        } else {
//            System.out.println("else block");
            vehicleName = "Invalid Vehicle Entry";
        }
        return vehicleName;
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
}
