import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lacer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lacer extends DragonFront
{
    private int xVelocity=3;
    private int xDirection=-1;
    /**
     * Act - do whatever the Lacer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        int x= getX();
        int y= getY();
        setLocation(x + xVelocity * xDirection,y);
        
        if(isAtEdge()){
         getWorld().removeObject(this);
        }

    }    
}
