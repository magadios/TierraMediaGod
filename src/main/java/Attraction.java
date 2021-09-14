public class Attraction {

  private String attractionName;
  private int attractionCost;
  private String typeOfAttraction;
  private int averageTime;
  private int quotaOfPeople;

  public Attraction(String attractionName, int attractionCost, String typeOfAttraction, int averageTime, int quotaOfPeople) {
    this.attractionName = attractionName;
    setAttractionCost(attractionCost);
    this.typeOfAttraction = typeOfAttraction;
    setAverageTime(averageTime);
    setQuotaOfPeople(quotaOfPeople);
  }

  public String getAttractionName() {
    return attractionName;
  }

  public void setAttractionName(String attractionName) {
    this.attractionName = attractionName;
  }

  public int getAttractionCost() {
    return attractionCost;
  }

  public void setAttractionCost(int attractionCost) {
    if (!(attractionCost < 0)) {
      this.attractionCost = attractionCost;
    }
  }

  public String getTypeOfAttraction() {
    return typeOfAttraction;
  }

  public void setTypeOfAttraction(String typeOfAttraction) {
    this.typeOfAttraction = typeOfAttraction;
  }

  public int getAverageTime() {
    return averageTime;
  }

  public void setAverageTime(int averageTime) {
    if (!(averageTime <= 0)) {
      this.averageTime = averageTime;
    }
  }

  public int getQuotaOfPeople() {
    return quotaOfPeople;
  }

  public void setQuotaOfPeople(int quotaOfPeople) {
    if (!(quotaOfPeople < 1)) {
      this.quotaOfPeople = quotaOfPeople;
    }
  }
}
