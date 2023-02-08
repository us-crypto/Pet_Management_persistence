/***
 * classe goldfish is childclass of fishes and has a input String Name and owner name and has 2 functions and a cunstructur
 */
public class Goldfish extends Fish{
    /**
     * Cunstructor to create a new gold fish. Super constructor of fishes is called.
     * both input String type
     * @param name name
     * @param owner owner name 
     */
    public Goldfish(String name , String owner){
        super( name ,  owner);
        //        super("aaaaa","sssss");  
    }

    /**Method that let's the guppy swims
     * text function no parameter no return
     */
    public void swim() {
        System.out.println("swimming here and there. ");
        //super.swim();
    }
}
