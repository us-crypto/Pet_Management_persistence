/***
 * classe guppy is childclass of fishes and has a input String Name and owner name and has 2 functions and a cunstructur
 */
public class Guppy extends Fish{
    /**
     * Cunstructor to create a new guppy. Super constructor of fishes is called.
     * both input String type
     * @param name name
     * @param owner owner name 
     * @throws Exception
     */
    public Guppy(String name, String owner, String type) throws Exception{
        super(name, owner, type);
    }
    /**
     * Method that let's the guppy swims
     * @return 
     */
    public String swim() {
        System.out.println("swimming in circles ");
        return "swimming in circles ";
    }



}
