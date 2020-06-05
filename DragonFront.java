import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class d here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DragonFront extends Actor
{
    private GreenfootSound lacerSound = new GreenfootSound("lacer.mp3");
    /**
     * Act - do whatever the d wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here   
        shotLacer();
    }  
    
    public void shotLacer()
    {
             int misilesRandom=Greenfoot.getRandomNumber(100+1);
             int posicionRandom=Greenfoot.getRandomNumber(2);
       if(misilesRandom==1)
       {
          Lacer lacer = new Lacer();
          Greenfoot.playSound("lacer.mp3");
          boolean disparollegofinal=false;
          if (disparollegofinal == false)
          switch(posicionRandom){
                     case 0: 
                             disparollegofinal = true;
                             getWorld().addObject(lacer, 780 , 345);
                             if (lacer.isAtEdge()){
                              disparollegofinal = false;
                             }
                             break;
                     case 1: 
                             disparollegofinal = true;
                             getWorld().addObject(lacer, 990 , 580);
                             if (lacer.isAtEdge()){
                              disparollegofinal = false;
                             } 
                             break;
                 }
          
       } 
         
    } 
}
