import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    int position;
    int numBu;
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bullet(int direction){
        position=direction;
    }
    public void act() 
    {
        // Add your action code here.
        setImage("bullet"+numBu+".png");
        switch(position)
        {
           case 0: numBu=0;
                   setLocation(getX()+12,getY());
                   break;
           case 2: numBu=2;
                   setLocation(getX()+12,getY()-8);
                   break;
        }
        if(getX()>=getWorld().getWidth()-3 || (getX())<=3)
        {
         getWorld().removeObject(this);
        }
    }    
}
