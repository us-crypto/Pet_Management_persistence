
/***
 * class pet is superclass of mammals and fishes and has a input String Name
 * and owner name and a cunstructur
 */
public abstract class Pet implements Animal {
    private String name;
    private String owner;
    private String type;

    /**
     * This constructor create a new Pet with a new name and sets an owner.
     * 
     * @param name  String name of the pet
     * @param owner String name of the owner
     * @throws Exception if creation of Pet wasnt sucsessful this will show up
     */
    public Pet(String name, String owner) throws Exception {
        checker(name, owner);
        setOwner(owner);
        setName(name);
    }

    /**
     * function to check length of name and animal name
     * 
     * @param name  String animal name
     * @param owner S tring owner name
     * @throws Exception if name or animal name is shoer this will show up
     */
    private void checker(String name, String owner) throws Exception {
        if (name.length() < 1) {
            throw new ShortPetNameException("pet name is too short");
        }
        if (owner.length() < 1) {
            throw new ShortOwnerNameException("owner name is too short");
        }
    }

    /**
     * gets the animal type 
     * @return String type of animal
     */
    public String getType() {
        return this.type;
    }

    /**
     * sets the animal type 
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * shows what u need for pet care
     * Gives a console output what to do.
     * @return String caring mode for specific animal
     */
    public abstract String careFor();

    /**
     * recieving the saved name
     * 
     * @return String name of animal
     */
    public String getName() {
        return name;

    }

    /**
     * setting the animal name to some new name
     * 
     * @param name String new animal name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * setting the owner name to some new name
     * 
     * @param name String new owner name
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * recieving the saved owner
     * 
     * @return String name of owner
     */
    public String getOwner() {
        return owner;

    }

}