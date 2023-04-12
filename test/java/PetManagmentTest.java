
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PetManagmentTest {

    @Test
    public void catWrongInputTest() throws Exception {

        assertThrows(ShortPetNameException.class, () -> {
           new Cat("", "xxcvxcv");
        });
        assertThrows(ShortPetNameException.class, () -> {
            new Cat("", "");
        });
        assertThrows(ShortOwnerNameException.class, () -> {
            new Cat("22", "");
        });

    }

    @Test
    public void catInstanceTest() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Pet a = new Cat(petName, ownerName);
        assertEquals("test of Cat Obj", true, a instanceof Cat);
    }

    @Test
    public void catGetterTest() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Pet a = new Cat(petName, ownerName);
        assertEquals("pet name checker", petName, a.getName());
    }

    @Test
    public void catOwnerGetterTest() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Pet a = new Cat(petName, ownerName);
        assertEquals("owner name checker", ownerName, a.getOwner());
    }

    @Test
    public void catTypeTest() throws Exception { //GEB: "Test" instead of "Test"
        String petName = "ffff";
        String ownerName = "ssss";
        Pet a = new Cat(petName, ownerName);
        assertEquals("pet type checker", Cat.class.getName(), a.getType());
    }

    @Test
    public void catOwnerSetterTest() throws Exception { //GEB: "Test" instead of "Test"
        String petName = "ffff";
        String ownerName = "ssss";
        String ownerName2 = "ownerName2";
        Pet a = new Cat(petName, ownerName);
        a.setOwner(ownerName2);
        assertEquals("owner name checker 2", ownerName2, a.getOwner());

    }

    @Test
    public void catNameSetterTest() throws Exception { //GEB: "Test" instead of "Test"
        String petName = "ffff";
        String ownerName = "ssss";
        String petName2 = "petName2";
        Pet a = new Cat(petName, ownerName);
        a.setName(petName2);
        assertEquals("pet name checker 2", petName2, a.getName());
    }

 

    @Test
    public void catTypeGetterTest() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Pet a = new Cat(petName, ownerName);
        assertEquals("pet type checker 2", Cat.class.getName(), a.getType());
    }

    @Test
    public void catCareForTest() throws Exception { //GEB: "Test" instead of "Test"
        String petName = "ffff";
        String ownerName = "ssss";
        Pet a = new Cat(petName, ownerName);
        assertEquals("brush their fur", a.careFor());
    }

    @Test
    public void catWalkTest() throws Exception { //GEB: "Test" instead of "Test"
        Cat vvv = new Cat("aaaa", "aaaa");
        assertEquals("sneaking", vvv.walk());
    }

    @Test
    public void goldfishWrongInputTest() throws Exception {


        assertThrows(ShortPetNameException.class, () -> {
            new Goldfish("", "xxcvxcv");
        });
        assertThrows(ShortPetNameException.class, () -> {
            new Goldfish("", "");
        });
        assertThrows(ShortOwnerNameException.class, () -> {
            new Goldfish("22", "");
        });

    }

    @Test
    public void goldfishInstanceTest() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Pet test2 = new Goldfish(petName, ownerName);
        assertEquals("test of Goldfish Obj", true, test2 instanceof Goldfish);

    }

    @Test
    public void goldfishGetterTest() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Pet test2 = new Goldfish(petName, ownerName);
        assertEquals("pet name checker", petName, test2.getName());
    }

    @Test
    public void goldfishOwnerGetterTest() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Pet test2 = new Goldfish(petName, ownerName);
        assertEquals("owner name checker", ownerName, test2.getOwner());
    }

    @Test
    public void goldfishTypeTest() throws Exception { //GEB: Naming diffent from Cat //GEB: "Test" instead of "Test"
        String petName = "ffff";
        String ownerName = "ssss";

        Pet test2 = new Goldfish(petName, ownerName);
        assertEquals("pet type checker", Goldfish.class.getName(), test2.getType());
    }

    @Test
    public void goldfishOwnerSetterTest() throws Exception { //GEB: "Test" instead of "Test"
        String petName = "ffff";
        String ownerName = "ssss";
        String ownerName2 = "ownerName2";
        Pet test2 = new Goldfish(petName, ownerName);
        test2.setOwner(ownerName2);
        assertEquals("owner name checker 2", ownerName2, test2.getOwner());

    }

    @Test
    public void goldfishNameSetterTest() throws Exception { //GEB: Pet in the name of the method //GEB: "Test" instead of "Test" , Pet in the method name
        String petName = "ffff";
        String ownerName = "ssss";
        String petName2 = "petName2";
        Pet test2 = new Goldfish(petName, ownerName);
        test2.setName(petName2);
        assertEquals("pet name checker 2", petName2, test2.getName());
    }

 

    @Test
    public void goldfishTypeGetterTest() throws Exception { //GEB: Duplicate from Line 147 (goldfishTypeTest)
        String petName = "ffff";
        String ownerName = "ssss";
        Pet test2 = new Goldfish(petName, ownerName);
        assertEquals("pet type checker 2", "Goldfish", test2.getType());
    }

    @Test
    public void goldfishCareForTest() throws Exception { //GEB: "Test" instead of "Test"
        String petName = "ffff";
        String ownerName = "ssss";
        Pet test2 = new Goldfish(petName, ownerName);
        assertEquals("change water", test2.careFor());
    }

    @Test
    public void goldfishSwimTest() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Goldfish test2 = new Goldfish(petName, ownerName);
        assertEquals("swimming here and there.", test2.swim());
    }


    @Test
    public void guppyWrongInputTest() throws Exception { // unused variables

        assertThrows(ShortPetNameException.class, () -> {
            new Guppy("", "xxcvxcv");
        });
        assertThrows(ShortPetNameException.class, () -> {
            new Guppy("", "");
        });
        assertThrows(ShortOwnerNameException.class, () -> {
            new Guppy("22", "");
        });

    }

    @Test
    public void guppyInstanceTest() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Pet test2 = new Guppy(petName, ownerName);
        assertEquals("test of Guppy Obj", true, test2 instanceof Guppy);

    }

    @Test
    public void guppyGetterTest() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Pet test2 = new Guppy(petName, ownerName);
        assertEquals("pet name checker", petName, test2.getName());
    }

    @Test
    public void guppyOwnerGetterTest() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Pet test2 = new Guppy(petName, ownerName);
        assertEquals("owner name checker", ownerName, test2.getOwner());
    }

    @Test
    public void guppyTypeTest() throws Exception { //GEB: "Test" instead of "Test"
        String petName = "ffff";
        String ownerName = "ssss";
        Pet test2 = new Guppy(petName, ownerName);
        assertEquals("pet type checker", Guppy.class.getName(), test2.getType());
    }

    @Test
    public void guppyOwnerSetterTest() throws Exception { //GEB: "Test" instead of "Test"
        String petName = "ffff";
        String ownerName = "ssss";
        String ownerName2 = "ownerName2";
        Pet test2 = new Guppy(petName, ownerName);
        test2.setOwner(ownerName2);
        assertEquals("owner name checker 2", ownerName2, test2.getOwner());

    }

    @Test
    public void guppyNameSetterTest() throws Exception { //GEB: "Test" instead of "Test", Pet in the method name
        String petName = "ffff";
        String ownerName = "ssss";
        String petName2 = "petName2";
        Pet test2 = new Guppy(petName, ownerName);
        test2.setName(petName2);
        assertEquals("pet name checker 2", petName2, test2.getName());
    }


    @Test
    public void guppyTypeGetterTest() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Pet test2 = new Guppy(petName, ownerName);
        assertEquals("pet type checker 2", "Guppy", test2.getType());
    }

    @Test
    public void guppyCareForTest() throws Exception { //GEB: "Test" instead of "Test"
        String petName = "ffff";
        String ownerName = "ssss";
        Pet test2 = new Guppy(petName, ownerName);
        assertEquals("change water", test2.careFor());
    }

    @Test
    public void guppySwimTest() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Guppy test2 = new Guppy(petName, ownerName);
        assertEquals("swimming in circles ", test2.swim());
    }



    @Test
    public void rabbitWrongInputTest() throws Exception {
    
        assertThrows(ShortPetNameException.class, () -> {
            new Rabbit("", "xxcvxcv");
        });
        assertThrows(ShortPetNameException.class, () -> {
            new Rabbit("", "");
        });
        assertThrows(ShortOwnerNameException.class, () -> {
            new Rabbit("22", "");
        });
    
    }
    
    @Test
    public void rabbitInstanceTest() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Pet test2 = new Rabbit(petName, ownerName);
        assertEquals("test of Rabbit Obj", true, test2 instanceof Rabbit);
    
    }
    
    @Test
    public void rabbitGetterTest() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Pet test2 = new Rabbit(petName, ownerName);
        assertEquals("pet name checker", petName, test2.getName());
    }
    
    @Test
    public void rabbitOwnerGetterTest() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Pet test2 = new Rabbit(petName, ownerName);
        assertEquals("owner name checker", ownerName, test2.getOwner());
    }
    
    @Test
    public void rabbitTypeTest() throws Exception { //GEB: "Test" instead of "Test"
        String petName = "ffff";
        String ownerName = "ssss";
        Pet test2 = new Rabbit(petName, ownerName);
        assertEquals("pet type checker", Rabbit.class.getName(), test2.getType());
    }
    
    @Test
    public void rabbitOwnerSetterTest() throws Exception { //GEB: "Test" instead of "Test"
        String petName = "ffff";
        String ownerName = "ssss";
        String ownerName2 = "ownerName2";
        Pet test2 = new Rabbit(petName, ownerName);
        test2.setOwner(ownerName2);
        assertEquals("owner name checker 2", ownerName2, test2.getOwner());
    
    }
    
    @Test
    public void rabbitNameSetterTest() throws Exception { //GEB: "Test" instead of "Test" , Pet in the method name
        String petName = "ffff";
        String ownerName = "ssss";
        String petName2 = "petName2";
        Pet test2 = new Rabbit(petName, ownerName);
        test2.setName(petName2);
        assertEquals("pet name checker 2", petName2, test2.getName());
    }
    

    @Test
    public void rabbitTypeGetterTest() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Pet test2 = new Rabbit(petName, ownerName);
        assertEquals("pet type checker 2", "Rabbit", test2.getType());
    }
    
    @Test
    public void rabbitCareForTest() throws Exception { //GEB: "Test" instead of "Test"
        String petName = "ffff";
        String ownerName = "ssss";
        Pet test2 = new Rabbit(petName, ownerName);
        assertEquals("clean their barn", test2.careFor());
    }
    
    @Test
    public void rabbitWalkTest() throws Exception { //GEB: "Test" instead of "Test"
        String petName = "ffff";
        String ownerName = "ssss";
        Rabbit test2 = new Rabbit(petName, ownerName);
        assertEquals("jumping ", test2.walk());
    }

    @Test
    public void testCompleteForLoop() throws Exception { 
        String adress="C:\\xampp\\htdocs\\Dev\\repos\\Pet_Management_persistence\\test\\java\\";
        Storage a = new Storage();
        List<Pet> animalList= new ArrayList<Pet>(); 
        animalList.add(new Rabbit("petNameR", "ownerNameR"));
        animalList.add(new Cat("petNameC", "ownerNameC"));
        animalList.add(new Guppy("petNameG", "ownerNameG"));
        animalList.add(new Goldfish("petNameGo", "ownerNameGo"));
        int sizeSend=animalList.size();
        a.saveToFile(adress, "a.json", animalList);
        List<Pet> loadList=a.loadFromFile(adress, "a.json");
        int sizeReceived=loadList.size();
        int i =0;
        for (Pet pet : loadList) {
            String savedPet = pet.getOwner();
            String loadedPet=animalList.get(i).getOwner();
            assertEquals(savedPet,loadedPet);

            String savedOwner = pet.getName();
            String loadedOwner=animalList.get(i).getName();
            assertEquals(savedOwner,loadedOwner);

            String savedType = pet.getType();
            String loadedType=animalList.get(i).getType();
            assertEquals(savedType,loadedType);
            i++;
        }
        assertEquals("length test", sizeReceived, sizeSend);

    }
}
