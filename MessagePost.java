import java.util.ArrayList;

/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessagePost
{
    // instance variables - replace the example below with your own
    private String username;
    private String message;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String author, String text)
    {
        username = author;
        message = text;
        timestamp = System.currentTimeMillis();
        likes = 0;
        comments = new ArrayList<>();
    }

    /**
     * Add a like
     *
     */
    public void like()
    {
        likes++;
    }

    /**
     * Drop a like
     *
     */
    public void unlike()
    {
        if(likes > 0){likes--;}
    }

    /**
     * Add a comment of the user
     */
    public void addComment(String text){
        comments.add(text);
    }

    /**
     * @return the message
     */
    public String getText(){
        return message;
    }

    /**
     * @return the number to indicate the moment
     */
    public long getTimeStamp(){
        return timestamp;
    }

    /**
     * Print the post
     */
    public void display(){
        System.out.println("Autor: " + username);
        System.out.println();
        System.out.println(message);
        System.out.println(); 
        timeString(timestamp);
        System.out.println("Nº de likes: " + likes + ".");
        System.out.println();
        System.out.println("---------------- Comentarios --------------------");
        if(comments.isEmpty()){
            System.out.println("Este post no tiene ningún comentario de momento.");
        }
        else{
            for(String comment : comments){
                System.out.println(comment);
                System.out.println();
            }
        }
        System.out.println("###############################################################");
    }
    
    /**
     * @return devuelve los milisegundos en timeS
     */
    public String timeString(long time){
        long count = System.currentTimeMillis() - time;
        long totalSec = count / 1000;
        long min = totalSec / 60;
        long sec = totalSec % 60;
        return"Se posteo hace: " + min + " minutos y " + sec + " segundos.";        
    }
}
