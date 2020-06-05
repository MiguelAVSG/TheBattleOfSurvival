import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

/**
 * Write a description of class PuntajeYVidas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PointsAndLife extends Actor
{
    /**
     * Act - do whatever the PuntajeYVidas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage image;
    private int counter;
    private String message;
    
    
    
    public PointsAndLife (int contador, String mensaje) 
    {
        this.counter = contador;
        this.message = mensaje;
        image = new GreenfootImage(250,150);
        image.setColor(new greenfoot.Color(200,0,0,255));
        image.setFont(new greenfoot.Font ("Verdana", 24));
        draw();
    }    
    
    public void draw()
    {
        image.clear();
        image.drawString(message+counter,20,20);
        setImage(image);
    }
    
    public void increment()
    {
        counter = counter+10;
        draw();
    }
    
    public void incrementLife(){
        counter++;
        draw();
    }
        
    public void decrement()
    {
        counter--;
        draw();
    }
    
    public void decrementdouble(){
        counter = counter - 2;
        draw();
    }
    
    public int getValue()
    {
        return counter;
    }
}
