import java.util.ArrayList;

/**
 * Write a description of class PhotoPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhotoPost
{
    private String username;
    private String filename;
    private String caption;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class PhotoPost
     */
    public PhotoPost(String author, String filename, String caption)
    {
        username = author;
        this.filename = filename;
        this.caption = caption;
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
     * Return the name of the file with the image
     */
    public String getImageFile(){
        return filename;
    }

    /**
     * @return the message
     */
    public String getCaption(){
        return caption;
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
        System.out.println(filename);
        System.out.println();
        System.out.println(caption);
        System.out.println(); 
        System.out.println(timeString(timestamp));
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
