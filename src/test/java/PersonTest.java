import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

@Test
    public void testGetName () {
        //Arrange
Person jan = new Person("Jan", "Janssen", 40, "Male");
        //Act
    String result = jan.getName();
        //Assert
assertEquals("Jan", result);
    }

    @Test
    public void testGetChildren () {
    //Arange
        Person evelien = new Person ("Evelien", "Vissers", 31, "Female");
    //Act
        List<Person> result = evelien.getChildren();
    //Assert
        assertEquals(0, result.size());
    }

    @Test
    public void testGetTwoChildren () {
        //Arrange
        Person evelien = new Person ("Evelien", "Vissers", 31, "Female");
        List<Person>  children = new ArrayList<>();
        Person max = new Person ("Max", "Max", 10, "Male");
        children.add(max);
        Person roos = new Person ("Roos", "Roos", 8, "Female");
        children.add(roos);
        evelien.setChildren(children);
        //Act
        List<Person> result = evelien.getChildren();
        //Assert
        assertEquals(2, result.size());

    }
}
