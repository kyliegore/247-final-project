import java.util.ArrayList;
import java.util.UUID;
/**
 * @author Anton, Christian, Kylie, Jack
 */

public class Student {
    /**
     * Creating private instance variables for a Student
     */
    private double gpa;
    private String grade;
    private UUID Id;
    private String username;
    private String password;
    private String email;
    private String number;
    private String firstName;
    private String lastName;
    private ArrayList<String> skills;
    private ArrayList<String> awards;
    private ArrayList<String> extracurriculars;
    private ArrayList<String> references;
    private ArrayList<String> experience;
    private ArrayList<Resume> resumes;
    /**
     * Parameterized Constructor
     * @param id
     * @param username
     * @param password
     * @param email
     * @param number
     * @param firstName
     * @param lastName
     * @param gpa
     * @param grade
     * @param skills
     * @param awards
     * @param extracurriculars
     * @param references
     * @param experience
     */
    public Student(UUID id, String username, String password, String email, String number, String firstName, String lastName, Double gpa, String grade, ArrayList<String> skills, ArrayList<String> awards, ArrayList<String> extracurriculars, ArrayList<String> references, ArrayList<String> experience) {
        this.Id = id;
        this.username = username;
        this.password = password;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.number = number;
        this.grade = grade;
        this.gpa = gpa;
        this.skills = skills;
        this.awards = awards;
        this.extracurriculars = extracurriculars;
        this.references = references;
        this.experience = experience;
        this.resumes = new ArrayList<Resume>();

    }
    /**
     * Getters and Setters for Instance Variables of a Student
     * @return
     */
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
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
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public ArrayList<String> getSkills() {
        return skills;
    }
    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }
    public ArrayList<String> getAwards() {
        return awards;
    }
    public void setAwards(ArrayList<String> awards) {
        this.awards = awards;
    }
    public ArrayList<String> getExtracurriculars() {
        return extracurriculars;
    }
    public void setExtracurriculars(ArrayList<String> extracurriculars) {
        this.extracurriculars = extracurriculars;
    }
    public ArrayList<String> getReferences() {
        return references;
    }
    public void setReferences(ArrayList<String> references) {
        this.references = references;
    }
    public ArrayList<String> getExperience() {
        return experience;
    }
    public void setExperience(ArrayList<String> experience) {
        this.experience = experience;
    }
    /**
     * ToString to show the Student their acct information.
     */
    public String toString() {
        return "First name: " + this.firstName + "\n" + "FLast name: " + this.lastName + "\n"+ "ID: " + this.Id + "\n" + "Email: " + this.email + "\n";
    }
    public void searchUser() {

    }
    public boolean isVerified() {
        return true;
    }
    public void createResume(ArrayList<String> skills, ArrayList<String> education, ArrayList<String> experience) {
        Resume currentResume = new Resume(firstName, lastName, email, number, skills, education, experience);
        resumes.add(currentResume);
    }
    public void printResume() {
        for(Resume resume : resumes) {
            System.out.println(resume.printResume());
        }
    }
    public boolean haveResume() {
        if (resumes == null) {
            return false;
        }
        return true;
    }
    public void apply() {
        System.out.println("Successfully applied to job.");
    }
}
