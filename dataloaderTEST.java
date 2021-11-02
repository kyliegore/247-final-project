import java.util.ArrayList;

public class dataloaderTEST {

    public static void main(String[] args) {
        ArrayList<Admin> admins = DataLoader.getAdmin();

        for(Admin admin : admins) {
            System.out.println(admin);
        }

    }
    
}
