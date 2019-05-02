import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    /**
     * Instance variables
     * Thwaw can be used anywhere in the class below.
     */
    //Will keep trach if a key is just pressed
    private boolean isDown;
    //Will contain the key and sound file that this instance of the class will play
    private String key;
    private String sound;
    private boolean isKeyWhite;

    /**
     * Create a new key.
     */
    public Key(String keyName, String soundFile, boolean KeyWhite)
    {
        //No key has been pressed
        isDown = false;

        //Set the instance variable using parameters
        key = keyName;
        sound = soundFile;
        isKeyWhite = KeyWhite;

        if ( isKeyWhite == false)
        {
            setImage("black-key.png");
        }
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        //Animate the piano key being pressed
        //Condition 1 - is the "g" key being pressed
        //Condition 2 - the key was NOT already down
        if ( isDown == false && Greenfoot.isKeyDown(key) == true)
        {
            //Key is down
            keyDown();
            play();
            isDown = true;
        } 

        //Stop showing the key being pressed.
        //Condtion 1 - The key was down the last time act() fired
        //Condition 2 = The "g" has been released (no longer pressed)

        if ( isDown == true && Greenfoot.isKeyDown(key) == false) 
        {
            //Key is up
            keyUp();
            isDown = false;
        } 

    }

    /**
     * PLay the note of this key
     */
    private void keyDown()
    {
        if ( isKeyWhite == true)
        {
            setImage("white-key-down.png");
        }
        else
        {
            setImage("black-key-down.png");
        }
    }

    /**
     * PLay the note of this key
     */
    private void keyUp()
    {
        if ( isKeyWhite == true)
        {
            setImage("white-key-down.png");
        }
        else
        {
            setImage("black-key-down.png");
        }
    }

    /**
     * Play the note of this key
     */
    public void play()
    {
        Greenfoot.playSound(sound + ".wav");  
    }
}

