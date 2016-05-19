import java.util.ArrayList;
/**
 * Write a description of class Comments here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PostWithComments extends Post
{
    // instance variables - replace the example below with your own
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class Comments
     */
    public PostWithComments(String author)
    {
        super(author);
        comments = new ArrayList<>();
    }

    /**
     * Add a comment of the user
     */
    public void addComment(String text){
        comments.add(text);
    }

    /**
     * Print the post
     */
    public String toString(){
        String cadena = super.toString() + "\n---------------- Comentarios --------------------\n"
            + "###############################################################";
        if(comments.isEmpty()){
            cadena += "\nEste post no tiene ningún comentario de momento.";
        }
        else{
            for(String comment : comments){
                cadena += "\n" + comment + "\n";
            }
        }
        cadena += "\n###############################################################\n";
        return cadena;
    }
}
