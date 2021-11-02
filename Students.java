import java.util.ArrayList;
import java.util.UUID;
/**
 * @author Anton, Christian, Kylie, Jack
 */

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
    public void addStudent(UUID id, String username, String password, String email, String number, String firstName, String lastName, Double gpa, String grade, ArrayList<String> skills, ArrayList<String> awards, ArrayList<String> extracurriculars, ArrayList<String> references, ArrayList<String> experience) {
        studentList.add(new Student(id,username,password,email,number,firstName,lastName,gpa,grade,skills,awards,extracurriculars,references,experience));
    }

    public void logout() {
        DataWriter.saveStudent();
    }
    public Student getStudent(String userName) {
        for(Student student : studentList ) {
            if(student.getUsername().equals(userName)) {
                return student;
            }
        }
        return null;
    }
    
    public boolean haveStudent(String userName) {
         for(Student student: studentList ) {
                if(student.getUsername().equals(userName)) {
                    return true;
                }
            }
            return false;
        
    }
    // public boolean addStudent(String userName, String firstName, String lastName, int age, String phoneNumber) {
    //     if(haveStudent(userName))return false;
        
        
    //     studentList.add(new Student(userName,firstName,lastName));
    // }
    
}
