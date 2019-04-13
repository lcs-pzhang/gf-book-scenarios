import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    /**
     * Instance variables
     * Thwaw can be used anywhere in the class below.
     */
    //Will keep trach if a key is just pressed
    private boolean keyAlreadyDown;

    /**
     * Create a new key.
     */
    public Key()
    {
        //No key has been pressed
        keyAlreadyDown = false;

    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        //Animate the piano key being pressed
        //Condition 1 - is the "g" key being pressed
        //Condition 2 - was the "g" key already down
        if ( Greenfoot.isKeyDown("g") &&  keyAlreadyDown == false )
        {
            //Key is down
            setImage("white-key-down.png");
            play();
            keyAlreadyDown = true;
        }
        
        //Stop showing the key being pressed.
        //Condtion 1 - The key was down the last time act() fired
        //Condition 2 = The "g" has been released (no longer pressed)
        
        if ( (keyAlreadyDown == true) && Greenfoot.isKeyDown("g") == false ) 
        {
            //Key is up
            setImage("white-key.png");
            keyAlreadyDown = false;
        }
    }

    /**
     * Play the note of this key
     */
    public void play()
    {
        Greenfoot.playSound("3a.wav");  
    }

}

