/***
 * class rabbit is childclass of mammals and has a input String Name and owner
 * name and has 2 functions and a cunstructur
 */
public class Rabbit extends Mammal {
    /**
     * Cunstructor to create a new rabbit. Super constructor of mammals is called.
     * both input String type
     * 
     * @param name  name
     * @param owner owner name
     * @throws Exception if creation of Rabbit wasnt sucsessful this will show up
     */
    public Rabbit(String name, String owner) throws Exception {
        super(name, owner);
        setType("Rabbit");
    }

    /**
     * shows what u need for rabbit care
     * text function no parameter no return
     * @return caring mode of specific animal
     */
    public String careFor() {
        System.out.println("clean their barn");
        return "clean their barn";
    }

    /**
     * Method that let's the rabbit walk
     * text function no parameter no return
     * 
     * @return moving mode of specific animal
     */
    public String walk() {
        System.out.println("jumping ");
        return "jumping ";
    }

}
