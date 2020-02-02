package Com.Lambton;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.xml.crypto.Data;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

public class MyMain
{
    public static void main(String[] args)
    {
        //JSON parser object to parse read file
       /* JSONParser jsonParser = new JSONParser();
        JSONObject json;
        try
        {
            FileReader reader = new FileReader("customer.json");
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
      private static void readCustomerData(JSONObject jsonObject)
      {

      }*/
        Customer c1 = new Customer(10,"Monika ", "Sharma","8766631257","test@gmail.com",
                "test",VehicleManagement.GENDER.Female, LocalDate.of(1993,8,12),"test123",
                "Brampton","Ont");
        c1.display();

        Customer c2 = new Customer(10, "Monika ", "Sharma", "8766631257", "test@gmail.com",
                "test", VehicleManagement.GENDER.Female, LocalDate.of(1993, 8, 12), "test123",
                "Brampton", "Ont",new Car("G1WL52M1W1104808","HondacIty",
                "Honda",true,false,5,VehicleManagement.FUEL.Petrol,
                VehicleManagement.CarType.Sedan,"RED"));
        Customer c3 = new Customer(11, "Anmol", "Singh","8766631257", "test@gmail.com",
                "test", VehicleManagement.GENDER.Female, LocalDate.of(1993, 8, 12), "test123",
                "Brampton", "Ont",new Bus("G1WL52M1W1104808","MiniBus",
                "Honda",true,false,23, VehicleManagement.FUEL.Diesel,
                VehicleManagement.BusType.MiniBus,
                true,false));

       Customer c4 = new Customer(12, "Anmol", "Singh","8766631257", "test@gmail.com",
                "test", VehicleManagement.GENDER.Female, LocalDate.of(1993, 8, 12), "test123",
                "Brampton", "Ont",new Motorcycle("G1WL52M1W110334","MotoroCycle",
                "Honda",false,false,2,VehicleManagement.FUEL.Electric,34.5,
                15.6));

       VehicleRent v1=new VehicleRent(11546, LocalDate.of(2020, 01, 15),
               LocalDate.of(2020, 01, 25), VehicleManagement.VEHICLETYPE.CAR,
               "JHMZF1C67BS073397", 55.18f);

        VehicleSingelton.getInstance().addToArray(c2);
        VehicleSingelton.getInstance().addToArray(c3);
       VehicleSingelton.getInstance().addToArray(c4);

        for (Customer e: VehicleSingelton.getInstance().getArray()) {
            System.out.println(e);
            System.out.println("-----------------------------------------------------------------------------------");
           // totalEarnings=totalEarnings+e.calcEarnings();
        }
        //c2.printMyData();


    }

}
