/***
 * classe goldfish is childclass of fishes and has a input String Name and owner name and has 2 functions and a cunstructur
 */
public class Goldfish extends Fish{
    /**
     * Cunstructor to create a new gold fish. Super constructor of fishes is called.
     * both input String type
     * @param name name
     * @param owner owner name 
     * @throws Exception
     */
    public Goldfish(String name , String owner) throws Exception{
        super( name ,  owner);
        //        super("aaaaa","sssss");  
        checker(name, owner);
    }

    /**Method that let's the guppy swims
     * text function no parameter no return
     */
    public void swim() {
        System.out.println("swimming here and there. ");
        //super.swim();
    }

    public void checker(String name, String owner) {
        if (name.length()<1) {
            throw new NullPointerException ("pet name is too short");
        }
        if (owner.length()<1) {
            throw new NullPointerException ("owner name is too short");
        }
    }

}
