/**
 * @author Anton, Christian, Kylie, Jack
 */

public class References {
    private String name;
    private String number;
    private String email;
    //in our UML but no implementation yet
    public References(String name, String number, String email) {
        this.name = name;
        this.number = number;
        this.email = email;
        
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNumber() {
        return this.number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
        return "Name: " + name + "\n" + "Number: " + number + "\n" + "Email: " + email + "\n";
        
        
    }
}