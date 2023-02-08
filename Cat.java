public class Cat extends Mammal {
    /**
     * Cunstructor to create a new cat. Super constructor of mammal is called.
     * both input String type
     * @param name String name
     * @param owner owner name 
     */
    public Cat(String name, String owner){
        super(name, owner);
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
}
