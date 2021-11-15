import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

//Tested by Christian Rios
class JobListingTest {
    public static void setup() {
        //runs before each test
    }

    public static void tearDown() {
        //runs after each test
    }

    //assertEquals(val1,val2)
    //assertFalse(val)
    //assertTrue(val)
    //assertSame(val1,val2)
    //assertNotSame(val1,val2)
    //assertNull(val)
    //assertNotNull(val)

    @Test
    public void testAddingJobListing() {
        String location = "Columbia";
        Double pay = 10.55;
        boolean remote = false;
        String date = "3/18/2021";
        String description = "Work as a TA for Software Engineering.";
        ArrayList<String> skills = new ArrayList<String>();
        skills.add("Python");
        skills.add("JavaScript");
        JobListing.addJob(location, pay, remote, date, description, skills);
        ArrayList<Job> jobList = JobListing.getJob();
        assertNotNull(jobList);
    }
}
