import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.UUID;
//Tested by Christian Rios, Kylie Gore
class EmployersTest {
    @BeforeEach
    public void setup() {
        //runs before each test
        UUID id = UUID.fromString("91f284ed-c529-47c4-b9a0-e61b768027b7");
        String email = "abc@gmail.com";
        String username = "abc";
        String password = "123";
        String companyName = "ABC Movers";
        String description = "ABC Movers is a moving company that helps customers move intot a new home.";
        Employers.addEmployer(id, email, username, password, companyName, description);
    }

    @AfterEach
    public void tearDown() {
        //runs after each test
    }

    //assertEquals(val1,val2)
    //assertFalse(val)
    //assertTrue(val)
    //assertSame(val1,val2)
    //assertNotSame(val1,val2)
    //assertNull(val)
    //assertNotNull(val)

    @Test
    public void testAddingEmployer() {
        ArrayList<Employer> employerList = Employers.getEmployers();
        assertNotNull(employerList);
    }

    @Test
    public void testGetEmployerThatExists() {
        Employer employer = Employers.getEmployer("abc");
        assertNotNull(employer);
    }

    @Test
    public void testGetEmployerThatDoesNotExist() {
        Employer employer = Employers.getEmployer("notinlist");
        assertNull(employer);
    }

    @Test
    public void testHaveEmployerThatExists() {
        Boolean have = Employers.haveEmployer("abc");
        assertTrue(have);
    }

    @Test
    public void testHaveEmployerThatDoesNotExist() {
        Boolean have = Employers.haveEmployer("notinlist");
        assertFalse(have);
    }
}
