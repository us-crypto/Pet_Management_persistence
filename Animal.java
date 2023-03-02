interface Animal {
    /**
     * 
     * @return String name of animal
     */
    String getName();
    /**
     * 
     * @param string String name of animal
     */
    void setName(String string);
    /**
     * 
     * @return String owner name
     */
    String getOwner();
    /**
     * 
     * @param string String name of owner 
     */
    void setOwner(String string);
    /**
     * 
     * @return type of created animal
     */
    String getType();
    /**
     * 
     * @param string String type of animal
     */
    void setType(String string);
    /**
     * 
     * @return String care for needed for animal
     */
    String careFor();

    
}
