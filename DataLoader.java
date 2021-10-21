import java.io.FileReader;
import java.util.ArrayList;
import java.util.UUID;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;;

public class DataLoader extends DataConstants{
	
	public static ArrayList<Student> getStudents() {
		ArrayList<Student> students = new ArrayList<Student>();
		
		try {
			
			return students;
			
		} catch(Exception e) {
            System.out.println("Student Database not found!");
			e.printStackTrace();
		}
		
		return null;
	}

    public static ArrayList<Employer> getEmployers() {
        ArrayList<Employer> employers = new ArrayList<Employer>();

        try {
            
            return employers;

		} catch (Exception e){
            System.out.println("Employer database could not be found! ");
            e.printStackTrace();
        }
        return null;

    }

    public static ArrayList<Admin> getAdmin() {
        ArrayList<Admin> admins = new ArrayList<Admin>();

        try {

            return admins;

        } catch (Exception e) {
            System.out.println("Admin database could not be found!");
            e.printStackTrace();
        }
        return null;

    }

    public static ArrayList<JobListings> getJobListings() {
        ArrayList<JobListings> jobListings= new ArrayList<JobListings>();

        try {
            return jobListings;

        } catch (Exception e){
            System.out.println("Job database could not be found!");
            e.printStackTrace();
        }
        return null;

    }

    public static ArrayList<Resume> getResume() {
        ArrayList<Resume> resumes = new ArrayList<Resume>();

        try {

            return resumes;

        } catch (Exception e){
            System.out.println("Resumes could not be found!");
            e.printStackTrace();
        }
        return null;

    }

}