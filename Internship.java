/**
 * @author Anton, Christian, Kylie, Jack
 */
import java.util.ArrayList;
public class Internship {
    private Students students;
    private Student currentStudent;
    private Employers employers;
    private Employer currentEmployer;
    private JobListing jobs;

    public Internship() {
        jobs = JobListing.getInstance();
        students = Students.getInstance();
        employers = Employers.getInstance();
    }

    // public boolean createAccount(String userName, String firstName, String lastName, String email) {
    //     return students.addStudent(null,null,userName, firstName, lastName, email);
    // }

    public boolean loginStudent(String userName) {
        if(!students.haveStudent(userName)) return false;

        currentStudent = students.getStudent(userName);
        return true;
    }

    public boolean loginEmployer(String userName) {
        if(!employers.haveEmployer(userName)) return false;

        currentEmployer = employers.getEmployer(userName);
        return true;
    }


    public Student getCurrentStudent(){
        return currentStudent;
    }

    public Employer getCurrentEmployer(){
        return currentEmployer;
    }

    public boolean searchJobs(String filter) {
        jobs.searchJobs(filter);
        return true;
    }

    public boolean showJobs() {
        jobs.showListings();
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
            currentStudent.printResume();
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

    public boolean viewApplicants() {
        if (jobs.getApplicants() == -1) {
            return false;
        }
        else {
            jobs.getApplicants();
            return true;
        }
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
