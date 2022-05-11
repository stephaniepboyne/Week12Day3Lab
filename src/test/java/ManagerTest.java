import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;


    @Before
    public void before(){
        manager = new Manager("Bob", 96, 25000.00, "management");

    }

    @Test
    public void hasName() {
        assertEquals("Bob",manager.getName());
    }

    @Test
    public void hasNino(){
        assertEquals(96, manager.getNino());
    }

    @Test
    public void hasSalary(){
        assertEquals(25000.00, manager.getSalary(), 0.0);
    }

    @Test
    public void hasDeptName(){
        manager.getDeptName();
    }

    @Test
    public void testRaiseSalary(){
        manager.raiseSalary(2000.50);
        assertEquals(27000.50, manager.getSalary(), 0.0);
    }

    @Test
    public void testPayBonus(){
        assertEquals(250, manager.payBonus(25000.00), 0.0);
    }


}
