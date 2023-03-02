


public class WrongJsonDataException extends Exception{
    /**
     * if a json isnt made on this form we accsept in this app, we get a error
     * @param message exception input String to be shown as exception message 
     */
    public WrongJsonDataException(String message)  {
        super(message);
    }
}
