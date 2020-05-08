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
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Titulo titulo = new Titulo();
        addObject(titulo,403,79);

        Play play = new Play();
        addObject(play,405,265);
        Records records = new Records();
        addObject(records,406,350);
        Instrucciones instrucciones = new Instrucciones();
        addObject(instrucciones,407,434);
        Salir salir = new Salir();
        addObject(salir,409,515);
    }
}
