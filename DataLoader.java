import java.io.FileReader;
import java.util.ArrayList;
import java.util.UUID;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataLoader extends DataConstants{
	
	public static ArrayList<Student> getStudents() {
		ArrayList<Student> students = new ArrayList<Student>();
		
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

                students.add(new Student(id, username, password, email, firstName, lastName, gpa, grade));

            }
			
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

    public static ArrayList<JobListings> getJobListings() {
        ArrayList<JobListings> jobListings= new ArrayList<JobListings>();
        

        try {
            FileReader reader = new FileReader(JOB_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray jobJSON = (JSONArray)new JSONParser().parse(reader);

            for (int i = 0; i < jobJSON.size(); i++) {
                JSONObject listingJSON = (JSONObject)jobJSON.get(i);
                
                String location = (String)listingJSON.get(LOCATION);
                Double pay = (Double)listingJSON.get(PAY_RATE);
                Boolean remote = (Boolean)listingJSON.get(REMOTE_BOOL);
                String date = (String)listingJSON.get(DATE_FEILD);
                String description = (String)listingJSON.get(JOB_DESCRIPTION);

                jobListings.add(new JobListings(location, pay, remote, date, description));
            }
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
            FileReader reader = new FileReader(STUDENT_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray studentresJSON = (JSONArray)new JSONParser().parse(reader);

            for (int i = 0; i<studentresJSON.size(); i++) {
                JSONObject resumeJSON = (JSONObject)studentresJSON.get(i);

                String firstName = (String)resumeJSON.get(FIRST_NAME);
                String lastName = (String)resumeJSON.get(LAST_NAME);
                Double gpa = (Double)resumeJSON.get(GPA);
                String grade = (String)resumeJSON.get(GRADE);
                ArrayList<String> skills = (ArrayList<String>)resumeJSON.get(SKILLS);
                ArrayList<String> awards = (ArrayList<String>)resumeJSON.get(AWARDS);
                ArrayList<String> extracurriculars = (ArrayList<String>)resumeJSON.get(EXTRACURRICULARS);
                ArrayList<String> references = (ArrayList<String>)resumeJSON.get(REFERENCES);
                ArrayList<String> experience = (ArrayList<String>)resumeJSON.get(EXPERIENCE);

                resumes.add(new Resume(firstName, lastName, gpa, grade, skills, awards, extracurriculars, references, experience) );

            }


            return resumes;

        } catch (Exception e){
            System.out.println("Resumes could not be found!");
            e.printStackTrace();
        }
        return null;

    }

}