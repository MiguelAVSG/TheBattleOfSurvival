import greenfoot.*; 

public class Lacer extends Actor
{
    private int xVelocity=6;
    private int xDirection=-1;
    
    public void act() 
    {
        int x= getX();
        int y= getY();
        setLocation(x + xVelocity * xDirection,y);
        DañoPersonaje();
    }    
    
    private void DañoPersonaje(){
           Actor Player =(Actor) getOneObjectAtOffset(0,0, Player.class);
       if(isAtEdge()){
         getWorld().removeObject(this);
        }else if(Player != null)
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
