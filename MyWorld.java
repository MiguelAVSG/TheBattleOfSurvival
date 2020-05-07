// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(800, 600, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Instrucciones instrucciones =  new Instrucciones();
        addObject(instrucciones, 402, 334);
        Records records =  new Records();
        addObject(records, 400, 406);
        Salir salir =  new Salir();
        addObject(salir, 399, 485);
        Titulo titulo =  new Titulo();
        addObject(titulo, 410, 97);
        play play =  new play();
        addObject(play, 392, 257);
    }
}
