import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fire extends DragonHead
{
    private int xVelocity=2;
    private int xDirection=1;
    /**
     * Act - do whatever the fire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
       int x= getX();
       int y= getY();
       
        setLocation(x + xVelocity * xDirection,y);
        if(isAtEdge()) {
        xDirection = xDirection *-1;
        
        
       }
    }    
}
