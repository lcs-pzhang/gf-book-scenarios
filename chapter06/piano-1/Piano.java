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
    private String[] whiteKeys = {"a", "s", "d", "f", "g", "h", "j", "k", "l", ";",
            "'", "\\" };
    //Second array tracks the sound files for each note
   private String[] whiteNotes = {"3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c",
            "4d", "4e", "4f", "4g"};

    // create the array: This one is for the black keys
   private String[] blackKeys = {"3c#", "3d#", "", "3f#", "3g#", "3a#", 
            "", "4c#", "4d#", "", "4f#", ""};
    // This one for the soundfiles for the black keys
   private String[] blackNotes = {"3w", "3e", "", "3t", "3y", "3u", "", "3o", "3p",
            "", "3]", ""};

    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);
        frames = 0;

        // First draw all of the white piano keys on the screen
        for (int index = 0; index < whiteKeys.length; index +=1)
        {
            // Create a new object
            Key newKey = new Key(whiteKeys[index], whiteNotes[index], true);

            //Add the key object to the scenario
            addObject(newKey, 54 + 63 * index, 140);
        }

        //Now draw all of the black piano keys on the screen
        for (int index = 0; index < blackKeys.length; index +=1)
        {
            //Only add a black key if there is a computer keyboard key
            //Set in the blackKeys array at this index
            if (blackKeys[index] !="")
            {
                //Create a new black key object
                Key newKey = new Key(blackKeys[index], blackNotes[index], false);

                //Add the key object to the scenario
                addObject(newKey, 85 + 63 * index, 86);
            }
        }

    }
    
}
