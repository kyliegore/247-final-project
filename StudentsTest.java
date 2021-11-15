import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.UUID;
//Tested by Christian Rios
//Note that these tests come up with an error when testing from the entire directory, but will work when tested individually.
class StudentsTest {
    public static void setup() {
        //runs before each test
        UUID id = UUID.fromString("934e9322-fe0c-4368-a182-83eb2fa4d8e9");
        String email = "jerry@gmail.com";
        String username = "abc";
        String password = "123";
        String number = "456-345-4567";
        String firstName = "Jerry";
        String lastName = "Seinfeld";
        Double gpa = 3.2;
        String grade = "Junior";
        ArrayList<String> skills = new ArrayList<String>();
        skills.add("Acting");
        ArrayList<String> awards = new ArrayList<String>();
        awards.add("Emmy");
        ArrayList<String> extracurriculars = new ArrayList<String>();
        extracurriculars.add("Movies");
        ArrayList<String> references = new ArrayList<String>();
        references.add("ABC");
        ArrayList<String> experience = new ArrayList<String>();
        references.add("NBC");
        Students.addStudent(id, username, password, email, number, firstName, lastName, gpa, grade, skills, awards, extracurriculars, references, experience);
    }

    public static void tearDown() {
        //runs after each test
    }

    //assertEquals(val1,val2)
    //assertFalse(val)
    //assertTrue(val)
    //assertSame(val1,val2)
    //assertNotSame(val1,val2)
    //assertNull(val)
    //assertNotNull(val)

    //This test works, but comes up with an error if you test the entire directory at once.
    @Test
    public void testAddingStudent() {
        setup();
        ArrayList<Student> studentList = Students.getStudent();
        assertNotNull(studentList);
    }
    @Test
    public void testGetStudentThatExists() {
        setup();
        Student student = Students.getStudent("abc");
        assertNotNull(student);
    }

    @Test
    public void testGetStudentThatDoesNotExist() {
        setup();
        Student student = Students.getStudent("notinlist");
        assertNull(student);
    }

    @Test
    public void testHaveStudentThatExists() {
        setup();
        Boolean have = Students.haveStudent("abc");
        assertTrue(have);
    }

    @Test
    public void testHaveStudentThatDoesNotExist() {
        setup();
        Boolean have = Students.haveStudent("notinlist");
        assertFalse(have);
    }
}