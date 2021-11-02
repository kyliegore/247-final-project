import java.util.ArrayList;

/**
 * @author Anton, Christian, Kylie, Jack
 */

public class UserList {
    private ArrayList<Student> studentList;
    private static UserList users;

    public boolean haveStudent(String userName) {
        for(Student student: studentList ) {
            if(student.getUsername().equals(userName)) {
                return true;
            }
        }
        return false;
    }

    public static UserList getInstance() {
        if(users == null) {
            users = new UserList();
        }
        return users;
    }
    
}
