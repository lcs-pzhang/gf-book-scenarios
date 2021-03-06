import greenfoot.*; 
// In order to use a List in Java, we must import it.
import java.util.List;

/**
 * A block that bounces back and forth across the screen.
 * 
 * @author Michael Kölling
 * @version 1.0
 */
public class Block extends Actor
{
    private int delta = 2;
    
    /**
     * Move across the screen, bounce off edges. Turn leaves, if we touch any.
     */
    public void act() 
    {
        move();
        checkEdge();
        checkLeaf();
        checkMouseClick();
    }
    
    /**
     * Move sideways, either left or right.
     */
    private void move()
    {
        setLocation(getX()+delta, getY());
    }
    
    /**
     * Check whether we are at the edge of the screen. If we are, turn around.
     */
    private void checkEdge()
    {
        if (isAtEdge()) 
        {
            delta = -delta;
        }
    }
    
    /**
     * Check whether the mouse button was clicked. If it was, change all leaves.
     */
    private void checkMouseClick()
    {
        if (Greenfoot.mouseClicked(null)) 
        {
            // When null is the argument, Greenfoot respons to a mouse click
            //anywhere on the screen.
            //When this is the arguemnt, Greenfoot respons to a mouse click
            //only on the block.
            
            // 1. Get an object reference
            
            World myWorld = getWorld();
            
            //2. Get a list that has object references to all the leaf objects
            //in the world
            // TYPE     NAME            CLASS THAT WE NEED OBJECTS OF
            
            List<Leaf> leaves = myWorld.getObjects(Leaf.class); 
            
            //3. Itereate thorugh the list of leaf objects
            //Each loop will provide an object reference.
            // "For each leaf in the leaves list..."
            
            for (Leaf leaf : leaves)
            {
                leaf.changeImage();
            }
        }
    }
    
    /**
     * Check whether we're touching a leaf. If we are, turn it a bit.
     */
    private void checkLeaf()
    {
        Leaf leaf = (Leaf) getOneIntersectingObject(Leaf.class);
        
        if (leaf != null) {
            leaf.turn(9);
        }
    }
}
