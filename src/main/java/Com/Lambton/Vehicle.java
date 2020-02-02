package Com.Lambton;

import java.util.HashMap;
import java.util.Map;

public class Vehicle {
    public long vehicleIdentificationNumber;
    private String vehicleDescription;
    private String manufacturerName;
    private boolean isSelfDrive;
    private boolean isInsured;
    public HashMap<Integer,String> driver;
    private int noOfSeat;
    public String prefixDetails;
    private String insuranceProviderName;
    private VehicleManagement.FUEL fuelType;
    private VehicleManagement.VEHICLETYPE vehicleType;
    public int baseRate;
    public int ratePerKm;
    static HashMap<String, String> vehicleList = new HashMap<>();
    public Vehicle(long vehicleIdentificationNumber, String vehicleDescription, String manufacturerName,
                   boolean isSelfDrive, boolean isInsured, int noOfSeat, VehicleManagement.FUEL fuelType) {
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
        this.vehicleDescription = vehicleDescription;
        this.manufacturerName = manufacturerName;
        this.isSelfDrive = isSelfDrive;
        this.isInsured = isInsured;
        this.noOfSeat = noOfSeat;
        this.fuelType = fuelType;
    }
    public VehicleManagement.VEHICLETYPE getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleManagement.VEHICLETYPE vehicleType) {
        this.vehicleType = vehicleType;
    }


    public void setDriver(HashMap<Integer, String> driver) {
        this.driver = driver;
    }

    public long getVehicleIdentificationNumber() {
        return vehicleIdentificationNumber;
    }
    public void setVehicleIdentificationNumber(long vehicleIdentificationNumber) {
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
    }

    public String getVehicleDescription() {
        return vehicleDescription;
    }

    public void setVehicleDescription(String vehicleDescription) {
        this.vehicleDescription = vehicleDescription;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public boolean isSelfDrive() {

        return isSelfDrive;
    }

    public HashMap<Integer, String> getDriver() {
        return driver;
    }

    public Boolean setSelfDrive(boolean selfDrive) {
        isSelfDrive = selfDrive;
    }

    public static HashMap<String, String> getVehicleList() {
        System.out.println("Vehicle List: ");
        for (Map.Entry<String, String> entry : vehicleList.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        return null;
    }
    public boolean setSelfDrive(boolean selfDrive) {
        isSelfDrive = selfDrive;
    }



    public boolean isInsured() {
        return isInsured;
    }

    public void setInsured(boolean insured) {
        isInsured = insured;
    }

    public String getInsuranceNameProvider() {
        return insuranceProviderName;
    }

    public void setInsuranceNameProvider(String insuranceNameProvider) {
        this.insuranceProviderName = insuranceNameProvider;
    }

    public int getNoOfSeat() {
        return noOfSeat;
    }

    public void setNoOfSeat(int noOfSeat) {
        this.noOfSeat = noOfSeat;
    }

    public VehicleManagement.FUEL getFuelType() {
        return fuelType;
    }

    public void setFuelType(VehicleManagement.FUEL fuelType) {
        this.fuelType = fuelType;
    }

    public int getBaseRate() {
        switch (vehicleType) {
            case CAR:
                baseRate = 100;
                break;
            case MOTORCYCLE:
                baseRate = 50;
                break;
            case BUS:
                baseRate = 250;
                break;
            default:
                baseRate = 0;
        }
        return baseRate;
    }

    public int getRatePerKm() {
        switch (vehicleType) {
            case CAR:
                ratePerKm = 5;
                break;
            case MOTORCYCLE:
                ratePerKm = 1;
                break;
            case BUS:
                ratePerKm = 7;
                break;
            default:
                ratePerKm = 0;
                break;
        }
        return ratePerKm;
    }
}