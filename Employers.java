import java.util.ArrayList;
import java.util.UUID;
/**
 * @author Anton, Christian, Kylie, Jack
 */
/**
 * Creating and Intializing ArrayList of type Employer
 */
public class Employers {
    private static Employers employers = null;
    private static ArrayList<Employer> employerList = new ArrayList<>();
    /**
     * Calling the dataLoader to fill employerList with employee information
     */
    private Employers() {
        employerList = DataLoader.getEmployers();
    }
    /**
     * checking to see if there are employers if not a new one is created
     * @return
     */
    public static Employers getInstance() {
        if (employers == null) {
            employers = new Employers();
        }
        return employers;
    }
    public static ArrayList<Employer> getEmployers() {
        return employerList;
    }
    /**
     * Adding a Employer to the ArrayList of Employees with specific paramifications
     * @param id
     * @param email
     * @param username
     * @param password
     * @param companyName
     * @param description
     */
    public static void addEmployer(UUID id, String email, String username, String password, String companyName, String description) {
        employerList.add(new Employer(id,email,username,password,companyName,description));
    }
    /**
     * writing all employer information to the JSON in datawriter
     */
    public void logout() {
        DataWriter.saveEmployer();
    }
    public boolean haveEmployer(String userName) {
        for(Employer employer: employerList ) {
            if(employer.getUsername().equals(userName)) {
                return true;
            }
        }
        return false;
    }
    public Employer getEmployer(String userName) {
        for(Employer employer : employerList ) {
            if(employer.getUsername().equals(userName)) {
                return employer;
            }
        }
        return null;
    }
    
}