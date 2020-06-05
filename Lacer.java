import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lacer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lacer extends Actor
{
    private int xVelocity=6;
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
        
        DañoPersonaje();
    }    
    
    private void DañoPersonaje(){
           Actor Player =(Actor) getOneObjectAtOffset(0,0, Player.class);
       if(isAtEdge()){
         getWorld().removeObject(this);
        }else
        
        if(Player != null)
        {
            Nivel2 nivel2 = (Nivel2)getWorld();
            nivel2.lifes.decrement();
            nivel2.points.decrement();
            getWorld().removeObject(this);
            if(nivel2.lifes.getValue()<=0){
               nivel2.removeObject(Player);
               Greenfoot.setWorld(new GameOver());
            }
        }
        }
}
