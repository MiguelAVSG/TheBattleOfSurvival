import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NextLevel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NextLevel2 extends Actor
{
    private PointsAndLife vidas;
    private PointsAndLife puntaje;
   
    /**
     * Act - do whatever the NextLevel2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public NextLevel2(PointsAndLife vidas,PointsAndLife puntaje) 
    {
        this.vidas = vidas;
        this.puntaje = puntaje;
        
        
    }
    
    
    
    public void act(){
        
        if (Greenfoot.mouseClicked(this)){
             Greenfoot.setWorld(new Nivel2(vidas, puntaje));
        }
    }
    
}
