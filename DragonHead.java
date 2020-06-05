import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class DragonHead extends Actor
{
    private int Vitalidad = 3;
    private int xVelocity=7;
    private int xDirection=1;
    private GreenfootSound fireSound = new GreenfootSound("Firedragon.mp3");
   
    public void act() 
    {
        
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
    
   


