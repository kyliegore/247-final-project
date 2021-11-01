import java.util.ArrayList;
/**
 * @author Anton, Christian, Kylie, Jack
 */

public abstract class User { //at the moment we have no abstract methods
    private int userID;
    private String userType;
    private String email;
    private String password;
    private ArrayList<Job> jobListings;

    public boolean verifyLogin() {
        return true;
    }
    public void registerUser() {
        
    }
}