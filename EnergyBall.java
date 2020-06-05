import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnergyBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnergyBall extends Actor
{
    private int xVelocity=5;
    private int xDirection=-1;
    private int yDirection= (int) (Math.random() * 8) + 1;
    
    /**
     * Act - do whatever the EnergyBall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x= getX();
        int y= getY();
        setLocation(x+ xVelocity * xDirection ,y + yDirection);
        Actor Player = getOneObjectAtOffset(0,0, Player.class);

        if(isAtEdge()){
         getWorld().removeObject(this);
        }else if(Player != null)
        {
            Nivel3 nivel3= (Nivel3)getWorld();
            nivel3.lifes.decrementdouble();
            nivel3.points.decrement();
            getWorld().removeObject(this);
            if(nivel3.lifes.getValue()<=0){
               nivel3.removeObject(Player);
               Greenfoot.setWorld(new GameOver());
            }
        }
    }    
}
