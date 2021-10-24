import java.util.ArrayList;
import java.util.UUID;
public class Students {
    private static Students students = null;
    private static ArrayList<Student> studentList = new ArrayList<>();

    private Students() {
        studentList = DataLoader.getStudents();
    }
    public static Students getInstance() {
        if (students == null) {
            students = new Students();
        }
        return students;
    }
    public ArrayList<Student> getStudent() {
        return studentList;
    }
    public void addStudent(UUID id, String username, String password, String email, String firstName, String lastName, Double gpa, String grade) {
        studentList.add(new Student(id,username,password,email,firstName,lastName,gpa,grade));
    }
    public void logout() {
        DataWriter.saveStudent();
    }
    
}
