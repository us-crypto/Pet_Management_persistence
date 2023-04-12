
/***
 * class fishes is childclass of pet and has a input String Name and owner name
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
    public Fish(String name, String owner, String test) throws Exception {
        super(name, owner,test);
    }

    /**
     * Cunstructor to create a new fish. Super constructor of Pet is called.
     * both input String type
     * 
     * @return String care for specific animal 
     */
    public String careFor() {
        
        String reurn = changeWater();
        return reurn;
    }

    /**
     * Method that let's the fish swim
     * @return String moving mode for specific animal
     */
    public abstract String swim();

    /**
     * function prints care for fishes
     * @return String care for things for specific animal
     */
    public String changeWater() {
        return "change water";
    }
}
