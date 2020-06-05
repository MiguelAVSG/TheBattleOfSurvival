
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel2 extends Niveles
{
    
    
    PointsAndLife points;
    PointsAndLife lifes;
    PointsAndLife vidasenemigo;
    DragonFront dragonFront = new DragonFront();
    
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Nivel2(PointsAndLife lifes, PointsAndLife points)
    {    
        
        
        prepare();
        
        this.points = new PointsAndLife (points.counter , "Puntaje: ");
        this.lifes = new PointsAndLife(lifes.counter, "Vidas: ");
        vidasenemigo = new PointsAndLife(200, "Enemigo: ");
       
        addObject(points,150,85);
        addObject(lifes,150,115);
        addObject(vidasenemigo, 500, 85);
        
        PasarNivel();
        
          

    }
    

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
       
        addObject(dragonFront,910,400);
        
       
       
        
        
        
        
        
    }
    
    public void act(){
        PasarNivel();
    }
    
    
    
    
     
    public void PasarNivel(){
        if(vidasenemigo.getValue() == 100){
               
                
               removeObject(dragonFront);
                
                
                
                lifes.incrementLife();
                
                
                Greenfoot.setWorld(new SavedScreen2(lifes, points));
                
            
            }
       
    }
}
