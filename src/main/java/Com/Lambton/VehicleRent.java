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
}
