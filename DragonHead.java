import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DragonHead here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DragonHead extends Actor
{
    private int Vitalidad = 3;
    private int xVelocity=7;
    private int xDirection=1;
    private GreenfootSound fireSound = new GreenfootSound("Firedragon.mp3");
   
   
    
    /**
     * Act - do whatever the DragonHead wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here
        int x= getX();
        int y= getY();
        setLocation(x + xVelocity * xDirection,y);
        if(isAtEdge()) {
           xDirection = xDirection *-1;
        
        
       }
       
       fireShot();
    }
         
    public void fireShot(){
           int fuegoRandom=Greenfoot.getRandomNumber(80);
       if(fuegoRandom==1)
       {
          Fire fire = new Fire(2);
          Greenfoot.playSound("Firedragon.mp3");
          getWorld().addObject(fire, getX() , getY()-1);
       }
           
        }
        
        
}
    
   


