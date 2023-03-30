
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.google.gson.JsonSyntaxException;

public class advanced {
    
    public static void main(String[] args) {
        int choice;
        String owner;
        String petName;
        Scanner scanner=new Scanner(System.in);
        List<Pet> animalList= new ArrayList<Pet>();  
           while (true) {
            
            try {
                System.out.println("choose the functionality:");
                System.out.println("1- create a new Pet");
                System.out.println("2- list all Pets");
                System.out.println("3- delete a pet");
                System.out.println("4- exit");
                System.out.println("5- save the json");
                System.out.println("6- load the json");
                Storage objSave = new Storage();
                
                choice = scanner.nextInt();
                scanner.nextLine();
                
                if (choice==1) {
                    System.out.println("whos the owner ?");
                    owner= scanner.nextLine();
                    System.out.println("what would u like to call ur pet ?");
                    petName= scanner.nextLine();
                        Pet newPet=null;
                        int animal;
                        try {
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
                                    System.out.println("gold fish ? nice choice ");
                                        break;
                                    case 2:
                                    newPet= new Guppy(petName,owner);
                                    System.out.println("guppy ? yea its cool ");
                                        break;
                                    case 3:
                                    newPet= new Rabbit(petName,owner);
                                    System.out.println("Rabbit ? damn messy, wanna live in Stable ? ");
                                        break;
                                    case 4:
                                    newPet= new Cat(petName,owner);
                                    System.out.println("worst choice ever, pay ur money to food and care for something selfish that it eats u if u die :))");
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
                            scanner.nextLine();
                            System.out.println("wrong data input, try again");
                        } catch (NoSuchElementException Exception) {
                            System.out.println("that shit doesnt exist ");
                        }catch (Exception Exception) {
                            System.out.println("something went in object wrong ");
                        }

                    // }

                } else if (choice==2){
                    int count=0;
                    for (Pet pet : animalList) {
                        
                        
                        //System.out.println(animalList.size());
                        System.out.println("position " +count+ " is "+pet.getType() +" called "+ pet.getName()+ " and belongs to "+pet.getOwner()+ " to cared for u need to: ");
                        
                        if (pet instanceof Cat) {
                            Cat cat = (Cat)pet;
                            cat.careFor();
                            System.out.println("moving Style: ");
                            cat.walk();
                        }
                        if (pet instanceof Goldfish) {
                            Goldfish goldfish=(Goldfish)pet;
                            goldfish.careFor();
                            System.out.println("moving Style: ");
                            goldfish.swim();
                        }
                        if (pet instanceof Guppy) {
                            Guppy guppy=(Guppy)pet;
                            guppy.careFor();
                            System.out.println("moving Style: ");
                            guppy.swim();
                            
                        }
                        if (pet instanceof Rabbit) {
                            Rabbit rabbit=(Rabbit)pet;
                            rabbit.careFor();
                            System.out.println("moving Style: ");
                            rabbit.walk();
                        }
                        System.out.println("");
                        count++;
                    }
                } else if(choice==3){
                    System.out.println("which item to be removed ?");
                    int delChoice = scanner.nextInt();
                    scanner.nextLine();
                    animalList.remove(delChoice);
                }else if (choice==4) {
                    break;
                } else if (choice==5) {
                    System.out.println("whats the file name and type ? use . to define type ");
                    String fileName=scanner.nextLine();
                    objSave.saveToFile(fileName,animalList);
                System.out.println("saved to file "+ fileName);
                }else if (choice==6) {
                    animalList= new ArrayList<Pet>();                      
                    System.out.println("write file name and adress of file ");
                    String fileName=scanner.nextLine();
                    animalList=objSave.loadFromFile(fileName);
                    System.out.println("loaded file "+ fileName);
                } else {
                    System.out.println("the valid number range is 1 to 6 ");
                }
            } catch (InputMismatchException Exception) {
                
                System.out.println("input data must be a number try again");
                scanner.nextLine();
            }catch (NoSuchElementException Exception) {
                System.out.println("short names is given for pet or owner ");
            } catch (IOException Exception){
                System.out.println("saving went wrong ");
            }catch(JsonSyntaxException Exception){
                System.out.println("JsonSyntaxException");
            }catch (Exception Exception) {
                System.out.println("something went wrong ");
            }
            
            
        }
        scanner.close();
        System.exit(0);
    }




        
}
