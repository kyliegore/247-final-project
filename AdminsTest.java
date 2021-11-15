import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.UUID;

//Tested by Christian Rios
class AdminsTest {
    @BeforeEach
    public void setup() {
        //runs before each test
        UUID id = UUID.fromString("0b5330dc-7e63-410f-9c9f-32f660ee9c4f");
        String email = "abc@gmail.com";
        String username = "abc";
        String password = "123";
        String firstName = "ABC";
        String lastName = "DEF";
        Admins.addAdmin(id, email, username, password, firstName, lastName);
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
    public void testAddingAdmin() {
        ArrayList<Admin> adminList = Admins.getAdmin();
        assertNotNull(adminList);
    }
    
}
