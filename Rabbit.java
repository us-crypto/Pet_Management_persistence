/***
 * classe rabbit is childclass of mammals and has a input String Name and owner name and has 2 functions and a cunstructur
 */
public class Rabbit extends Mammal{
    /**
     * Cunstructor to create a new rabbit. Super constructor of mammals is called.
     * both input String type
     * @param name name
     * @param owner owner name 
     * @throws Exception
     */
    public Rabbit(String name, String owner, String type) throws Exception{
        super(name, owner, type);
    }
    /**shows what u need for rabbit care 
     * text function no parameter no return
     */
    public String careFor() {
        System.out.println("clean their barn");
        return "clean their barn";
    }
    /**Method that let's the rabbit walk
     * text function no parameter no return
     * @return 
     */
    public String walk() {
        System.out.println("jumping ");
        return "jumping ";
    }


}
