import org.example.Person;
import org.example.Wall;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void testPerson(){

        Person person = new Person("John", "Doe", 20);

        assertEquals("John", person.getFirstName());
        assertEquals("Doe", person.getLastName());
        assertEquals(20, person.getAge());
        assertFalse(person.isTeen());

        Person teen = new Person("Alice", "Smith", 16);

        assertTrue(teen.isTeen());
    }

    @Test
    void testWall() {

        Wall wall = new Wall(5,4);

        assertEquals(20.0, wall.getArea());

        wall.setHeight(-1.5);

        assertEquals(5.0, wall.getWidth());
        assertEquals(0.0, wall.getHeight());
        assertEquals(0.0, wall.getArea());
    }
}