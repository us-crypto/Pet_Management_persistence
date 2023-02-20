import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class advanced {
    
    public static void main(String[] args) {
        int choice;
        String owner;
        String petName;

        while (true) {
            Scanner scanner=new Scanner(System.in);

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
                    System.out.println("which Pet is wished to be created ?");
                    System.out.println("1- Gold Fish");
                    System.out.println("2- Guppy");
                    System.out.println("3- Rabbit");
                    System.out.println("4- Cat");
                    try {
                        
                        if (petName.length()<1) {
                            
                        } else {
                            for (char charName : petName.toCharArray()) {
                                if ((int)charName==32) {
                                    
                                }
                            }
                        }
                    } catch (NoSuchElementException Exception) {
                        System.out.println("short name is given for pet  ");
                    }
                    try {
                        
                        if (owner.length()<1) {
                            
                        } else {
                            for (char charNameOwner : owner.toCharArray()) {
                                if ((int)charNameOwner==32) {
                                    
                                }
                            }
                        }
                    } catch (NoSuchElementException Exception) {
                        System.out.println("short name is given for owner  ");
                    }
                    try {
                        int animal = scanner.nextInt();
                        scanner.nextLine();
                        Pet newPet;
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
                    } catch (InputMismatchException Exception) {
                        System.out.println("there was a problem in ur input data try again");
                    } catch (NoSuchElementException Exception) {
                        System.out.println("short names is given for pet or owner ");
                    }catch (Exception Exception) {
                        System.out.println("something went in object wrong ");
                    }
                    


                    
                } else if (choice==2){
                    
                } else if(choice==3){

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
