import java.util.ArrayList;

public class dataloaderTEST {

    public static void main(String[] args) {
        ArrayList<Job> jobs = DataLoader.getJobListings();

        for(Job job : jobs) {
            System.out.println(job);
        }

    }
    
}
