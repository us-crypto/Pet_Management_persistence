/**
 * interface of A nimal with all required functions 
 */
interface Animal {
    /**
     * getter of animal name
     * 
     * @return String name of animal
     */
    String getName();

    /**
     * setter of animal name
     * 
     * @param string String name of animal
     */
    void setName(String string);

    /**
     * getter of owner
     * 
     * @return String owner name
     */
    String getOwner();

    /**
     * setter of owner
     * 
     * @param string String name of owner
     */
    void setOwner(String string);

    /**
     * getter of animal type
     * 
     * @return type of created animal
     */
    String getType();

    /**
     * setter of animal type
     * 
     * @param string String type of animal
     */
    void setType(String string);

    /**
     * action needed to care for specific animal
     * 
     * @return String care for needed for animal
     */
    String careFor();

}
