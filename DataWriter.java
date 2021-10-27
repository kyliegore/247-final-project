import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter extends DataConstants {
    public static void saveStudent() {
        // Student student = Student.searchUser();
        /** possibility of doing this all in one like having a getInstance in User that I could use here to
         * create a new ArrayList<User> of the specific User 
         * User typeUser = User.getInstance();
         * ArrayList<User> users = typeUser.getUser();
         * JSONArray jsonUsers = new JSONArray();
         * for(int i=0; i< users.size(); i++) {
			jsonFriends.add(getUserJSON(users.get(i)));
		}
         * 
         * */ 
        Students students = Students.getInstance();
        ArrayList<Student> newStudents = students.getStudent();
        JSONArray jsonStudent = new JSONArray();
        for(int i=0; i< newStudents.size(); i++) {
			jsonStudent.add(getStudentJSON(newStudents.get(i)));
        }
        try (FileWriter file = new FileWriter(STUDENT_FILE_NAME)) {
            file.write(jsonStudent.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   
    public static JSONObject getStudentJSON(Student student) {
        HashMap<String,Object> studentDetails = new HashMap<String,Object>();
        // JSONObject studentDetails = new JSONObject();
            studentDetails.put(USER_ID, student.getId());
            studentDetails.put(USER_NAME, student.getUsername());
            studentDetails.put(PASSWORD, student.getPassword());
            studentDetails.put(GPA, student.getGpa());
            studentDetails.put(GRADE, student.getGrade());
            studentDetails.put(EMAIL, student.getEmail());
            studentDetails.put(FIRST_NAME, student.getFirstName());
            studentDetails.put(LAST_NAME, student.getLastName());
            // studentDetails.put(AWARDS, student.getAwards());
            // studentDetails.put(EXTRACURRICULARS, student.getExtracurriculars());
            // studentDetails.put(REFERENCES, student.getReferences());
            // studentDetails.put(EXPERIENCE, student.getExperience());
            JSONObject studentDetailsJSON = new JSONObject(studentDetails);
        return studentDetailsJSON;
        
    }
    public static void saveEmployer() {
        Employers employers = Employers.getInstance();
        ArrayList<Employer> newEmployers = employers.getEmployers();
        JSONArray jsonStudent = new JSONArray();
        for(int i=0; i< newEmployers.size(); i++) {
			jsonStudent.add(getEmployerJSON(newEmployers.get(i)));
        }
        try (FileWriter file = new FileWriter(STUDENT_FILE_NAME)) {
            file.write(jsonStudent.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static JSONObject getEmployerJSON(Employer employers) {
        HashMap<String,Object> employerDetails = new HashMap<String,Object>();
        // JSONObject studentDetails = new JSONObject();
        employerDetails.put(USER_ID, employers.getId());
        employerDetails.put(USER_NAME, employers.getUsername());
        employerDetails.put(PASSWORD, employers.getPassword());
        employerDetails.put(EMAIL, employers.getEmail());
        employerDetails.put(COMPANY, employers.getCompany());
        employerDetails.put(COMPANY_DESCRIPTION, employers.getDescription());
            // studentDetails.put(AWARDS, student.getAwards());
            // studentDetails.put(EXTRACURRICULARS, student.getExtracurriculars());
            // studentDetails.put(REFERENCES, student.getReferences());
            // studentDetails.put(EXPERIENCE, student.getExperience());
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
        try (FileWriter file = new FileWriter(ADMIN_FILE_NAME)) {
            file.write(jsonAdmin.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static JSONObject getAdminJSON(Admin admins) {
        HashMap<String,Object> adminDetails = new HashMap<String,Object>();
        // JSONObject studentDetails = new JSONObject();
        adminDetails.put(USER_ID, admins.getId());
        adminDetails.put(USER_NAME, admins.getUsername());
        adminDetails.put(PASSWORD, admins.getPassword());
        adminDetails.put(EMAIL, admins.getEmail());
        adminDetails.put(FIRST_NAME, admins.getFirstName());
        adminDetails.put(LAST_NAME, admins.getLastName());
            // studentDetails.put(AWARDS, student.getAwards());
            // studentDetails.put(EXTRACURRICULARS, student.getExtracurriculars());
            // studentDetails.put(REFERENCES, student.getReferences());
            // studentDetails.put(EXPERIENCE, student.getExperience());
            JSONObject adminDetailsJSON = new JSONObject(adminDetails);
        return adminDetailsJSON;

    }
    public static void saveResume() {

    }
    public static void saveJobListing() {

    }

    
}
