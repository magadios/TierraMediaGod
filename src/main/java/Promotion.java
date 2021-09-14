public class Promotion {
  private String name;
  private double discount;
  private DiscountService discountService;

  public Promotion(String name, double discount, DiscountService discountService) {
    this.name = name;
    this.discount = discount;
    this.discountService = discountService;
  }
}
