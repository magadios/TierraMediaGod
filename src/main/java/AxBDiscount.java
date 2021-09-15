public  class AxBDiscount implements DiscountService {
    @Override

    public String toString() {
        return "Promo AxB [Tipo promoción = " + typeOfAttraction + ", Costo = " + discount + ", atraccion N°1: "
                + attractionName1.getAttractionName() + ", atraccion N° 2: " + attractionName2.getAttractionName() + ", esta atraccion la llevas de regalo: " + attractionName3.getAttractionName() + "]";
    }
    protected String typeOfAttraction;
    protected int discount;
    protected Attraction attractionName1;
    protected Attraction attractionName2;
    protected Attraction attractionName3;

    public AxBDiscount(String typeOfAttraction, Attraction attractionName1, Attraction attractionName2, Attraction attractionName3) {
        super();
        this.typeOfAttraction = typeOfAttraction;
        this.attractionName1 = attractionName1;
        this.attractionName2 = attractionName2;
        this.attractionName3 = attractionName3;
    }


    public String getPromotion() {

        return attractionName1.getAttractionName() + " + " + attractionName2.getAttractionName() + " por " + discount + " monedas y " + attractionName3.getAttractionName() + " es gratis!";
    }


    public String getTypeOfAttraction() {
        return typeOfAttraction;
    }


    protected double calculateCost() {
        this.discount = this.attractionName1.getAttractionCost() + this.attractionName2.getAttractionCost();
        return this.discount;
    }

    @Override
    public double getDiscount() {
        return 0;
    }

    // Falta hacer una comprobacion para ver si el usuario podria permitirse la promo o no ?
}
