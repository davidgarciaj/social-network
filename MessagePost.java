import java.util.ArrayList;

/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessagePost extends Post
{
    private String message;

    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String author, String text)
    {
        super(author);
        message = text;
    }
    
    /**
     * @return the message
     */
    public String getText(){
        return message;
    }
    
    /**
     * Post to prove
     */
    public void printShortSummary(){
        System.out.println("Esto es un post de texto creado por " + getUsername());
    }
}
