import java.util.ArrayList;
/**
 * @author Anton, Christian, Kylie, Jack
 */

public class Job {
    private String location;
    private Double pay;
    private boolean remote;
    private String date;
    private String description;
    private ArrayList<String> desiredSkills;
    private ArrayList<String> alumniEmployees;

    public Job(String location, Double pay, Boolean remote, String date, String description) {
        this.location = location;
        this.pay = pay;
        this.remote = remote;
        this.date = date;
        this.description = description;
    }
    public void showListings() {
        
    }
    private void filterListings() {
        
    }
}
