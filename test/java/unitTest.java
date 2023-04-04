
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class unitTest {

    @Test
    public void catWrongInputTest() throws Exception {

        assertThrows(ShortPetNameException.class, () -> {
            Pet a = new Cat("", "xxcvxcv");
        });
        assertThrows(ShortPetNameException.class, () -> {
            Pet a = new Cat("", "");
        });
        assertThrows(ShortOwnerNameException.class, () -> {
            Pet a = new Cat("22", "");
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
    public void catTypeTester() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Pet a = new Cat(petName, ownerName);
        assertEquals("pet type checker", Cat.class.getName(), a.getType());
    }

    @Test
    public void catOwnerSetterTester() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        String ownerName2 = "ownerName2";
        Pet a = new Cat(petName, ownerName);
        a.setOwner(ownerName2);
        assertEquals("owner name checker 2", ownerName2, a.getOwner());

    }

    @Test
    public void catPetSetterTester() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        String petName2 = "petName2";
        Pet a = new Cat(petName, ownerName);
        a.setName(petName2);
        a.setType("Dog");
        assertEquals("pet name checker 2", petName2, a.getName());
    }

    @Test
    public void catTypeSetterTest() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Pet a = new Cat(petName, ownerName);
        a.setType("Dog");
        assertEquals("pet type checker 2", "Dog", a.getType());
        assertEquals("brush their fur", a.careFor());
        Cat vvv = new Cat("aaaa", "aaaa");
        assertEquals("sneaking", vvv.walk());
    }

    @Test
    public void catTypeGetterTest() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Pet a = new Cat(petName, ownerName);
        assertEquals("pet type checker 2", Cat.class.getName(), a.getType());
    }

    @Test
    public void catCareForTester() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Pet a = new Cat(petName, ownerName);
        assertEquals("brush their fur", a.careFor());
    }

    @Test
    public void catWalkTester() throws Exception {
        Cat vvv = new Cat("aaaa", "aaaa");
        assertEquals("sneaking", vvv.walk());
    }

    @Test
    public void goldfishWrongInputTest() throws Exception {


        assertThrows(ShortPetNameException.class, () -> {
            Pet test22 = new Goldfish("", "xxcvxcv");
        });
        assertThrows(ShortPetNameException.class, () -> {
            Pet test22 = new Goldfish("", "");
        });
        assertThrows(ShortOwnerNameException.class, () -> {
            Pet test22 = new Goldfish("22", "");
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
    public void goldfishTypeTester() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";

        Pet test2 = new Goldfish(petName, ownerName);
        assertEquals("pet type checker", Goldfish.class.getName(), test2.getType());
    }

    @Test
    public void goldfishownerSetterTester() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        String ownerName2 = "ownerName2";
        Pet test2 = new Goldfish(petName, ownerName);
        test2.setOwner(ownerName2);
        assertEquals("owner name checker 2", ownerName2, test2.getOwner());

    }

    @Test
    public void goldfishPetSetterTester() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        String petName2 = "petName2";
        Pet test2 = new Goldfish(petName, ownerName);
        test2.setName(petName2);
        test2.setType("Dog");
        assertEquals("pet name checker 2", petName2, test2.getName());
    }

    @Test
    public void goldfishTypeSetterTest() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Pet test2 = new Goldfish(petName, ownerName);
        test2.setType("Dog");
        assertEquals("pet type checker 2", "Dog", test2.getType());
    }

    @Test
    public void goldfishTypeGetterTest() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Pet test2 = new Goldfish(petName, ownerName);
        test2.setType("Dog");
        assertEquals("pet type checker 2", "Dog", test2.getType());
    }

    @Test
    public void goldfishCareForTester() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Pet test2 = new Goldfish(petName, ownerName);
        assertEquals("change water", test2.careFor());
    }

    @Test
    public void goldfishWalkTester() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Goldfish test2 = new Goldfish(petName, ownerName);
        assertEquals("change water", test2.changeWater());
    }

    @Test
    public void guppyWrongInputTest() throws Exception {

        assertThrows(ShortPetNameException.class, () -> {
            Pet test22 = new Guppy("", "xxcvxcv");
        });
        assertThrows(ShortPetNameException.class, () -> {
            Pet test22 = new Guppy("", "");
        });
        assertThrows(ShortOwnerNameException.class, () -> {
            Pet test22 = new Guppy("22", "");
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
    public void guppyTypeTester() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Pet test2 = new Guppy(petName, ownerName);
        assertEquals("pet type checker", Guppy.class.getName(), test2.getType());
    }

    @Test
    public void guppyownerSetterTester() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        String ownerName2 = "ownerName2";
        Pet test2 = new Guppy(petName, ownerName);
        test2.setOwner(ownerName2);
        assertEquals("owner name checker 2", ownerName2, test2.getOwner());

    }

    @Test
    public void guppyPetSetterTester() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        String petName2 = "petName2";
        Pet test2 = new Guppy(petName, ownerName);
        test2.setName(petName2);
        test2.setType("Dog");
        assertEquals("pet name checker 2", petName2, test2.getName());
    }

    @Test
    public void guppyTypeSetterTest() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Pet test2 = new Guppy(petName, ownerName);
        test2.setType("Dog");
        assertEquals("pet type checker 2", "Dog", test2.getType());
    }

    @Test
    public void guppyTypeGetterTest() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Pet test2 = new Guppy(petName, ownerName);
        test2.setType("Dog");
        assertEquals("pet type checker 2", "Dog", test2.getType());
    }

    @Test
    public void guppyCareForTester() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Pet test2 = new Guppy(petName, ownerName);
        assertEquals("change water", test2.careFor());
    }

    @Test
    public void guppyWalkTester() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Guppy test2 = new Guppy(petName, ownerName);
        assertEquals("change water", test2.changeWater());
    }




    @Test
    public void rabbitWrongInputTest() throws Exception {
    
        assertThrows(ShortPetNameException.class, () -> {
            Pet test22 = new Rabbit("", "xxcvxcv");
        });
        assertThrows(ShortPetNameException.class, () -> {
            Pet test22 = new Rabbit("", "");
        });
        assertThrows(ShortOwnerNameException.class, () -> {
            Pet test22 = new Rabbit("22", "");
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
    public void rabbitTypeTester() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Pet test2 = new Rabbit(petName, ownerName);
        assertEquals("pet type checker", Rabbit.class.getName(), test2.getType());
    }
    
    @Test
    public void rabbitownerSetterTester() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        String ownerName2 = "ownerName2";
        Pet test2 = new Rabbit(petName, ownerName);
        test2.setOwner(ownerName2);
        assertEquals("owner name checker 2", ownerName2, test2.getOwner());
    
    }
    
    @Test
    public void rabbitPetSetterTester() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        String petName2 = "petName2";
        Pet test2 = new Rabbit(petName, ownerName);
        test2.setName(petName2);
        test2.setType("Dog");
        assertEquals("pet name checker 2", petName2, test2.getName());
    }
    
    @Test
    public void rabbitTypeSetterTest() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Pet test2 = new Rabbit(petName, ownerName);
        test2.setType("Dog");
        assertEquals("pet type checker 2", "Dog", test2.getType());
    }
    
    @Test
    public void rabbitTypeGetterTest() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Pet test2 = new Rabbit(petName, ownerName);
        test2.setType("Dog");
        assertEquals("pet type checker 2", "Dog", test2.getType());
    }
    
    @Test
    public void rabbitCareForTester() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Pet test2 = new Rabbit(petName, ownerName);
        assertEquals("clean their barn", test2.careFor());
    }
    
    @Test
    public void rabbitWalkTester() throws Exception {
        String petName = "ffff";
        String ownerName = "ssss";
        Rabbit test2 = new Rabbit(petName, ownerName);
        assertEquals("jumping ", test2.walk());
    }
    
}
