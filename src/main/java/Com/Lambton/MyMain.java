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


    }

}
