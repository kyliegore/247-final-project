/**
 * @author Anton, Christian, Kylie, Jack
 */
import java.util.ArrayList;
/**
 * Creating a JobListings ArrayList or type Job
 */
public class JobListing {
    private static JobListing joblistings = null;
    private static ArrayList<Job> jobList = new ArrayList<>();
    private JobListing() {
        jobList = DataLoader.getJobListings();
    }
    /**
     * Checking if jobListing already exists and if not creating a new instance of a
     * JobListing
     */
    public static JobListing getInstance() {
        if (joblistings == null) {
            joblistings = new JobListing();
        }
        return joblistings;
    }
    public static ArrayList<Job> getJob() {
        return jobList;
    }
    /**
     * Adding a job with specific paramifications to the list of Jobs
     * @param location
     * @param pay
     * @param remote
     * @param date
     * @param description
     * @param skills
     */
    public static void addJob(String location, Double pay, Boolean remote, String date, String description, ArrayList<String> skills) {
        jobList.add(new Job(location, pay, remote, date, description, skills));
    }
    /**
     * Writing data to datawriter and logging out
     */
    public void logout() {
        DataWriter.saveJobListing();
    }
    public void getApplicants() {
        
    }
    /**
     * As we Did in DataLoaderTest we print out all jobListings in the JSON when this method is called
     */
    public void showListings() {
        ArrayList<Job> jobs = DataLoader.getJobListings();

        for(Job job : jobs) {
            
            System.out.println(job);
        }
    }
}