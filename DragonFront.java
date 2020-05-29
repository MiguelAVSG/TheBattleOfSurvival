import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class d here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DragonFront extends Actor
{
    private int alter;
    private int numLacers;
    
    /**
     * Act - do whatever the d wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here   
        
    }  
    
    public void shotLacer()
    {

        
        Lacer lacer = new Lacer();
        Lacer lacer2 = new Lacer();

        int alter = (int) Math.floor(Math.random()*2);
         if(alter==0)
         {
             getWorld().addObject(lacer,800,345);
         }
         else if(alter==1)
         {
             getWorld().addObject(lacer2,970,580);
         }
        
        
        int alter2 = (int) Math.floor(Math.random()*2);
         if(alter2==0)
         {
             getWorld().addObject(lacer,800,345);
         }
         else if(alter2==1)
         {
             getWorld().addObject(lacer2,970,580);
         }
        

        
       
        
    
    }
    public int getLacers(){ return numLacers;
    }
}
