import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NextLevel3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NextLevel3 extends Actor
{
    private int vidas;
    private int puntaje;
   
    /**
     * Act - do whatever the NextLevel2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public NextLevel3(int vidas,int puntaje) 
    {
        this.vidas = vidas;
        this.puntaje = puntaje;
        
        
    }
    
    
    
    public void act(){
        
        if (Greenfoot.mouseClicked(this)){
             Greenfoot.setWorld(new Nivel3(vidas, puntaje));
        }
    }   
}
