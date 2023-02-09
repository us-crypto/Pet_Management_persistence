

/***
 * classe fishes is childclass of pet and has a input String Name and owner name and has 2 functions and a cunstructur
 */
public abstract class Fish extends Pet{
    /**
     * Cunstructor to create a new fish. Super constructor of Pet is called.
     * both input String type
     * @param name name
     * @param owner owner name 
     */
    public Fish(String name , String owner){
        super( name ,  owner);
    }
    /**shows what u need for fish care 
     * it calls a change water function
     */
    public void careFor() {
        System.out.println("fishes: ");
        changeWater();
    } 
    /**
     * Method that let's the fish swim
     */
    public void swim() {
        System.out.println("fishes:  ");
    }

    /**
     * function prints care for fishes
     */
    public void changeWater() {
        System.out.println("change water");
    }
}

