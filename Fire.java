import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Fire extends Actor

    {
    private int yVelocity=3;
    private int yDirection=1;
    int dir;
    private int xVelocity=2;
    private int xDirection=1;
    private int indexCount;
    
    private GreenfootImage[] imagesF = new GreenfootImage [6];
    
   

    /**
     * Act - do whatever the fire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Fire (int dir){
        this.dir = dir;
        if(dir == 1)
        turn(0);
        else
        turn(0);
        
    }
    
    public void act() {
    
        // Add your action code here.
       int x= getX();
       int y= getY();
       
        setLocation(x, y + yVelocity * yDirection);
        if(isAtEdge()) {
        yDirection = yDirection *+1;
        
        
       } 
       Actor Jugador =(Actor) getOneObjectAtOffset(0,0, Jugador.class);
       if(isAtEdge()){
         getWorld().removeObject(this);
        }else
        
        if(Jugador != null)
        {
            MyWorld world= (MyWorld)getWorld();
            world.vidas.decrementar();
            world.puntos.decrementar();
            getWorld().removeObject(this);
            if(world.vidas.ObtenerValor()<=0){
               world.removeObject(Jugador);
               Greenfoot.setWorld(new GameOver());
            }
        }

          xDirection = xDirection *-1;
        
        
       }
         
}   

