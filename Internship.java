/**
 * @author Anton, Christian, Kylie, Jack
 */

public class Internship {
    private Students students;
    private Student currentStudent;
    private JobListing jobs;

    public Internship() {
        jobs = JobListing.getInstance();
        students = Students.getInstance();
    }

    // public boolean createAccount(String userName, String firstName, String lastName, String email) {
    //     return students.addStudent(null,null,userName, firstName, lastName, email);
    // }

    public boolean login(String userName) {
        if(!students.haveStudent(userName)) return false;

        currentStudent = students.getStudent(userName);
        return true;
    }

    public Student getCurrentUser(){
        return currentStudent;
    }

    public boolean searchJobs(String filter) {
        jobs.searchJobs();
        return true;
    }

    public boolean resume(ArrayList<String> skills, ArrayList<String> education, ArrayList<String> experience) {
        currentStudent.createResume(skills, education, experience);
        if (currentStudent.haveResume()) {
            return true;
        }
        return false;
    }

    public boolean printResume() {
        if(currentStudent.haveResume()) {
            students.printResume();
            return true;
        }
        return false;
    }

    public boolean createJobListing(String location, double pay, boolean remote, String startDate, String description) {
        
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
