import java.util.ArrayList;

public abstract class User { //at the moment we have no abstract methods
    private int userID;
    private String userType;
    private String email;
    private String password;
    private ArrayList<JobListings> jobListings;

    public boolean verifyLogin() {
        return true;
    }
    public void registerUser() {
        
    }
}