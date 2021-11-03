import java.util.UUID;
/**
 * @author Anton, Christian, Kylie, Jack
 */

public class Employer {
    /**
     * Creating private instance variables for an Employer
     */
public class Employer   {
    private String company;
    private String description;
    private UUID Id;
    private String password;
    private String username;
    private String email;
    /**
     * paramterized Constructor for an Employer
     */
    public Employer(UUID id, String email, String username, String password, String company, String description) {
        this.company = company;
        this.Id = id;
        this.email = email;
        this.username = username;
        this.password = password;
        this.description = description;
        }
   /**
    * Getters and Setters for Employer Information
    * @return
    */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public UUID getId() {
        return Id;
    }
    public void setId(UUID id) {
        this.Id = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public void editJob() {

    }
    public void removeJob() {
        
    }
    public void addJob() {
        
    }
    public void searchUser() {
        
    }
    public boolean isVerified() {
        return true;
    }
    /**
     * theoretically prints out employer information
     */
    public String toString() {
        return "Company name: " + this.company + "\n" + "Company ID: " + this.Id + "\n" + "Email: " + this.email + "\n" 
        + "Description: " + this.description + "\n";
    }
}