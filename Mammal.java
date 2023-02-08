
/***
 * classe mammals is childclass of pet and has a input String Name and owner name and has 2 functions and a cunstructur
 */
public class Mammal extends Pet{
    /**
     * Cunstructor to create a new Mammal. Super constructor of Pet is called.
     * @param name name of the pet
     * @param owner owner's name 
     */
    public Mammal(String name, String owner){
        super(name, owner);
    }
    /**
     * text function no parameter no return
     * 
     * shows what u need for mammal care 
     */
    public void careFor() {
       
    }
    /**
     * Method that let's the Mammal walk
     */
    public void walk() {
        System.out.println("The mammal is walking on 4 feet ususally...");
    }
}
