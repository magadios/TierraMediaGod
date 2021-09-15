public class AbsoluteDiscount implements DiscountService {
     @Override
    public String toString() {
        return "Promo Absoluta [tipo =" + typeOfAttraction + ", monto =" + discount + ", atraccion 1=" + attractionName1
                + ", atraccion 2=" + attractionName2 + "]";
    }
    protected String typeOfAttraction;
    protected double discount;
    protected Attraction attractionName1;
    protected Attraction attractionName2;

    public AbsoluteDiscount(String typeOfAttraction, Attraction attractionName1, Attraction attractionName2, double discount) {
        super();
        this.typeOfAttraction = typeOfAttraction;
        this.attractionName1 = attractionName1;
        this.attractionName2 = attractionName2;
        this.discount = discount;
    }

    public String getPromotion() {
        return attractionName1.getAttractionName() + " + " + attractionName2.getAttractionName() +" por "+ discount + " monedas!";
    }

    public String getTypeOfAttraction() {
        return typeOfAttraction;
    }

    protected double calculateCost() {
        return discount;
    }

    @Override
    public double getDiscount() {
        return 0;
    }
}
