/**
 * @author Anton, Christian, Kylie, Jack
 */
import java.util.ArrayList;
public class JobListing {
    private static JobListing joblistings = null;
    private static ArrayList<Job> jobList = new ArrayList<>();
    private JobListing() {
        jobList = DataLoader.getJobListings();
    }
    public static JobListing getInstance() {
        if (joblistings == null) {
            joblistings = new JobListing();
        }
        return joblistings;
    }
    public ArrayList<Job> getJob() {
        return jobList;
    }
    public void addJob(String location, Double pay, Boolean remote, String date, String description, ArrayList<String> skills) {
        jobList.add(new Job(location, pay, remote, date, description, skills));
    }
    public void logout() {
        DataWriter.saveJobListing();
    }
    public void getApplicants() {
        
    }
    public void showListings() {
        ArrayList<Job> jobs = DataLoader.getJobListings();

        for(Job job : jobs) {
            
            System.out.println(job);
        }
    }
}