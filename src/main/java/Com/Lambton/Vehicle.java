package Com.Lambton;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Vehicle implements IDisplay{
    public static long vehicleIdentificationNumber;
    private String vehicleDescription;
    private String manufacturerName;
    private boolean isSelfDrive;
    private boolean isInsured;
    //public HashMap<Integer,String> driver;
    String Driver;
    private int noOfSeat;
    public String prefixDetails;
    private String insuranceProviderName;
    private VehicleManagement.FUEL fuelType;
    private static VehicleManagement.VEHICLETYPE vehicleType;
    public int baseRate;
    public int ratePerKm;
    static String str;
    static HashMap<String, String> vehicleList = new HashMap<>();
    public Vehicle(long vehicleIdentificationNumber, String vehicleDescription, String manufacturerName,
                   boolean isSelfDrive, boolean isInsured, int noOfSeat, VehicleManagement.FUEL fuelType) {
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
        this.vehicleDescription = vehicleDescription;
        this.manufacturerName = manufacturerName;
        this.isSelfDrive = isSelfDrive;
        if (isSelfDrive == false) {
            System.out.println("Enter Driver's Name: ");
            Scanner inputDriver = new Scanner(System.in);
            String driver = inputDriver.nextLine();
            if (isSelfDrive == false) {
                this.Driver = driver;
            } else {
                this.Driver = null;
            }
            this.isInsured = isInsured;
            if (isInsured == true) {
                System.out.println("Input Insurance Name Provider: ");
                Scanner inputInsuranceProvider = new Scanner(System.in);
                String insuranceNameProvider = inputInsuranceProvider.nextLine();
                this.insuranceProviderName = insuranceNameProvider;
            } else {
                this.insuranceProviderName = null;
            }
            this.isInsured = isInsured;
            this.noOfSeat = noOfSeat;
            this.fuelType = fuelType;
            this.vehicleList.put(String.valueOf(vehicleIdentificationNumber),
                    manufacturerName);
        }
    }
    public VehicleManagement.VEHICLETYPE getVehicleType()
    {
        return vehicleType;
    }

    public void setVehicleType(VehicleManagement.VEHICLETYPE vehicleType) {
        this.vehicleType = vehicleType;
    }

        public String getDriver() {
            return Driver;
        }

        public void setDriver(String driver) {
            Driver = driver;
        }
  /*  public void setDriver(HashMap<Integer, String> driver) {
        this.driver = driver;
    }

    public long getVehicleIdentificationNumber() {
        return vehicleIdentificationNumber;
    }*/
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

   /* public HashMap<Integer, String> getDriver() {
        return driver;
    }
*/
    public Boolean setSelfDrive(boolean selfDrive) {
        isSelfDrive = selfDrive;
        return isSelfDrive;
    }

    public static HashMap<String, String> getVehicleList() {
        System.out.println("Vehicle List: ");
        for (Map.Entry<String, String> entry : vehicleList.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        return null;
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

    public static String prefixer() {
        switch (vehicleType) {
            case CAR: {
                str = new String(String.valueOf(VehicleManagement.VEHICLETYPE.CAR+"_"));
                str = str.concat(String.valueOf(vehicleIdentificationNumber));
                break;
            }
            case MOTORCYCLE: {
                str = new String(String.valueOf(VehicleManagement.VEHICLETYPE.MOTORCYCLE+"_"));
                str = str.concat(String.valueOf(vehicleIdentificationNumber));
                break;
            }
            case BUS: {
                str = new String(String.valueOf(VehicleManagement.VEHICLETYPE.BUS+"_"));
                str = str.concat(String.valueOf(vehicleIdentificationNumber));
                break;
            }
            default:
                str = null;
                break;
        }
        return str;
    }


    public void display()
    {
        System.out.println("Vehicle Identification Number: " + prefixer());
        System.out.println("Vehicle Description: " + getVehicleDescription());
        System.out.println("Manufacturer Name: " + getManufacturerName());
        System.out.println("Self Drive: " + isSelfDrive());
        System.out.println("Driver: " + getDriver());
        System.out.println("Insurance: " + isInsured());
        System.out.println("Insurance Name Provider: " + getInsuranceNameProvider());
        System.out.println("No of Seats: " + getNoOfSeat() + " seats");
        System.out.println("Fuel Type: " + getFuelType());
        System.out.println("Base Rate: " + "$" + getBaseRate());
        System.out.println("Rate per km: " + "$" + getRatePerKm());
    }

}


