import java.util.ArrayList;
import java.util.UUID;
/**
 * @author Anton, Christian, Kylie, Jack
 */
/**
 * Creating and initializing ArrayList of Type Student 
 */
public class Students {
    private static Students students = null;
    private static ArrayList<Student> studentList = new ArrayList<>();
    /**
     * filling ArrayList with Students called in dataLoader
     */
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
    /**
     * Adding a Student to the arrayList of students
     * @param id
     * @param username
     * @param password
     * @param email
     * @param number
     * @param firstName
     * @param lastName
     * @param gpa
     * @param grade
     * @param skills
     * @param awards
     * @param extracurriculars
     * @param references
     * @param experience
     */
    public void addStudent(UUID id, String username, String password, String email, String number, String firstName, String lastName, Double gpa, String grade, ArrayList<String> skills, ArrayList<String> awards, ArrayList<String> extracurriculars, ArrayList<String> references, ArrayList<String> experience) {
        studentList.add(new Student(id,username,password,email,number,firstName,lastName,gpa,grade,skills,awards,extracurriculars,references,experience));
    }
    /**
     * Saving the Student to a JSON file and logging out
     */
    public void logout() {
        DataWriter.saveStudent();
    }
    /**
     * Checking is username is in the Student ArrayList
     * @param userName
     * @return
     */
    public Student getStudent(String userName) {
        for(Student student : studentList ) {
            if(student.getUsername().equals(userName)) {
                return student;
            }
        }
        return null;
    }
    /**
     * Checking the instance of whether or not a Student of a certain username exists
     * @param userName
     * @return
     */
    public boolean haveStudent(String userName) {
         for(Student student: studentList ) {
                if(student.getUsername().equals(userName)) {
                    return true;
                }
            }
            return false;
        
    }
    public void printResume() {

    }
    // public boolean addStudent(String userName, String firstName, String lastName, int age, String phoneNumber) {
    //     if(haveStudent(userName))return false;
        
        
    //     studentList.add(new Student(userName,firstName,lastName));
    // }
    
}
