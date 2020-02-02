package Com.Lambton;

import java.util.ArrayList;

public class VehicleSingelton {
    private static VehicleSingelton ourInstance;
    private ArrayList<Customer> vehicleRentArrayList= null;
    private ArrayList<VehicleRent> vehicleArrayList= null;

    private double totalBill;

    public static VehicleSingelton getInstance() {
        if (ourInstance==null)
            ourInstance = new VehicleSingelton();

        return ourInstance;
    }

    private VehicleSingelton() {

        vehicleRentArrayList= new ArrayList<>();
        vehicleArrayList=new ArrayList<>();
    }

    public ArrayList<Customer> getArray() {
        return this.vehicleRentArrayList;
    }

    //Add element to array
    public ArrayList<VehicleRent> getVehicleArrayList() {
        return vehicleArrayList;
    }

    public void addToArray(Customer vehicleRent) {
        vehicleRentArrayList.add(vehicleRent);
    }

    public void addToRentArray(VehicleRent vehicleRent) {
        vehicleArrayList.add(vehicleRent);
    }

    public double getTotalBill() {
        return totalBill;
    }


    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }


}

