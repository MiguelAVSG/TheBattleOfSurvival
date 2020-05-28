import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class d here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DragonFront extends Actor
{
    int alter;
    
    /**
     * Act - do whatever the d wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here   
        
    }  
    
    public void shotLacer()
    {
        //int alter= (int) (Math.random() * 2) + 1;
        Lacer lacer = new Lacer();
        Lacer lacer2 = new Lacer();
        
        
                getWorld().addObject(lacer,700,345);
                getWorld().addObject(lacer2,750,550);
            
    
    }
}
