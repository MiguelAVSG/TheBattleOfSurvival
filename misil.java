import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class misil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class misil extends Actor
{
    private int xVelocity=9;
    private int xDirection=-1;
    /**
     * Act - do whatever the misil wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        int x= getX();
        int y= getY();
        setLocation(x + xVelocity * xDirection,y);
        Actor Player = getOneObjectAtOffset(0,0, Player.class); 
        if(isAtEdge()){
         getWorld().removeObject(this);
        }else if(Player != null)
        {
            MyWorld world= (MyWorld)getWorld();
            world.lifes.decrement();
            world.points.decrement();
            getWorld().removeObject(this);
            if(world.lifes.getValue()<=0){
               world.removeObject(Player);
               Greenfoot.setWorld(new GameOver());
            }
        }
    }    
}
