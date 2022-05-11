import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;


    @Before
    public void before(){
        director = new Director("Penelope", 122, 40000.00, "management", 10000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Penelope",director.getName());
    }

    @Test
    public void hasNino(){
        assertEquals(122, director.getNino());
    }

    @Test
    public void hasSalary(){
        assertEquals(40000.00, director.getSalary(), 0.0);
    }

    @Test
    public void hasDeptName(){
        director.getDeptName();
    }

    @Test
    public void hasBudget(){
        director.getBudget();
    }

    @Test
    public void testRaiseSalary(){
        director.raiseSalary(2000.50);
        assertEquals(42000.50, director.getSalary(), 0.0);
    }

    @Test
    public void testPayBonus(){
        assertEquals(800, director.payBonus(40000.00), 0.0);
    }
}