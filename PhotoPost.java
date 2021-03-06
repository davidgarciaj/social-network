import java.util.ArrayList;

/**
 * Write a description of class PhotoPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhotoPost extends PostWithComments
{
    private String filename;
    private String caption;

    /**
     * Constructor for objects of class PhotoPost
     */
    public PhotoPost(String author, String filename, String caption)
    {
        super(author);
        this.filename = filename;
        this.caption = caption;
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
     * Print the post
     */
    public String toString(){
        return "---------------- Photo Post --------------------\nNombre del archivo: " + filename 
            + "\nDescripcion: " + caption + "\nFrom:\n" +
            super.toString();
    }
}
