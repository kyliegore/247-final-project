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
    public void addStudent(UUID id, String username, String password, String email, String firstName, String lastName, Double gpa, String grade, ArrayList<String> skills, ArrayList<String> awards, ArrayList<String> extracurriculars, References references, WorkExperience experience) {
        studentList.add(new Student(id,username,password,email,firstName,lastName,gpa,grade,skills,awards,extracurriculars,references,experience));
    }
    
    public void logout() {
        DataWriter.saveStudent();
    }
    
}
