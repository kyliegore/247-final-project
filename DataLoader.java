import java.io.FileReader;
import java.util.ArrayList;
import java.util.UUID;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
/**
 * @author Anton, Christian, Kylie, Jack
 */

public class DataLoader extends DataConstants {
	/**
     * @return the array list of students being loaded in from JSON file 
     */
	public static ArrayList<Student> getStudents() {
		ArrayList<Student> students = new ArrayList<Student>();
		/**
         * This creates instances of file reader JSONparser and JSONArray 
         * then gets the corresponding values from the JSON file being read in 
         */
		try {
            FileReader reader = new FileReader(STUDENT_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray userJSON = (JSONArray)new JSONParser().parse(reader);

            for(int i = 0; i<userJSON.size(); i++) {
                JSONObject studentJSON = (JSONObject)userJSON.get(i);

                UUID id = UUID.fromString((String)studentJSON.get(USER_ID));
                String username = (String)studentJSON.get(USER_NAME);
                String password = (String)studentJSON.get(PASSWORD);
                String email = (String)studentJSON.get(EMAIL);
                String firstName = (String)studentJSON.get(FIRST_NAME);
                String lastName = (String)studentJSON.get(LAST_NAME);
                Double gpa = (Double)studentJSON.get(GPA);
                String grade = (String)studentJSON.get(GRADE);
                ArrayList<String> skills = (ArrayList<String>)studentJSON.get(SKILLS);
                ArrayList<String> awards = (ArrayList<String>)studentJSON.get(AWARDS);
                ArrayList<String> extracurriculars = (ArrayList<String>)studentJSON.get(EXTRACURRICULARS);
                
                References references = (References) studentJSON.get(REFERENCES);
                WorkExperience experience = (WorkExperience)studentJSON.get(EXPERIENCE);
                
                /**
                 * Creates a new instance of the type of the array list and sets the loaded values to the 
                 * coresponding places in the type
                 */
                students.add(new Student(id, username, password, email, firstName, lastName, gpa, grade, skills, awards, extracurriculars, references, experience));
            }
			
			return students;
		
		} catch(Exception e) {
            System.out.println("Student Database not found!");
			e.printStackTrace();
		}
		
		return null;
	}
    /**
     * @return the array list of employers being loaded in from JSON file 
     * this method does the same as above but loading the employers 
     */
    public static ArrayList<Employer> getEmployers() {
        ArrayList<Employer> employers = new ArrayList<Employer>();

        try {
            FileReader reader = new FileReader(EMPLOYER_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray userJSON = (JSONArray)new JSONParser().parse(reader);

            for(int i = 0; i < userJSON.size(); i++) {
                JSONObject employerJSON = (JSONObject)userJSON.get(i);

                UUID id = UUID.fromString((String)employerJSON.get(USER_ID));
                String email = (String)employerJSON.get(EMAIL);
                String username = (String)employerJSON.get(USER_NAME);
                String password = (String)employerJSON.get(PASSWORD);
                String companyName = (String)employerJSON.get(COMPANY);
                String description = (String)employerJSON.get(COMPANY_DESCRIPTION);

                employers.add(new Employer(id, email, username, password, companyName, description));
            }
            
            return employers;

		} catch (Exception e){
            System.out.println("Employer database could not be found! ");
            e.printStackTrace();
        }
        return null;

    }

    /**
     * @return the array list of admins being loaded in from JSON file 
     * this method does the same as above but loading the admins 
     */
    public static ArrayList<Admin> getAdmin() {
        ArrayList<Admin> admins = new ArrayList<Admin>();

        try {
            FileReader reader = new FileReader(ADMIN_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray userJSON = (JSONArray)new JSONParser().parse(reader);

            for (int i = 0; i < userJSON.size(); i++) {
                JSONObject adminJSON = (JSONObject)userJSON.get(i);

                UUID id = UUID.fromString((String)adminJSON.get(USER_ID));
                String email = (String)adminJSON.get(EMAIL);
                String username = (String)adminJSON.get(USER_NAME);
                String password = (String)adminJSON.get(PASSWORD);
                String firstName = (String)adminJSON.get(FIRST_NAME);
                String lastName = (String)adminJSON.get(LAST_NAME);

                admins.add(new Admin(id, email, username, password, firstName, lastName));
            }

            return admins;

        } catch (Exception e) {
            System.out.println("Admin database could not be found!");
            e.printStackTrace();
        }
        return null;

    }

    /**
     * @return the array list of job listings being loaded in from JSON file 
     * this method does the same as above but loading the job listings  
     */
    public static ArrayList<Job> getJobListings() {
        ArrayList<Job> jobListings= new ArrayList<Job>();

        try {
            FileReader reader = new FileReader(JOB_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray jobJSON = (JSONArray)new JSONParser().parse(reader);

            for (int i = 0; i < jobJSON.size(); i++) {
                JSONObject listingJSON = (JSONObject)jobJSON.get(i);
                
                String location = (String)listingJSON.get(LOCATION);
                Double pay = (Double)listingJSON.get(PAY_RATE);
                boolean remote = (boolean)listingJSON.get(REMOTE_BOOL);
                String date = (String)listingJSON.get(DATE_FEILD);
                String description = (String)listingJSON.get(JOB_DESCRIPTION);

                jobListings.add(new Job(location, pay, remote, date, description));
            }
            return jobListings;

        } catch (Exception e){
            System.out.println("Job database could not be found!");
            e.printStackTrace();
        }
        return null;

    }


}