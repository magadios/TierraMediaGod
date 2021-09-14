import java.util.ArrayList;
import java.util.List;

public class UserProfile {

  private String favoriteAttraction;
  private int budget;
  private int availableTime;
  private Suggestion suggestion;


  public UserProfile() {
    this.suggestion = new Suggestion();
    suggestion.setAttractions(suggestion.getAttractions("C/atra"));
    suggestion.setPromotions(suggestion.getPromotions("C/asdf"));
  }

  public String getFavoriteAttraction() {
    return favoriteAttraction;
  }

  public void setFavoriteAttraction(String favoriteAttraction) {
    this.favoriteAttraction = favoriteAttraction;
  }

  public int getBudget() {
    return budget;
  }

  public void setBudget(int budget) {
    this.budget = budget;
  }

  public int getAvailableTime() {
    return availableTime;
  }

  public void setAvailableTime(int availableTime) {
    this.availableTime = availableTime;
  }

  public Suggestion getSuggestion() {
    return suggestion;
  }

  public void setSuggestion(Suggestion suggestion) {
    this.suggestion = suggestion;
  }
}
