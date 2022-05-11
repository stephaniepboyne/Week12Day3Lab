import org.junit.Before;
import org.junit.Test;
import staff.DatabaseAdmin;
import staff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Sammy", 60, 25000.00);

    }

    @Test
    public void hasName() {
        assertEquals("Sammy", developer.getName());
    }

    @Test
    public void hasNino() {
        assertEquals(60, developer.getNino());
    }

    @Test
    public void hasSalary() {
        assertEquals(25000.00, developer.getSalary(), 0.0);
    }


    @Test
    public void testRaiseSalary() {
        developer.raiseSalary(2000.50);
        assertEquals(27000.50, developer.getSalary(), 0.0);
    }

    @Test
    public void testCannotRaiseSalary(){
        developer.raiseSalary(-1.00);
        assertEquals(25000.00, developer.getSalary(), 0.0);
    }

    @Test
    public void testPayBonus() {
        assertEquals(250, developer.payBonus(25000.00), 0.0);
    }

    @Test
    public void testChangeName(){
        developer.changeName("Jill");
        assertEquals("Jill", developer.getName());
    }

}
