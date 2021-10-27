
import java.util.ArrayList;
import java.util.UUID;

public class Admins {
    private static Admins admins = null;
    private static ArrayList<Admin> adminList = new ArrayList<>();

    private Admins() {
        adminList = DataLoader.getAdmin();
    }
    public static Admins getInstance() {
        if (admins == null) {
            admins = new Admins();
        }
        return admins;
    }
    public ArrayList<Admin> getAdmin() {
        return adminList;
    }
    public void addAdmin(UUID id, String email, String username, String password, String firstName, String lastName) {
        adminList.add(new Admin(id,username,password,email,firstName,lastName));
    }
    public void logout() {
        DataWriter.saveAdmin();
    }
    
}