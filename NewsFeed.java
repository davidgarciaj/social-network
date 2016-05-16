import java.util.ArrayList;

/**
 * Write a description of class NewsFeed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewsFeed
{
    private ArrayList<Post> posts;

    /**
     * Constructor for objects of class NewsFeed
     */
    public NewsFeed()
    {
        posts = new ArrayList<>();
    }

    /**
     * Add a post with a message
     * 
     * @message the message to introduce
     */
    public void addPost(Post post)
    {
        posts.add(post);
    }
    
    /**
     * Show the post
     */
    public void show(){
        for(Post post : posts){
            post.display();
        }
    }
}
