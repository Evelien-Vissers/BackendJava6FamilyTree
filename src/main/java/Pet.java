//Stap 1: maak de juiste klassen aan:
public class Pet {
    //Stap 2: Attributen voor de 'Pet' klasse:
    private String name;
    private int age;
    private String species;
    private Person owner;

    //Stap 3: Constructor Pet-klasse zonder 'owner':
    public Pet(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }
    //Stap 4: Maak alle getters & setters aan.
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
    //Stap 5: deze klasse heeft geen extra methoden nodig, omdat we al de constructor en getters/setters hebben toegevoegd.
    //De 'addPet' methode in de Person klasse zorgt ervoor dat het huisdier aan de 'pets' lijst van de eigenaar wordt toegevoegd en de eigenaar wordt ingesteld.
}
