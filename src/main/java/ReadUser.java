import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadUser {
        protected static List<User> listUser= new ArrayList<>();

        protected static void ReadUser() {
            try (FileReader fr = new FileReader("resources/usuario.txt");BufferedReader br = new BufferedReader(fr);)
            {
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] profile = linea.split(",");
                    User usuario = new User (profile[0], profile[1], Integer.parseInt(profile[2]), Double.parseDouble(profile[3]));
                    listUser.add(usuario);
                    linea = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        protected static List<User> getListUser() {
            return listUser;
        }
}

