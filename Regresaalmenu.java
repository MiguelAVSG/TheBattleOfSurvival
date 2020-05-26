import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Regresaalmenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Regresaalmenu extends Actor
{
    /**
     * Act - do whatever the Regresaalmenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your  code here.
        click();
    }    
    
    private void click(){
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Menu());
        }
    }
}
