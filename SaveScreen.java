import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SaveScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SaveScreen extends World
{
    private PointsAndLife life;
    private PointsAndLife points;
    /**
     * Constructor for objects of class SaveScreen.
     * 
     */
    public SaveScreen(PointsAndLife life, PointsAndLife points)
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
    {
        SaveGame saveGame = new SaveGame();
        addObject(saveGame,225,477);
        NextLevel2 nextLevel = new NextLevel2(life, points);
        addObject(nextLevel,554,488);
       
        saveGame.setLocation(140,498);
        saveGame.setLocation(124,503);
        Play play = new Play();
        addObject(play,439,487);
        play.setLocation(471,485);
        removeObject(play);
        
    }
}
