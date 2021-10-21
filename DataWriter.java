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
        
        ArrayList<Student> students = student.getStudents();

    }
    public static JSONObject getUserJSON(User users) {
        
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
