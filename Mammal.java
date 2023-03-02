
/***
 * classe mammals is childclass of pet and has a input String Name and owner name and has 2 functions and a cunstructur
 */
public abstract class Mammal extends Pet{
    /**
     * Cunstructor to create a new Mammal. Super constructor of Pet is called.
     * @param name name of the pet
     * @param owner owner's name 
     * @throws Exception
     */
    public Mammal(String name, String owner, String type) throws Exception{
        super(name, owner, type);
    }
    /**
     * text function no parameter no return
     * 
     * shows what u need for mammal care 
     */
    public abstract String careFor();
    /**
     * Method that let's the Mammal walk
     */
    public abstract String walk();
}
