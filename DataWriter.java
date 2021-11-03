import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
/**
 * @author Anton, Christian, Kylie, Jack
 */
/**
 * DataWrite to Class to add Student and Employer Details to a Json File
 */
public class DataWriter extends DataConstants {
    public static void saveStudent() {
        Students students = Students.getInstance();
        ArrayList<Student> newStudents = students.getStudent();
        JSONArray jsonStudent = new JSONArray();
        for(int i=0; i< newStudents.size(); i++) {
			jsonStudent.add(getStudentJSON(newStudents.get(i)));
        }
        /**
         * Checking if a student exists w/ a certain file name 
         */
        try (FileWriter file = new FileWriter(STUDENT_FILE_NAME)) {
            file.write(jsonStudent.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   
    public static JSONObject getStudentJSON(Student student) {
        /**
         * Used a Hashmap Here and then added that into a JSONOBJECT because we had errors saying that
         * "put" had to be of the type HASHMAP<String,Object>.
         */
        HashMap<String,Object> studentDetails = new HashMap<String,Object>();
            studentDetails.put(USER_ID, student.getId());
            studentDetails.put(USER_NAME, student.getUsername());
            studentDetails.put(PASSWORD, student.getPassword());
            studentDetails.put(GPA, student.getGpa());
            studentDetails.put(GRADE, student.getGrade());
            studentDetails.put(EMAIL, student.getEmail());
            studentDetails.put(FIRST_NAME, student.getFirstName());
            studentDetails.put(LAST_NAME, student.getLastName());
            studentDetails.put(AWARDS, student.getAwards());
            studentDetails.put(SKILLS, student.getSkills());
            studentDetails.put(EXTRACURRICULARS, student.getExtracurriculars());
            studentDetails.put(REFERENCES, student.getReferences());
            studentDetails.put(EXPERIENCE, student.getExperience());
            JSONObject studentDetailsJSON = new JSONObject(studentDetails);
        return studentDetailsJSON;
        
    }
    /**
     * nearly identical to saveStudent except only writes Employer Information 
     */
    public static void saveEmployer() {
        Employers employers = Employers.getInstance();
        ArrayList<Employer> newEmployers = employers.getEmployers();
        JSONArray jsonStudent = new JSONArray();
        for(int i=0; i< newEmployers.size(); i++) {
			jsonStudent.add(getEmployerJSON(newEmployers.get(i)));
        }
        /**
         * Checking if a employer exists w/ a certain file name 
         */
        try (FileWriter file = new FileWriter(STUDENT_FILE_NAME)) {
            file.write(jsonStudent.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static JSONObject getEmployerJSON(Employer employers) {
        /**
         * Used a Hashmap Here and then added that into a JSONOBJECT because we had errors saying that
         * "put" had to be of the type HASHMAP<String,Object>.
         */
        HashMap<String,Object> employerDetails = new HashMap<String,Object>();
        employerDetails.put(USER_ID, employers.getId());
        employerDetails.put(USER_NAME, employers.getUsername());
        employerDetails.put(PASSWORD, employers.getPassword());
        employerDetails.put(EMAIL, employers.getEmail());
        employerDetails.put(COMPANY, employers.getCompany());
        employerDetails.put(COMPANY_DESCRIPTION, employers.getDescription());
        JSONObject employerDetailsJSON = new JSONObject(employerDetails);
        return employerDetailsJSON;
    }
    public static void saveAdmin() {
        Admins admins = Admins.getInstance();
        ArrayList<Admin> newAdmin = admins.getAdmin();
        JSONArray jsonAdmin = new JSONArray();
        for(int i=0; i< newAdmin.size(); i++) {
			jsonAdmin.add(getAdminJSON(newAdmin.get(i)));
        }
        /**
         * Checking if a employer exists w/ a certain file name 
         */
        try (FileWriter file = new FileWriter(ADMIN_FILE_NAME)) {
            file.write(jsonAdmin.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static JSONObject getAdminJSON(Admin admins) {
        /**
         * Used a Hashmap Here and then added that into a JSONOBJECT because we had errors saying that
         * "put" had to be of the type HASHMAP<String,Object>.
         */
        HashMap<String,Object> adminDetails = new HashMap<String,Object>();
        adminDetails.put(USER_ID, admins.getId());
        adminDetails.put(USER_NAME, admins.getUsername());
        adminDetails.put(PASSWORD, admins.getPassword());
        adminDetails.put(EMAIL, admins.getEmail());
        adminDetails.put(FIRST_NAME, admins.getFirstName());
        adminDetails.put(LAST_NAME, admins.getLastName());
        JSONObject adminDetailsJSON = new JSONObject(adminDetails);
        return adminDetailsJSON;
    }
    public static void saveJobListing() {
        JobListing joblistings = JobListing.getInstance();
        ArrayList<Job> newJob = joblistings.getJob();
        JSONArray jsonJob = new JSONArray();
        for(int i=0; i< newJob.size(); i++) {
			jsonJob.add(getJobListingJSON(newJob.get(i)));
        }
        /**
         * Checking if a employer exists w/ a certain file name 
         */
        try (FileWriter file = new FileWriter(JOB_FILE_NAME)) {
            file.write(jsonJob.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static JSONObject getJobListingJSON(Job jobs) {
        /**
         * Used a Hashmap Here and then added that into a JSONOBJECT because we had errors saying that
         * "put" had to be of the type HASHMAP<String,Object>.
         */
        HashMap<String,Object> jobDetails = new HashMap<String,Object>();
        jobDetails.put(LOCATION, jobs.getLocation());
        jobDetails.put(PAY_RATE, jobs.getPay());
        jobDetails.put(REMOTE_BOOL, jobs.getRemote());
        jobDetails.put(DATE_FEILD, jobs.getDate());
        jobDetails.put(JOB_DESCRIPTION, jobs.getDescription());
        JSONObject jobDetailsJSON = new JSONObject(jobDetails);
        return jobDetailsJSON;
    }
    

    
}
