import java.util.UUID;

public class Admin  {
    private String firstName;
    private String lastName;
    private UUID Id;
    private String password;
    private String username;
    private String email;

    public Admin(UUID id, String email, String username, String password, String firstName, String lastName) {
        this.Id = id;
        this.email = email;
        this.password = password;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public UUID getId() {
        return Id;
    }
    public void setId(UUID id) {
        this.Id = id;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String toString() {
        return "First name: " + this.firstName + "\n" + "Last name: " + this.lastName + "\n"+ "ID: " + this.Id + "\n" + "Email: " + this.email + "\n";
    }
    public void removeJob() {

    }
    public void removeReview() {

    }
    public void hideReview() {

    }
    public void removeProfile() {

    }
}