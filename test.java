import java.util.ArrayList;

public class test {

    public static void main(String[] args) {
        ArrayList<Pet> myList = new ArrayList<Pet>();
        
        // Mammal myMammal=new Mammal("12345","56789");
        // myMammal.careFor();
        // myList.add(myMammal);
        
        Mammal myCat= new Cat("12345","56789");
        myCat.careFor();
        myCat.walk();
        myList.add(myCat);

        Mammal myRabbit= new Rabbit("12345","56789");
        myRabbit.careFor();
        myRabbit.walk();
        myList.add(myRabbit);

        // Fish myFish= new Fish("12345","56789");
        // myFish.careFor();
        // myFish.swim();
        // myFish.changeWater();
        // myList.add(myFish);

        Fish myGuppy=new Guppy("12345","56789");
        myGuppy.careFor();
        myGuppy.swim();
        myList.add(myGuppy);

        Fish myGold= new Goldfish("12345","56789");
        myGold.careFor();
        myGold.swim();
        myList.add(myGold);

        // Pet myPet= new Pet("Lexi","mojiOwner");
        // System.out.println("her name is "+ myPet.getName() + " and its owned by "+myPet.getOwner());
        // myPet.careFor();
        // myList.add(myMammal);
        // myList.remove(myMammal);

        for (Pet pet : myList) {
            System.out.println("'" + pet.getName() + "' is owned by " + pet.getOwner());
        }

    }
}
