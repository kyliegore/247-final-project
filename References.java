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
    public String toString() {
        return "Name: " + name + "\n" + "Number: " + number + "\n" + "Email: " + email + "\n";
        
        
    }
}