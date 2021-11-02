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

    public Job(String location, Double pay, boolean remote, String date, String description) {
        this.location = location;
        this.pay = pay;
        this.remote = remote;
        this.date = date;
        this.description = description;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public Double getPay() {
        return pay;
    }
    public void setPay(Double pay) {
        this.pay = pay;
    }
    public boolean getRemote() {
        return remote;
    }
    public void setRemote(boolean remote) {
        this.remote = remote;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String toString() {
        String isRemote = "";
        if(this.remote) {
            isRemote+="Yes";
        }
        else if(!this.remote) {
            isRemote+="No";
        }
        return "Job: " + this.description + "\n" + "Location: " + this.location + "\n" + "Pay: $" + this.pay + "\n"
        + "Remote: " + isRemote + "\n" + "Date: " + this.date + "\n";
    }
    public void showListings() {
        
    }
    private void filterListings() {
        
    }
}
