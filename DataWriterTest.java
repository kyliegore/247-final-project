import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.UUID;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataWriterTest {
	private Students students = Students.getInstance();
	private ArrayList<Student> studentList = students.getStudent();
	
	@BeforeEach
	public void setup() {
		Students.getInstance().getStudent().clear();
		DataWriter.saveStudent();
	}
	
	@AfterEach
	public void tearDown() {
		Students.getInstance().getStudent().clear();
		DataWriter.saveStudent();
	}
	
	
	@Test
	void testWritingZeroUsers() {
		studentList = DataLoader.getStudents();
		assertEquals(0, studentList.size());
	}

	@Test
	void testWritingOneUser() {
		studentList.add(new Student(UUID.fromString("934e9322-fe0c-4368-a182-83eb2fa4d8e9"), "somethingFunny", "abcd789", "aperson@aol.com", "864-555-5555", "jeff", "bezos", 2.8, "sophmore", null, null, null, null, null));
		DataWriter.saveStudent();
		assertEquals("asmith", DataLoader.getStudents().get(0).getUsername());
	}
	
	@Test
	void testWritingFiveUsers() {
		studentList.add(new Student(UUID.fromString("934e9322-fe0c-4368-a182-83eb2gs4d8e9"), "something", "abcd782", "johnsmith@aol.com", "828-555-5555", "james", "smith", 3.4, "freshman", null, null, null, null, null));
		studentList.add(new Student(UUID.fromString("934e2322-fe0c-4238-a182-83eb2fa4d8e9"), "username", "abcd1235", "jenny@aol.com", "701-555-5555", "jenny", "craige", 4.0, "senior", null, null, null, null, null));
		// studentList.add(new Student("csmith", "Amy", "Smith", 19, "803-454-3344"));
		// studentList.add(new Student("dsmith", "Amy", "Smith", 19, "803-454-3344"));
		// studentList.add(new Student("esmith", "Amy", "Smith", 19, "803-454-3344"));
		DataWriter.saveStudent();
		assertEquals("esmith", DataLoader.getStudents().get(4).getUsername());
	}
	
	@Test
	void testWritingEmptyUser() {
		studentList.add(new Student(UUID.fromString(""), "", "", "", "", "", "", 0.0, "", null, null, null, null, null));
		DataWriter.saveStudent();
		assertEquals("", DataLoader.getStudents().get(0).getUsername());
	}
	
	@Test
	void testWritingNullUser() {
		studentList.add(new Student(UUID.fromString(null), null, null, null, null, null, null, 0.0, null, null, null, null, null, null));
		DataWriter.saveStudent();
		assertEquals(null, DataLoader.getStudents().get(0).getUsername());
	}
	
}