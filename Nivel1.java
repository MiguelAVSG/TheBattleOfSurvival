import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel1 extends Niveles
{
    
    
    
    PointsAndLife points;
    PointsAndLife lifes;
    PointsAndLife vidasenemigo;
    DragonHead dragonHead = new DragonHead();
    
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Nivel1()
    {    

        
        prepare();
        
        points = new PointsAndLife (0, "Puntaje: ");
        lifes = new PointsAndLife(5, "Vidas: ");
        vidasenemigo = new PointsAndLife(300, "Enemigo: ");
       
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
        
        
        addObject(dragonHead,490,78);
        
       
       
        
        
        
        
        
    }
    
    public void act(){
        PasarNivel();
    }
    
    
    
    public void PasarNivel(){
        
        if(vidasenemigo.getValue()==200){

                removeObject(dragonHead);
                
                
                
                lifes.incrementLife();
                
                
                Greenfoot.setWorld(new SaveScreen(lifes, points));
                
                
                
            } 
    }
    
}
