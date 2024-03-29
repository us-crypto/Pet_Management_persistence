
/***
 * class mammals is childclass of pet and has a input String Name and owner
 * name and has 2 functions and a cunstructur
 */
public abstract class Mammal extends Pet {
    /**
     * Cunstructor to create a new Mammal. Super constructor of Pet is called.
     * 
     * @param name  name of the pet
     * @param owner owner's name
     * @throws Exception if creation of Mammal wasnt sucsessful this will show up
     */
    public Mammal(String name, String owner, String test) throws Exception {
        super(name, owner,test);
    }

    /**
     * text function no parameter no return
     * 
     * shows what u need for mammal care
     * @return String care mode for specific animal
     */
    public abstract String careFor();

    /**
     * Method that let's the Mammal walk
     * @return String moving mode for specific animal
     */
    public abstract String walk();
}
