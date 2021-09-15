public class PercentageDiscount implements DiscountService {
  protected String typeOfAttraction;
  protected int discount;
  protected int atattractionCost;
  protected Attraction attractionName1;
  protected Attraction attractionName2;

  public PercentageDiscount() {
    super();
    this.discount = discount;
    this.typeOfAttraction = typeOfAttraction;
    this.attractionName1=attractionName1;
    this.attractionName2=attractionName2;
  }

  public String getPromo() {
    return attractionName1.getAttractionName() + " + " + attractionName2.getAttractionName() +" por "+ discount + " monedas!";
  }

  public String getTypeOfAttraction() {
    return typeOfAttraction;
  }

  protected double calculateCost() {
   atattractionCost = Math.round((attractionName1.getAttractionCost()+ attractionName2.getAttractionCost()) * (100 - discount)/100);
    return atattractionCost;
  }

  public String toString() {
    return "Promo descuento %  [tipo = " + typeOfAttraction + ", descuento= " + discount + " Porciento , coste final =" + atattractionCost
            + attractionName1.getAttractionCost() + " + " + attractionName2.getAttractionCost() + "]";
  }

  public double getDiscount() {
    return 0;
  }
}
