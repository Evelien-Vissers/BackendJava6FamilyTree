import java.util.ArrayList;

//Stap 1: Maak de juiste klassen aan:
public class Person {
    //Stap 2: Attributen voor 'Person' klasse:
    private String name;
    private String middlename;
    private String lastName;
    private String sex;
    private int age;
    private Person mother;
    private Person father;
    private List<Person> siblings;
    private List<Person> children;
    private List<Pet> pets = new ArrayList<>();

    //Stap 3: Constructors voor 'Person' klasse - stelt beginwaarde van attributen van het object in.
    //3a. Constructor met name, lastName, age en sex
    public Person(String name, String lastName, int age, String sex) {
        this(name, null, lastName, age, sex);
    }
    //3b. Constructor met name, middleName, lastName, age en sex
    public Person(String name, String middleName, String lastName, int age, String sex) {
        this.name = name;
        this.middlename = middleName;
        this.lastName = lastName;
        this.age = age;
        this.siblings = new List<Person>();
        this.children = new List<Person>();
    }
    //Stap 4: Maak alle getters & setters aan. Deze bieden een gecontroleerde manier (een methode) om toegang te krijgen tot de attributen van een klasse.
    //Dit is een principe van 'encapsulation', wat zorgt voor bescherming van interne representatie van een object tegen directe toegang van buitenaf.
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMiddlename() {
        return middlename;
    }
    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getSex () {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Person getMother() {
        return mother;
    }
    public void setMother(Person mother) {
        this.mother = mother;
    }
    public Person getFather() {
        return father;
    }
    public void setFather(Person father) {
        this.father = father;
    }
    public List<Person> getSiblings() {
        return siblings;
    }
    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }
    public List<Person> getChildren() {
        return children;
    }
    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {this.pets = pets;
    }
    //Stap 5: methoden implementeren.
    //Methode om 'parents' toe te voegen:
    public void addParents(Person mother, Person father) {
        this.mother = mother;
        this.father = father;
    }
    //Methode om 'child' toe te voegen:
    public void addChiled(Person child) {
        this.children.add(child);
    }
    //Methode om 'pet' toe te voegen:
    public void addPet(Pet pet) {
        this.pets.add(pet);
        pet.setOwner(this);
    }
    //Methode to get 'grandchildren':
    public List<Person> getGrandChildren() {
        List<Person> grandChildren = new ArrayList<Person>();
        for (Person child : children) {
            grandchildren.addAll(child.getChildren());
        }
        return grandChildren;
    }

}

