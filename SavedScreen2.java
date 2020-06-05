import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SavedScreen2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SavedScreen2 extends World
{

    PointsAndLife life;
    PointsAndLife points;
    /**
     * Constructor for objects of class SaveScreen.
     * 
     */
    public SavedScreen2(PointsAndLife life, PointsAndLife points)
    {    
        super(870, 550, 1);
        this.points = points;
        this.life = life;
         
        prepare();
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {int nivel = 3;
        SaveButton saveButton = new SaveButton(life.getValue(), points.getValue(), nivel);
        addObject(saveButton,225,477);
        NextLevel3 nextLevel3 = new NextLevel3(life.getValue(), points.getValue());
        addObject(nextLevel3,554,488);
       
        
        Play play = new Play();
        addObject(play,439,487);
        play.setLocation(471,485);
        removeObject(play);
    }
}
