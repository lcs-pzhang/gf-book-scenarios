import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    /**
     * Instance variables
     * Thwaw can be used anywhere in the class below.
     */
    //Will keep trach if a key is just pressed
    private boolean keyAlreadyDown;
    //Will contain the key and sound file that this instance of the class will play
    private String key;
    private String sound;
    private boolean whiteKey;

    /**
     * Create a new key.
     */
    public Key(String keyName, String soundFile, boolean isKeyWhite)
    {
        //No key has been pressed
        keyAlreadyDown = false;

        //Set the instance variable using parameters
        key = keyName;
        sound = soundFile;
        whiteKey = isKeyWhite;
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        //Animate the piano key being pressed
        //Condition 1 - is the "g" key being pressed
        //Condition 2 - the key was NOT already down
        if ( Greenfoot.isKeyDown(key) &&  !keyAlreadyDown)
        {
            //Key is down
            setImage("white-key-down.png");
            play();
            keyAlreadyDown = true;
        } else {
            //Key is down
            setImage("black-key-down.png");
            play();
            keyAlreadyDown = true;
        }

        //Stop showing the key being pressed.
        //Condtion 1 - The key was down the last time act() fired
        //Condition 2 = The "g" has been released (no longer pressed)

        if ( (keyAlreadyDown == true) && !Greenfoot.isKeyDown(key)) 
        {
            //Key is up
            setImage("white-key.png");
            keyAlreadyDown = false;
        } else {
            //Key is up
            setImage("black-key.png");
            keyAlreadyDown = false;
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

