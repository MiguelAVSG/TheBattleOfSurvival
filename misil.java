import greenfoot.*;  

public class Misil extends Actor
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
            Nivel3 nivel3= (Nivel3)getWorld();
            nivel3.lifes.decrement();
            nivel3.points.decrement();
            getWorld().removeObject(this);
            if(nivel3.lifes.getValue()<=0){
               nivel3.removeObject(Player);
               Greenfoot.setWorld(new GameOver());
            }
        }
    }    
}
