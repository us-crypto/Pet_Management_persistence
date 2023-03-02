/***
 * class goldfish is childclass of fishes and has a input String Name and owner
 * name and has 2 functions and a cunstructur
 */
public class Goldfish extends Fish {
    /**
     * Cunstructor to create a new gold fish. Super constructor of fishes is called.
     * both input String type
     * 
     * @param name  name
     * @param owner owner name
     * @throws Exception if creation of Goldfish wasnt sucsessful this will show up
     */
    public Goldfish(String name, String owner) throws Exception {
        super(name, owner);
        setType("Goldfish");
    }

    /**
     * Method that let's the Goldfish swims
     * text function no parameter no return
     * 
     * @return String moving mode for specific animal
     */
    public String swim() {
        System.out.println("swimming here and there. ");
        return "swimming here and there";
    }

}
