
/**
 * Write a description of class JoinGroupPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JoinGroupPost extends Post
{
    // instance variables - replace the example below with your own
    private String group;

    /**
     * Constructor for objects of class JoinGroupPost
     */
    public JoinGroupPost(String author, String group)
    {
        super(author);
        this.group = group;
    }

    /**
     * Print the message to joined
     */
    public void messageToJoin(){
        System.out.println("The user " + getUsername() + " has join to group " + group + ".");
    }
}