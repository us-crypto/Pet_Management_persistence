

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.InputMismatchException;

import org.junit.Test;

public class unitTest {

        @Test
        public void catWrongInputTest() throws Exception{
        
            

            assertThrows(ShortPetNameException.class , () -> {
                Pet a = new Cat("","xxcvxcv");
            });
            assertThrows(ShortPetNameException.class , () -> {
                Pet a = new Cat("","");
            });
            assertThrows(ShortOwnerNameException.class , () -> {
                Pet a = new Cat("22","");
            });

        }
        @Test
        public void catInstanceTest() throws Exception {
            String petName ="ffff";
            String ownerName="ssss";
            Pet a = new Cat(petName,ownerName);
            assertEquals("test of Cat Obj",true, a instanceof Cat);
        }
        @Test
        public void catGetterTest() throws Exception {
            String petName ="ffff";
            String ownerName="ssss";
            Pet a = new Cat(petName,ownerName);
            assertEquals("pet name checker", petName, a.getName());
        }
        @Test
        public void catOwnerGetterTest() throws Exception {
            String petName ="ffff";
            String ownerName="ssss";
            Pet a = new Cat(petName,ownerName);
            assertEquals("owner name checker", ownerName, a.getOwner());
        }
        @Test
        public void catTypeTester() throws Exception {
            String petName ="ffff";
            String ownerName="ssss";
            Pet a = new Cat(petName,ownerName);
            assertEquals("pet type checker", Cat.class.getName(), a.getType());
        }
        @Test
        public void ownerSetterTester() throws Exception {
            String petName ="ffff";
            String ownerName="ssss";
            String ownerName2="ownerName2";
            Pet a = new Cat(petName,ownerName);
            a.setOwner(ownerName2);
            assertEquals("owner name checker 2", ownerName2, a.getOwner());

        }
        @Test
        public void catPetSetterTester() throws Exception {
            String petName ="ffff";
            String ownerName="ssss";
            String petName2 ="petName2";
            Pet a = new Cat(petName,ownerName);
            a.setName(petName2);
            a.setType("Dog");
            assertEquals("pet name checker 2", petName2, a.getName());
        }
        @Test
        public void catTypeSetterTest() throws Exception {
            String petName ="ffff";
            String ownerName="ssss";
            Pet a = new Cat(petName,ownerName);
            a.setType("Dog");
            assertEquals("pet type checker 2", "Dog", a.getType());
            assertEquals("brush their fur", a.careFor());
            Cat vvv=new Cat("aaaa","aaaa");
            assertEquals("sneaking", vvv.walk());
        }
        @Test
        public void catTypeGetterTest() throws Exception {
            String petName ="ffff";
            String ownerName="ssss";
            Pet a = new Cat(petName,ownerName);
            assertEquals("pet type checker 2", "Dog", a.getType());
        }
        @Test
        public void catCareForTester() throws Exception {
            String petName ="ffff";
            String ownerName="ssss";
            Pet a = new Cat(petName,ownerName);
            assertEquals("brush their fur", a.careFor());
        }
        @Test
        public void catWalkTester() throws Exception {
            Cat vvv=new Cat("aaaa","aaaa");
            assertEquals("sneaking", vvv.walk());
        }




        public void goldFishTest() throws Exception {
            String petName ="ffff";
            String ownerName="ssss";           
            String petName2 ="petName2";
            String ownerName2="ownerName2";
            assertThrows(ShortPetNameException.class , () -> {
                Pet test22= new Goldfish("","xxcvxcv");
            });
            assertThrows(ShortPetNameException.class , () -> {
                Pet test22= new Goldfish("","");
            });
            assertThrows(ShortOwnerNameException.class , () -> {
                Pet test22= new Goldfish("22","");
            });
            Pet test2= new Goldfish(petName,ownerName);
            assertEquals("test of Goldfish Obj",true , test2 instanceof Goldfish);
            assertEquals("pet name checker", petName, test2.getName());
            assertEquals("owner name checker", ownerName, test2.getOwner());
            assertEquals("pet type checker", "Goldfish", test2.getType());
            test2.setName(petName2);
            test2.setOwner(ownerName2);
            test2.setType("Dog");
            assertEquals("owner name checker 2", ownerName2, test2.getOwner());
            assertEquals("pet name checker 2", petName2, test2.getName());
            assertEquals("pet type checker 2", "Dog", test2.getType());
            assertEquals("change water", test2.careFor());
            Goldfish hhh=new Goldfish("aaaa","aaaa");
            assertEquals("change water", hhh.changeWater());




        }
        public void guppyTest() throws Exception {
            
            String petName ="ffff";
            String ownerName="ssss";           
            String petName2 ="petName2";
            String ownerName2="ownerName2";
            assertThrows(ShortPetNameException.class , () -> {
                Pet test3= new Guppy("","xxcvxcv");
            });
            assertThrows(ShortPetNameException.class , () -> {
                Pet test3= new Guppy("","");
            });
            assertThrows(ShortOwnerNameException.class , () -> {
                Pet test3= new Guppy("22","");
            });
            
            Pet test3= new Guppy(petName,ownerName);
            assertEquals("test of Guppy Obj",true, test3 instanceof Guppy);
            assertEquals("pet name checker", petName, test3.getName());
            assertEquals("owner name checker", ownerName, test3.getOwner());
            assertEquals("pet type checker", Guppy.class.getName(), test3.getType());
            test3.setName(petName2);
            test3.setOwner(ownerName2);
            test3.setType("Dog");
            assertEquals("owner name checker 2", ownerName2, test3.getOwner());
            assertEquals("pet name checker 2", petName2, test3.getName());
            assertEquals("pet type checker 2", "Dog", test3.getType());
            assertEquals("change water", test3.careFor());

            Guppy ggg=new Guppy("aaaa","aaaa");
            assertEquals("change water", ggg.changeWater());



        }
        public void Rabbit() throws Exception {
            String petName ="ffff";
            String ownerName="ssss";           
            String petName2 ="petName2";
            String ownerName2="ownerName2";
            assertThrows(ShortPetNameException.class , () -> {
                Pet test4= new Rabbit("","xxcvxcv");
            });
            assertThrows(ShortPetNameException.class , () -> {
                Pet test4= new Rabbit("","");
            });
            assertThrows(ShortOwnerNameException.class , () -> {
                Pet test4= new Rabbit("22","");
            });
            
            Pet test4= new Rabbit(petName,ownerName);
            assertEquals("test of Rabbit Obj",true , test4 instanceof Rabbit);
            assertEquals("pet name checker", petName, test4.getName());
            assertEquals("owner name checker", ownerName, test4.getOwner());
            assertEquals("pet type checker", "Rabbit", test4.getType());
            test4.setName(petName2);
            test4.setOwner(ownerName2);
            test4.setType("Dog");
            assertEquals("owner name checker 2", ownerName2, test4.getOwner());
            assertEquals("pet name checker 2", petName2, test4.getName());
            assertEquals("pet type checker 2", "Dog", test4.getType());
            assertEquals("clean their barn", test4.careFor());
            Rabbit bbb=new Rabbit("aaaa","aaaa");
            assertEquals("walk", bbb.walk());
        }
}

