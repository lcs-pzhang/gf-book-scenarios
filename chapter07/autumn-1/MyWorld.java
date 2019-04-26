import greenfoot.*;

/**
 * Autumn. A world with some leaves.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class MyWorld extends World
{
    /**
     * Create the world and objects in it.
     */
    public MyWorld()
    {    
        super(600, 400, 1);
        setUp();
    }
    
    /**
     * Create the initial objects in the world.
     */
    private void setUp()
    {
        addObject(new Block(), 300, 200);
        addObject(new Leaf(), 100, 100);
        //Add 18 leaves
        for (int i = 1; 1 <= 18; i += 1)
        {
            Leaf aLeaf = new Leaf();
            
            int x = Greenfoot.getRandomNumber(400);
            int y = Greenfoot.getRandomNumber(400);
            
            addObject(aLeaf, x, y);
        }
    }
}
