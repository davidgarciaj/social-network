
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

    /**
     * Constructor for objects of class MessagePost
     */
    public Post(String user)
    {
        username = user;
        timestamp = System.currentTimeMillis();
        likes = 0;
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
     * @return the number to indicate the moment
     */
    public long getTimeStamp(){
        return timestamp;
    }

    /**
     * Print the post
     */
    public String toString(){
        return "\n---------------- Datos del Post --------------------\nAutor: " 
                + username + "\n" + "\n\n" + timeString(timestamp) + "\nNº de likes: "
                + likes + ".\n";
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

