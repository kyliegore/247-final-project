import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataLoaderTest {
	private Students students = Students.getInstance();
	private ArrayList<Student> studentList = students.getStudent();
	
	@BeforeEach
	public void setup() {
		studentList.clear();
		studentList.add(new Student("asmith", "Amy", "Smith", 19, "803-454-3344"));
		studentList.add(new Student("bwhite", "Bob", "White", 23, "803-333-3544"));
		DataWriter.saveStudent();
	}
	
	@AfterEach
	public void tearDown() {
		Students.getInstance().getCurrentStudent().clear();
		DataWriter.saveStudent();
	}
	
	
	@Test
	void testGetStudentsSize() {
		studentList = DataLoader.getStudents();
		assertEquals(2, studentList.size());
	}

	@Test
	void testGetStudentsSizeZero() {
		Students.getInstance().getCurrentStudent().clear();
		DataWriter.saveStudent();
		assertEquals(0, studentList.size());
	}
	
	@Test
	void testGetStudentFirstUserName() {
		studentList = DataLoader.getStudents();
		assertEquals("asmith", studentList.get(0).getUsername());
	}
}