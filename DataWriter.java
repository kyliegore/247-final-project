import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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
        ArrayList<Student> newStudents = new ArrayList<Student>();
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
    public static JSONObject getStudentJSON(Student students) {
        JSONObject studentDetails = new JSONObject();
            studentDetails.put(USER_ID, Student.getID);
            studentDetails.put(USER_NAME, Student.getUsername);
            studentDetails.put(PASSWORD, Student.getPassword);
            studentDetails.put(GPA, Student.getGPA);
            studentDetails.put(GRADE, Student.getGrade);
            studentDetails.put(SKILLS, Student.getSkills);
            studentDetails.put(AWARDS, Student.getAwards);
            studentDetails.put(EXTRACURRICULARS, Student.getExtracurriculars);
            studentDetails.put(REFERENCES, Student.getReferences);
            studentDetails.put(EXPERIANCE, Student.getExperiance);
        return studentDetails;
        
    }
    public static void saveEmployer() {

    }
    public static void saveAdmin() {

    }
    public static void saveResume() {

    }
    public static void saveJobListing() {

    }

    
}
