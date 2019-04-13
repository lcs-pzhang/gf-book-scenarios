import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kölling
 * @version: 0.1
 */
public class Piano extends World
{
    /**
     * Instance variables
     * (we can use these anywhere in the class)
     */
    int frames;
    // create the array: list
    String[] peopleInClass = {"Julio", "Liam", "Dima", "Simon", "Eric", "Osman", 
            "Phillip", "Joven", "Nick", "Gordon", "Jieun", "Selena", "Jason", "Sam", 
            "Joe", "Jeff"};

    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);
        frames = 0;
    }

    /**
     * act
     * (gets called repeatedly to create animation)
     */
    public void act()
    {

        //Only say hello when we are in the bounds of the array
        if ( (frames % 60 == 0) && (frames / 60 < 10))
        {
            //Only show a message when we are in the bounds of the array
            showText("Array index is: " + frames / 60, 400, 250);

            //Say hello to everyone in class.
            showText("Hello " + peopleInClass[frames / 60], 400, 170); 
        }

        // Track frames
        frames += 1;
        //show the frames
        showText("" + frames, 100, 100);
    }
}