import org.junit.Before;
import org.junit.Test;
import staff.DatabaseAdmin;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Jerry", 110, 25000.00);

    }

    @Test
    public void hasName() {
        assertEquals("Jerry",databaseAdmin.getName());
    }

    @Test
    public void hasNino(){
        assertEquals(110, databaseAdmin.getNino());
    }

    @Test
    public void hasSalary(){
        assertEquals(25000.00, databaseAdmin.getSalary(), 0.0);
    }


    @Test
    public void testRaiseSalary(){
        databaseAdmin.raiseSalary(2000.50);
        assertEquals(27000.50, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void testPayBonus(){
        assertEquals(250, databaseAdmin.payBonus(25000.00), 0.0);
    }

}
