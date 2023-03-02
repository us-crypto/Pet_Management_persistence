import java.lang.Exception;

public class Cat extends Mammal {
    /**
     * Cunstructor to create a new cat. Super constructor of mammal is called.
     * both input String type
     * 
     * @param name  String name
     * @param owner owner name
     * @throws Exception if creation of Cat wasnt sucsessful this will show up
     */
    public Cat(String name, String owner) throws Exception {
        super(name, owner);
        setType("Cat");

    }

    /**
     * text function no parameter no return
     * shows what un eed to care about cat
     * @return String care for specific animal
     */
    public String careFor() {
        System.out.println("brush their fur");
        return "brush their fur";
    }

    /**
     * text function no parameter no return
     * shows how a cat walks
     * 
     * @return String the walk method
     */
    public String walk() {
        System.out.println("sneaking ");
        return "sneaking";
    }

}
