package Com.Lambton;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class VehicleRent implements IDisplay {

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
    
    public void display() {
        System.out.println("Rent Start Date: " + getRentStartDate());
        System.out.println("Rent End Date: " + getRentEndDate());
        System.out.println("Rented No. of days: " + getRentedDays());
        System.out.println("Vehicle: " + getVehicleName());
        System.out.println("Vehicle Type: " + getVehicleType());
        System.out.println("No. of Km. drived: " + getNoOfKmDrived()+"km");
        System.out.println("Total bill to pay: $" + getTotalFare());
    }


}
