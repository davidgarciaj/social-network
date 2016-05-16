import java.util.ArrayList;
/**
 * Write a description of class Comments here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comments
{
    // instance variables - replace the example below with your own
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class Comments
     */
    public Comments()
    {
        comments = new ArrayList<>();
    }

    /**
     * Add a comment of the user
     */
    public void addComment(String text){
        comments.add(text);
    }
    
    /**
     * 
     */
    public void printComments(){
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
    }
}
