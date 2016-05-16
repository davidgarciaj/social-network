import java.util.ArrayList;

/**
 * Write a description of class Post here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Post
{
    private String username;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;    

    /**
     * Constructor for objects of class MessagePost
     */
    public Post(String user, boolean canComments)
    {
        username = user;
        timestamp = System.currentTimeMillis();
        likes = 0;
        if(canComments) comments = new ArrayList<>();
    }
    
    /**
     * @return username
     */
    public String getUsername(){
        return username;
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
        if(comments != null) comments.add(text);
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
        System.out.println(); 
        System.out.println(timeString(timestamp));
        System.out.println("Nº de likes: " + likes + ".");
        System.out.println();
        System.out.println("---------------- Comentarios --------------------");
        if(comments != null)
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
        System.out.println("###############################################################");
        System.out.println();
        System.out.println();
    }
    
    /**
     * @return devuelve los milisegundos en timeS
     */
    private String timeString(long time){
        long count = System.currentTimeMillis() - time;
        long totalSec = count / 1000;
        long min = totalSec / 60;
        long sec = totalSec % 60;
        return"Se posteo hace: " + min + " minutos y " + sec + " segundos.";        
    }
}

