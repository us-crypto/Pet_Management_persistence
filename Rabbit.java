/***
 * classe rabbit is childclass of mammals and has a input String Name and owner name and has 2 functions and a cunstructur
 */
public class Rabbit extends Mammal{
    /**
     * Cunstructor to create a new rabbit. Super constructor of mammals is called.
     * both input String type
     * @param name name
     * @param owner owner name 
     */
    public Rabbit(String name , String owner){
        super( name ,  owner);
    }
    /**shows what u need for rabbit care 
     * text function no parameter no return
     */
    public void careFor() {
        System.out.println("clean their barn");
    }
    /**Method that let's the rabbit walk
     * text function no parameter no return
     */
    public void walk() {
        System.out.println("jumping ");
    }
}
