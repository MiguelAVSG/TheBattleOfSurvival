import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel3 extends Niveles
{

    /**
     * Constructor for objects of class Nivel3.
     * 
     */
    PointsAndLife points;
    PointsAndLife lifes;
    PointsAndLife vidasenemigo;
    DragonBody dragonBody = new DragonBody();
    
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Nivel3(int lifes, int points)
    {    
        
        
        prepare();
        
        this.points = new PointsAndLife (points , "Puntaje: ");
        this.lifes = new PointsAndLife(lifes, "Vidas: ");
        vidasenemigo = new PointsAndLife(200, "Enemigo: ");
       
        addObject(this.points,150,85);
        addObject(this.lifes,150,115);
        addObject(vidasenemigo, 500, 85);
        
        PasarNivel();
        
          

    }
    

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
        
        addObject(dragonBody,910,400);
        
       
       
        
        
        
        
        
    }
    
    public void act(){
        PasarNivel();
    }
    
    
    
    
     
    public void PasarNivel(){
        if(vidasenemigo.getValue() == 100){
               
                
               removeObject(dragonBody);
                
                
                
                
                
                
                Greenfoot.setWorld(new YouWin());
                
            
            }
       
    }
}
