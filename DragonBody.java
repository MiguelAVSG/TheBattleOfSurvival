import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DragonBody here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DragonBody extends Actor
{
    /**
     * Act - do whatever the DragonBody wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        shot();
    }
    
    public void shot()
    {
             int m=Greenfoot.getRandomNumber(200+1);
       if(m==1)
       {
          EnergyBall ball = new EnergyBall();
          getWorld().addObject(ball, 800 , 345);
       }else if(m==200){
           Lacer lacer = new Lacer();
           getWorld().addObject(lacer, 970 , 580);
        }
         
    } 
}
