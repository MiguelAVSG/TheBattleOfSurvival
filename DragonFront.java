import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class d here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DragonFront extends Actor
{
    
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
             int m=Greenfoot.getRandomNumber(120+1);
             int n=Greenfoot.getRandomNumber(2);
       if(m==1)
       {
          Lacer lacer = new Lacer();
          boolean disparollegofinal=false;
          if (disparollegofinal == false)
          switch(n){
                     case 0: 
                     disparollegofinal = true;
                     getWorld().addObject(lacer, 800 , 345);
                     if (lacer.isAtEdge()){
                         disparollegofinal = false;
                     }
                             break;
                     case 1: 
                     disparollegofinal = true;
                     getWorld().addObject(lacer, 970 , 580);
                     if (lacer.isAtEdge()){
                         disparollegofinal = false;
                     }
                             break;
                 }
          
       } 
         
    } 
}
