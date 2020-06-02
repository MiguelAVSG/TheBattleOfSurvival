;import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    MyWorld world;
    GreenfootSound mainMusic = new GreenfootSound("maintheme.mp3");
    PointsAndLife points;
    PointsAndLife lifes;
    LifeEnemy lifeEnemy;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    

        super(1024, 600, 1); 
        prepare();
        
        points =new PointsAndLife (0, "Puntaje ");
        lifes =new PointsAndLife(5, "Vidas ");
        Greenfoot.delay(50);
        addObject(points,150,85);
        addObject(lifes,150,115);

        
          

    }
    

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,475,397);
        player.setLocation(488,455);
        DragonHead dragonHead = new DragonHead();
        addObject(dragonHead,490,78);

        

       
        lifeEnemy = new LifeEnemy(300,0,0,20);

        addObject(lifeEnemy,750,85);
        
        
        
        
    }
    public void act(){
     mainMusic.playLoop();
    }
    public void borrarvida(){
        world.removeObject(lifeEnemy);
    }

    
}
