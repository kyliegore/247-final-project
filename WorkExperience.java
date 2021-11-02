import java.util.ArrayList;
/**
 * @author Anton, Christian, Kylie, Jack
 */

public class WorkExperience {
    private String company;
    private String location;
    private ArrayList<String> jobSkills; 

    public WorkExperience (String company, String location, ArrayList<String> jobSkills) {
        this.company = company;
        this.location = location;
        this.jobSkills = jobSkills;
    }
    public String toString() {
        return "Company: " + company + "\n" + "Location: " + location + "\n" + "Job Skills: " + jobSkills.get(0) + "\n";
    }
}