import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PantallaInstrucciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PantallaInstrucciones extends World
{

    /**
     * Constructor for objects of class PantallaInstrucciones.
     * 
     */
    public PantallaInstrucciones()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Regresaalmenu regresarMenu = new Regresaalmenu();
        addObject(regresarMenu,661,436);
    }
}
