import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.UUID;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//Tested by Anton Aarnink, Kylie Gore
class DataLoaderTest {
	private Students students = Students.getInstance();
	private ArrayList<Student> studentList = students.getStudent();
	
	@BeforeEach
	public void setup() {
		//studentList.clear();
		studentList.add(new Student(UUID.fromString("934e9322-fe0c-4368-a182-83eb2fa4d8e9"), "somethingFunny", "abcd789", "aperson@aol.com", "864-555-5555", "jeff", "bezos", 2.8, "sophmore", null, null, null, null, null));
		studentList.add(new Student(UUID.fromString("934e9322-fe0c-4368-a182-83eb2gs4d8e9"), "something", "abcd782", "johnsmith@aol.com", "828-555-5555", "james", "smith", 3.4, "freshman", null, null, null, null, null));
		DataWriter.saveStudent();
	}
	
	@AfterEach
	public void tearDown() {
		//Students.getInstance().getStudent().clear();
		DataWriter.saveStudent();
	}
	
	
	@Test
	void testGetStudentsSize() {
		studentList = DataLoader.getStudents();
		assertEquals(2, studentList.size());
	}

	@Test
	void testGetStudentsSizeZero() {
		Students.getInstance().getStudent().clear();
		DataWriter.saveStudent();
		assertEquals(0, studentList.size());
	}
	
	@Test
	void testGetStudentFirstUserName() {
		studentList = DataLoader.getStudents();
		assertEquals("asmith", studentList.get(0).getUsername());
	}
}