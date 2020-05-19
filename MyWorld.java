import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(1024, 600, 1); 
        prepare();
    }
    

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Jugador jugador = new Jugador();
        addObject(jugador,475,397);
        jugador.setLocation(488,455);
        DragonHead dragonHead = new DragonHead();
        addObject(dragonHead,490,78);
    }
}
