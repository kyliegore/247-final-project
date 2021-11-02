import java.util.ArrayList;

public class dataloaderTEST {

    public static void main(String[] args) {
        ArrayList<Job> jobs = DataLoader.getJobListings();
        int counter = 1;
        for(Job job : jobs) {
            System.out.println("Listing #" + counter);
            System.out.println(job);
            counter++;
        }

    }
    
}
