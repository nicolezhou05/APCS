// Team: Non-Disclosure Agreement (Corina Chen, Jing Yi Feng, Nicole Zhou)
// APCS
// LAB08: America's Next Top Data Scientist
// 2022-04-05

/*
 * Arrays of objects
 */

import core.data.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Welcome03_List {
   public static void main(String[] args) {
      DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/index.xml").load();
      ArrayList<WeatherStation> allstns = ds.fetchList("WeatherStation", "station/station_name",
             "station/station_id", "station/state",
             "station/latitude", "station/longitude");
      System.out.println("Total stations: " + allstns.size());

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a state abbreviation: ");
      String state = sc.next();
      System.out.println("Stations in " + state);
      for (WeatherStation ws : allstns) {
         if (ws.isLocatedInState(state)) {
            System.out.println("  " + ws.getId() + ": " + ws.getName());
         }
      }

      // station that is furthest south out of all the states, not in a specific state
      WeatherStation southest = allstns.get(0);
      for (WeatherStation ws : allstns){
        if (ws.getLat() < southest.getLat()){
          southest = ws;
        }
      }
      System.out.println("The weather station that is furthest south is " + southest.getId() + " with latitude " + southest.getLat());
   }
}
