
/***
 * classe fishes is childclass of pet and has a input String Name and owner name
 * and has 2 functions and a cunstructur
 */
public abstract class Fish extends Pet {
    /**
     * Cunstructor to create a new fish. Super constructor of Pet is called.
     * both input String type
     * 
     * @param name  name
     * @param owner owner name
     * @throws Exception if creation of fish wasnt sucsessful this will show up
     */
    public Fish(String name, String owner) throws Exception {
        super(name, owner);
    }

    /**
     * shows what u need for fish care
     * it calls a change water function
     */
    public String careFor() {
        changeWater();
        String reurn = changeWater();
        return reurn;
    }

    /**
     * Method that let's the fish swim
     */
    public abstract String swim();

    /**
     * function prints care for fishes
     */
    public String changeWater() {
        System.out.println("change water");
        return "change water";
    }
}
