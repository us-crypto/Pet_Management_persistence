
/***
 * classe pet is superclass of mammals and fishes and has a input String Name and owner name and a cunstructur
 */
public abstract class Pet implements Animal  {
    private String name;
    private String owner;
    /**
     * This constructor create a new Pet with a new name and sets an owner.
     * @param name String name of the pet
     * @param owner String name of the owner
     * @throws Exception
     */
    public Pet(String name , String owner) throws Exception {
        // System.out.println("name= "+name);
        // System.out.println("owner= "+owner);
        
        checker(name, owner);
        setOwner(owner);
        setName(name);
    }
    public void checker(String name, String owner) throws Exception {
        if (name.length()<1) {
            throw new ShortPetNameException ("pet name is too short");
        }
        if (owner.length()<1) {
            throw new ShortOwnerNameException ("owner name is too short");
        }
    }
    /**
     * shows what u need for pet care 
     * Gives a console output what to do.
     */
    public abstract String careFor();
    
        /**
     * function prints care for fishes
     */

    /**
     * recieving the saved name 
     * @return String name of animal
     */
    public String getName() {
        return name;
        
    }
    /**
     * setting the animal name to some new name
     * @param name String new animal name
     */
    public void setName(String name){
        this.name=name;
    }
    /**
     * setting the owner name to some new name
     * @param name String new owner name
     */
    public void setOwner(String owner){
        this.owner=owner;
    }
    /**
     * recieving the saved owner 
     * @return String name of owner
     */
    public String getOwner() {
        return owner;
        
    }


}