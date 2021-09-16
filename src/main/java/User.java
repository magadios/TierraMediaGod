import java.io.*;

public class User {
  private String userName;
  private UserProfile profile;

  public User(String name, String userName, int i, double v) {
    this.userName = userName;
    this.profile = new UserProfile();
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public UserProfile getProfile() {
    return profile;
  }

  public void setProfile(UserProfile profile) {
    this.profile = profile;
  }


}
