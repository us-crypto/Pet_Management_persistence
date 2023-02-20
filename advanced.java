import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class advanced {
    
    public static void main(String[] args) {
        int choice;
        String owner;
        String petName;
        List<Pet> animalList= new ArrayList<Pet>();  
        while (true) {
            Scanner scanner=new Scanner(System.in);
            boolean lock=true;
            try {
                System.out.println("choose the functionality:");
                System.out.println("1- create a new Pet");
                System.out.println("2- list all Pets");
                System.out.println("3-delete a pet");


                

                choice = scanner.nextInt();
                scanner.nextLine();
                
                if (choice==1) {
                    System.out.println("whos the owner ?");
                    owner= scanner.nextLine();
                    System.out.println("what would u like to call ur pet ?");
                    petName= scanner.nextLine();
                    // try {
                        
                    //     if (petName.length()<1) {
                    //         lock=false;
                    //         throw new ShortPet();
                    //     } else {
                    //         for (char charName : petName.toCharArray()) {
                    //             if ((int)charName==32) {
                    //                 lock=false;
                    //                 throw new ShortPet();
                                    
                    //             }
                    //         }
                    //     }
                    // } catch (NoSuchElementException Exception) {
                    //     lock=false;
                    //     System.out.println("no such a element in pet");
                    // } catch (ShortPet exception){
                    //     lock=false;
                    //     System.out.println("pet name is too short ");
                    // }
                    // try {
                        
                    //     if (owner.length()<1) {
                    //         lock=false;
                    //         throw new ShortName();
                    //     } else {
                    //         for (char charNameOwner : owner.toCharArray()) {
                    //             if ((int)charNameOwner==32) {
                    //                 lock=false;
                    //                 throw new ShortName();
                    //             }
                    //         }
                    //     }
                    // } catch (NoSuchElementException Exception) {
                    //     lock=false;
                    //     System.out.println("no such a element in owner");
                    // } catch (ShortName exception){
                    //     lock=false;
                    //     System.out.println("owner name is too short ");
                    // }
                    // if (lock) {
                        Pet newPet=null;
                        try {
                            int animal;
                            
                            do {
                                System.out.println("which Pet is wished to be created ?");
                                System.out.println("1- Gold Fish");
                                System.out.println("2- Guppy");
                                System.out.println("3- Rabbit");
                                System.out.println("4- Cat");
                                animal = scanner.nextInt();
                                scanner.nextLine();
                                
                                switch (animal) {
                                    case 1:
                                    newPet= new Goldfish(petName,owner);
                                        break;
                                    case 2:
                                    newPet= new Guppy(petName,owner);
                                        break;
                                    case 3:
                                    newPet= new Rabbit(petName,owner);
                                        break;
                                    case 4:
                                    newPet= new Cat(petName,owner);
                                        break;
                                    default:
                                        System.out.println("from 1 to 4");
                                        break;
                                }
                            } while (animal<1||animal>4);
                            if (newPet != null) {
                                animalList.add(newPet);
                            }

                        } catch (InputMismatchException Exception) {
                            lock=false;
                            System.out.println("wrong data input, try again");
                        } catch (NoSuchElementException Exception) {
                            lock=false;
                            System.out.println("that shit doesnt exist ");
                        }catch (Exception Exception) {
                            lock=false;
                            System.out.println("something went in object wrong ");
                        }

                    // }
                    
                    


                    
                } else if (choice==2){
                    int count=0;
                    for (Pet pet : animalList) {
                        
                        
                        System.out.println(animalList.size());
                        System.out.println(count+ " is called "+ pet.getName()+ " and belongs to "+pet.getOwner()+ " to cared for u need to: ");
                        pet.careFor();
                        if (pet instanceof Cat) {
                            Cat cat = (Cat)pet;
                            cat.walk();
                        }
                        System.out.println("");
                        count++;
                    }
                } else if(choice==3){
                    System.out.println("which item to be removed ?");
                    int delChoice = scanner.nextInt();
                    scanner.nextLine();
                    animalList.remove(delChoice);
                }else{
                    System.out.println("the valid number range is between 1 to 3 ");
                }
            } catch (InputMismatchException Exception) {
                System.out.println("input data must be a number try again");
            }catch (NoSuchElementException Exception) {
                System.out.println("short names is given for pet or owner ");
            }catch (Exception Exception) {
                System.out.println("something went wrong ");
            }
            
            
           
        }
        
    }
}
