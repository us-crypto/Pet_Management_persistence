
public class testInterface{
    public static void main(String[] args) {
        Animal test = new Rabbit("aaa","dddd");
        System.out.println("getname "+ test.getName());
        test.setName("String name");
        System.out.println("get name String "+ test.getName());
        System.out.println("get owner " + test.getOwner());
        test.setOwner("String owner");
        System.out.println("get owner String " + test.getOwner());
        test.careFor();

        if (test instanceof Rabbit)
     {
        
     }

        


        Animal test2 = new Goldfish("hhhh","bbbbb");
        System.out.println("getname "+ test2.getName());
        test2.setName("String name");
        System.out.println("get name String "+ test2.getName());
        System.out.println("get owner " + test2.getOwner());
        test2.setOwner("String owner");
        System.out.println("get owner String " + test2.getOwner());
        test2.careFor();

    }

}
