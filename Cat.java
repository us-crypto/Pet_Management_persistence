import java.lang.Exception;
public class Cat extends Mammal {
    /**
     * Cunstructor to create a new cat. Super constructor of mammal is called.
     * both input String type
     * @param name String name
     * @param owner owner name 
     * @throws Exception
     */
    public Cat(String name, String owner) throws Exception{
        super(name, owner);
        checker(name, owner);
    }
    /**
     * text function no parameter no return
     * shows what un eed to care about cat
     */
    public void careFor() {
        System.out.println("brush their fur");
    }
    /**
     * text function no parameter no return
     * shows how a cat walks
     */
    public void walk() {
        System.out.println("sneaking ");
    }
    public void checker(String name, String owner) throws Exception {
        if (name.length()<1) {
            throw new Exception ("pet name is too short");
        }
        if (owner.length()<1) {
            throw new NullPointerException ("owner name is too short");
        }
    }
}
