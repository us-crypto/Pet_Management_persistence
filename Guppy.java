/***
 * class guppy is childclass of fishes and has a input String Name and owner
 * name and has 2 functions and a cunstructur
 */
public class Guppy extends Fish {
    /**
     * Cunstructor to create a new guppy. Super constructor of fishes is called.
     * both input String type
     * 
     * @param name  name
     * @param owner owner name
     * @throws Exception if creation of Guppy wasnt sucsessful this will show up
     */
    public Guppy(String name, String owner) throws Exception {
        super(name, owner);
        setType("Guppy");
    }

    /**
     * Method that let's the guppy swims
     * 
     * @return String moving mode for specific animal
     */
    public String swim() {
        System.out.println("swimming in circles ");
        return "swimming in circles ";
    }

}
