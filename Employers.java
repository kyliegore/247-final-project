import java.util.ArrayList;
import java.util.UUID;
public class Employers {
    private static Employers employers = null;
    private static ArrayList<Employer> employerList = new ArrayList<>();

    private Employers() {
        employerList = DataLoader.getEmployers();
    }
    public static Employers getInstance() {
        if (employers == null) {
            employers = new Employers();
        }
        return employers;
    }
    public ArrayList<Employer> getStudent() {
        return employerList;
    }
    public void addEmployer(UUID id, String email, String username, String password, String companyName, String description) {
        employerList.add(new Employer(id,username,password,email,companyName,description));
    }
    public void logout() {
        DataWriter.saveEmployer();
    }
    
}