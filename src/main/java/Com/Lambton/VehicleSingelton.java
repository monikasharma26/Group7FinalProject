package Com.Lambton;

import java.util.ArrayList;

public class VehicleSingelton {

    private static VehicleSingelton ourInstance;
    private ArrayList<VehicleRent> vehicleRentArrayList= null;
    private double totalBill;

    public static VehicleSingelton getInstance() {
        if (ourInstance==null)
            ourInstance = new VehicleSingelton();

        return ourInstance;
    }

    private VehicleSingelton() {
        vehicleRentArrayList= new ArrayList<>();
    }

    public ArrayList<VehicleRent> getArray() {
        return this.vehicleRentArrayList;
    }
    //Add element to array
   

}

