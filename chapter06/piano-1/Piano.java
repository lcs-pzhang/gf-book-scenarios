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
    //First one traks the keyboard keys that we'll use for white piano keys
    String[] whiteKeys = {"a", "s", "d", "f", "g", "h", "j", "k", "l", ";",
            "'", "\\" };
    //Second array tracks the sound files for each note
    String[] whiteNotes = {"3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c",
            "4d", "4e", "4f", "4g"};
            
    // create the array: This one is for the black keys
    String[] blackKeys = {"3c#", "3d#", "", "3f#", "3g#", "3a#", 
            "", "4c#", "4d#", "", "4f#", ""};
    // This one for the soundfiles for the black keys
    String[] blackNotes = {"3w", "3e", "", "3t", "3y", "3u", "", "3o", "3p",
        "", "3]", ""};

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
        //array
        int position = frames / 60;
        //Every FULL SECOND when the position is less than count of items in
        //the array
        if ( (frames % 60 == 0) && (position < whiteKeys.length))
        {
            //Only show a message when we are in the bounds of the array
            showText("Array index is: " + position, 400, 250);
            
            //Create an object to add to the world
            Key aKey = new aKey(whiteKeys[position], whiteNotes[position]);
            //NOw actually add the object to the world
            //Object to add, horizontal position, vertical position
            addObject(aKey, 54 + position * 63, 140);
        }
        
        if ( (frames % 60 == 0) && (position < blackKeys.length))
        {
          //Create an object to add to the world
            Key aKey = new aKey(blackKeys[position], blackNotes[position]);
            //NOw actually add the object to the world
            //Object to add, horizontal position, vertical position
            addObject(aKey, 85 + position * 63, 86);
          
        }
        
        
        // Track frames
        frames += 1;
        //show the frames
        //showText("" + frames, 100, 100);
    }
}