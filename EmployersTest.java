import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.UUID;
//Tested by Christian Rios
class EmployersTest {
    public static void setup() {
        //runs before each test
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

    @Test
    public void testAddingEmployer() {
        UUID id = UUID.fromString("91f284ed-c529-47c4-b9a0-e61b768027b7");
        String email = "abc@gmail.com";
        String username = "abc";
        String password = "123";
        String companyName = "ABC Movers";
        String description = "ABC Movers is a moving company that helps customers move intot a new home.";
        Employers.addEmployer(id, email, username, password, companyName, description);
        ArrayList<Employer> employerList = Employers.getEmployers();
        assertNotNull(employerList);
    }
}
