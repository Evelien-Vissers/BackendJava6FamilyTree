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
    @Test
    public void testAddParents() {
    //Arrange
        Person jan = new Person ("Jan", "Janssen", 40, "Male");
        Person moeder = new Person ("Anna", "Janssen", 78, "Female");
        Person vader = new Person ("Richard", "Janssen", 87, "Male");
    //Act
        jan.addParents(moeder, vader);
    //Assert
    assertEquals(moeder, jan.getMother());
    assertEquals(vader, jan.getFather());
    }

    @Test
    public void testAddPet() {
    //Arrange
        Person jan = new Person ("Jan", "Janssen", 40, "Male");
        Pet hond = new Pet("Buddy", 11, "Dog");
    //Act
        jan.addPet(hond);
    //Assert
        assertEquals(hond, jan.getPets().getFirst());
    }
    @Test
    public void testAddSibling() {
    //Arrange
        Person jan = new Person ("Jan", "Janssen", 40, "Male");
        List<Person> siblings = new ArrayList<>();
        Person marie = new Person ("Marie", "Janssen", 40, "Female");
        siblings.add(marie);
        jan.setSiblings(siblings);
        //Act
        List<Person> result = jan.getSiblings();
    //Assert
        assertEquals(1, result.size());
    }
@Test
    public void testGetGrandChildren() {
    //Arrange
    Person grootvader = new Person ("Piet", "Janssen", 89, "Male");
    Person vader = new Person("Henk", "Janssen", 56, "Male");

}
}
