/**
 * @author Anton, Christian, Kylie, Jack
 */

public class Internship {
    private UserList users;
    private User currentUser;
    private JobListing jobs;

    public Internship() {
        jobs = JobListing.getInstance();
        users = UserList.getInstance();
    }

    public boolean createAccount(String userName, String firstName, String lastName, int age, String phoneNumber) {
        return users.addUser(userName, firstName, lastName, age, phoneNumber);
    }

    public boolean login(String userName) {
        if(!users.haveUser(userName)) return false;

        currentUser = users.getUser(userName);
        return true;
    }

    public User getCurrentUser(){
        return currentUser;
    }

    public boolean searchJobs(String needFilter) {
        if (needFilter.equalsIgnoreCase("N")) {
            return jobs;
        }
        else if (needFilter.equalsIgnoreCase("Y")) {
            jobs.searchJobs()
        }
    }

    public boolean createResume() {
        
    }

    public boolean createJobListing() {
        
    }

    public boolean removeJob() {
        
    }

    public boolean editJob() {
        
    }

    public boolean viewAccount() {

    }
    
    public boolean removeJobListing() {

    }
    
    public boolean removeProfile(String userName, String password) {
        if(!users.haveUser(userName)) return false;
    }

    public void logout(){
        users.saveUsers();
    }
}
