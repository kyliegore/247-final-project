import java.util.ArrayList;
/**
 * @author Anton, Christian, Kylie, Jack
 */

public class Resume {
    private String name;
    private String email;
    private ArrayList<String> skills;
    private ArrayList<String> awards ;
    private ArrayList<String> extracurriculars;
    private References references;
    private WorkExperience workExperience;

    // public Resume(String name, String email, ArrayList<String> skills, ArrayList<String> awards, ArrayList<String> extracurriculars, References references, WorkExperience workExperience) {

    // }
    public Resume(String firstName, String lastName, Double gpa, String grade, ArrayList<String> skills, ArrayList<String> awards,
            ArrayList<String> extracurriculars, References references, WorkExperience experience) {
                this.name = firstName + lastName;
                this.skills = skills;
                this.awards = awards;
                this.extracurriculars = extracurriculars;
                this.references = references;
                this.workExperience = experience;
                
    }
    public void deleteResume() {
        
    }
    public void addResume() {
        
    }
    public void makeCoverLetter() {
        
    }
    public String toString() {
        return "";
    }
}