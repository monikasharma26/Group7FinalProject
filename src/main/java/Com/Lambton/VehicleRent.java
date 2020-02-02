package Com.Lambton;

import java.time.LocalDate;

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
}
