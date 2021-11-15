import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.UUID;
class AdminsTest {
    public static void setup() {
        //runs before each test
        Admins admins = null;
        ArrayList<Admin> adminList = new ArrayList<>();
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
    public void testAddingAdmin() {
        //Admins admins = null;
        UUID id = UUID.fromString("0b5330dc-7e63-410f-9c9f-32f660ee9c4f");
        String email = "abc@gmail.com";
        String username = "abc";
        String password = "123";
        String firstName = "ABC";
        String lastName = "DEF";
        Admins.addAdmin(id, email, username, password, firstName, lastName);
        ArrayList<Admin> adminList = Admins.getAdmin();
        assertNotNull(adminList);
    }
}
