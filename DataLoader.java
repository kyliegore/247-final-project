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
}