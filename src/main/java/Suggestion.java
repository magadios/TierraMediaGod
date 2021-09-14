
import jdk.jfr.Percentage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Suggestion {

  private static final int ATTRACTION_NAME = 0;
  private static final int ATTRACTION_COST = 1;
  private static final int TYPE_OF_ATTRACTION = 2;
  private static final int AVERAGE_TIME = 3;
  private static final int QUOTA_OF_PEOPLE = 4;
  List<Attraction> attractions = new LinkedList<>();
  List<Promotion> promotions = new LinkedList<>();

  public List<Promotion> getPromotions(String file){
    List<Promotion> promo = new ArrayList<>();

    promo.add(new Promotion("Pack Uno",35,new PercentageDiscount()));

    return promo;
  }

  public List<Attraction> getAttractions(String file) {
    Scanner sc = null;

    try {
      sc = new Scanner(new File(file));

      while (sc.hasNext()) {
        String line = sc.nextLine();
        String[] data = line.split(" ");
        String attractionName = null;
        int attractionCost = 0;
        String typeOfAttraction = null;
        int averageTime = 0;
        int quotaOfPeople = 0;


        attractionName = data[ATTRACTION_NAME];
        typeOfAttraction = data[TYPE_OF_ATTRACTION];

        try {
          attractionCost = Integer.parseInt(data[ATTRACTION_COST]);
        } catch (NumberFormatException e) {
          System.err.println("El costo de la atraccion debe ser un numero entero.");
        }

        try {
          averageTime = Integer.parseInt(data[AVERAGE_TIME]);
        } catch (NumberFormatException e) {
          System.err.println("El tiempo promedio de la atraccion debe ser un numero entero.");
        }

        try {
          quotaOfPeople = Integer.parseInt(data[QUOTA_OF_PEOPLE]);
        } catch (NumberFormatException e) {
          System.err.println("El cupo de la atraccion debe ser un numero entero.");
        }

        Attraction attraction = new Attraction(attractionName, attractionCost, typeOfAttraction, averageTime, quotaOfPeople);

        if (!attractions.contains(attraction)) {
          attractions.add(attraction);
        }
      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }


    if (sc != null) {
      sc.close();
    }

    return attractions;
  }



  public void setAttractions(List<Attraction> attractions) {
  }

  public void setPromotions(List<Promotion> promotions) {
  }
}
