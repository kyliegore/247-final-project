import java.util.ArrayList;
/**
 * @author Anton, Christian, Kylie, Jack
 */

public class Resume {
    private String name;
    private String firstname;
    private String lastName;
    private String email;
    private String number;
    private ArrayList<String> skills;
    private ArrayList<String> education;
    private ArrayList<String> experience;

    public Resume(String firstName, String lastName, String email, String number, ArrayList<String> skills,ArrayList<String> education, ArrayList<String> experience) {
                this.name = firstName + lastName;
                this.email = email;
                this.number = number;
                this.skills = skills;
                this.education = education;
                this.experience = experience;
                
    }
    public void addResume() {
        
    }
    public String printResume() {
        String result = "";
        result += this.name + "\n";
        result += this.email + "\n";
        result += this.number + "\n";
        result += this.skills + "\n";
        result += this.education + "\n";
        result += this.experience;
        return result;
    }
}